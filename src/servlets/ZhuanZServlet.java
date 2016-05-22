package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zzcontrol.ZZDAO;
import zzcontrol.ZZTable;

public class ZhuanZServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ZhuanZServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//获取输入内容，判断硬性条件
		String sfzh = request.getParameter("sfzh"); 							//获取身份证号
		String skzh = request.getParameter("skzh"); 							//skzh:收款账户
		String skrxm= request.getParameter("skrxm"); 							//收款人姓名
		double zzje = Double.parseDouble(request.getParameter("zzje")); 		//转账金额
//		String zfzh = request.getParameter("zfzh"); 							//支付账户


		
		String outputStr = null; 												//输出信息
		
		if(skzh.length() != 1)								//这里要改
		{
			outputStr = "账户号码不正确";
		}
		
		//获取数据库内容，利用DAO模式。
		ZZDAO ServDAO = new ZZDAO(); 
		ZZTable setTable = new ZZTable();
		ZZTable getTable = new ZZTable();
		
		setTable.setsfzh(sfzh); 											//身份证号！
		setTable.setskzh(skzh);
		setTable.setskrxm(skrxm);
		setTable.setzzje(zzje);
//		setTable.setzfzh(zfzh); 												//默认使用第一个，要在数据库获取。

		//查询数据库信息
		try {
			getTable = ServDAO.find(setTable);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String getsfzh = sfzh; //setTable.getsfzh(); 			//////
		String getskzh = skzh; //setTable.getskzh(); 			// 获取收款帐号
		double getzzje = zzje; //setTable.getzzje(); 			//转账金额
		String getskrxm = getTable.getskrxm(); 			//获取收款人姓名
		double getzhye = getTable.getzhye(); 			//支付账户的账户余额
		String getzfzh = getTable.getzfzh();  			//查询到的支付账户
		System.out.println("+++++++++++++++++++++++++++++++++++++++++"+getsfzh + "+" + getskzh +"+"+ getskrxm+"+"+getzhye+"+"+getzfzh+"++++++++++++++++++++++++++++++++++++++++++++++++++");
		
				
		//比较自己的金额和要转的金额，如果后者大于前者，显示出错信息。
//		if(!skzh.equals(getskzh) || !skrxm.equals(getskrxm))
		if(!skrxm.equals(getskrxm))
		{
			outputStr = "收款人信息有误!";
			//转到显示结果界面
			request.setAttribute("outputMessage", outputStr);
			request.getRequestDispatcher("Zhuanzhang/zzoutput.jsp").forward(request, response);
			return;
		}
		
		if (getzfzh == null)
		{
			outputStr = "支付账户无效";
			//转到显示结果界面
			request.setAttribute("outputMessage", outputStr);
			request.getRequestDispatcher("Zhuanzhang/zzoutput.jsp").forward(request, response);
			return;
		}
		
		if(getzhye < zzje)
		{
			outputStr = "账户余额不足！";
			//转到显示结果界面
			request.setAttribute("outputMessage", outputStr);
			request.getRequestDispatcher("Zhuanzhang/zzoutput.jsp").forward(request, response);
			return;
		}
		
		
		//没有错误，写入数据库
		//必要的参数，收款账户，支付账户，金额。
		getTable.setskzh(getskzh);
		getTable.setzfzh(getzfzh);
		getTable.setzzje(getzzje);
		try {
			ServDAO.ZzWriteSQL(getTable);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//转到显示结果界面
		outputStr = "转账成功";
		request.setAttribute("outputMessage", outputStr);
		request.getRequestDispatcher("Zhuanzhang/zzoutput.jsp").forward(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
