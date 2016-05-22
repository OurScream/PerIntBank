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

		//��ȡ�������ݣ��ж�Ӳ������
		String sfzh = request.getParameter("sfzh"); 							//��ȡ���֤��
		String skzh = request.getParameter("skzh"); 							//skzh:�տ��˻�
		String skrxm= request.getParameter("skrxm"); 							//�տ�������
		double zzje = Double.parseDouble(request.getParameter("zzje")); 		//ת�˽��
//		String zfzh = request.getParameter("zfzh"); 							//֧���˻�


		
		String outputStr = null; 												//�����Ϣ
		
		if(skzh.length() != 1)								//����Ҫ��
		{
			outputStr = "�˻����벻��ȷ";
		}
		
		//��ȡ���ݿ����ݣ�����DAOģʽ��
		ZZDAO ServDAO = new ZZDAO(); 
		ZZTable setTable = new ZZTable();
		ZZTable getTable = new ZZTable();
		
		setTable.setsfzh(sfzh); 											//���֤�ţ�
		setTable.setskzh(skzh);
		setTable.setskrxm(skrxm);
		setTable.setzzje(zzje);
//		setTable.setzfzh(zfzh); 												//Ĭ��ʹ�õ�һ����Ҫ�����ݿ��ȡ��

		//��ѯ���ݿ���Ϣ
		try {
			getTable = ServDAO.find(setTable);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String getsfzh = sfzh; //setTable.getsfzh(); 			//////
		String getskzh = skzh; //setTable.getskzh(); 			// ��ȡ�տ��ʺ�
		double getzzje = zzje; //setTable.getzzje(); 			//ת�˽��
		String getskrxm = getTable.getskrxm(); 			//��ȡ�տ�������
		double getzhye = getTable.getzhye(); 			//֧���˻����˻����
		String getzfzh = getTable.getzfzh();  			//��ѯ����֧���˻�
		System.out.println("+++++++++++++++++++++++++++++++++++++++++"+getsfzh + "+" + getskzh +"+"+ getskrxm+"+"+getzhye+"+"+getzfzh+"++++++++++++++++++++++++++++++++++++++++++++++++++");
		
				
		//�Ƚ��Լ��Ľ���Ҫת�Ľ�������ߴ���ǰ�ߣ���ʾ������Ϣ��
//		if(!skzh.equals(getskzh) || !skrxm.equals(getskrxm))
		if(!skrxm.equals(getskrxm))
		{
			outputStr = "�տ�����Ϣ����!";
			//ת����ʾ�������
			request.setAttribute("outputMessage", outputStr);
			request.getRequestDispatcher("Zhuanzhang/zzoutput.jsp").forward(request, response);
			return;
		}
		
		if (getzfzh == null)
		{
			outputStr = "֧���˻���Ч";
			//ת����ʾ�������
			request.setAttribute("outputMessage", outputStr);
			request.getRequestDispatcher("Zhuanzhang/zzoutput.jsp").forward(request, response);
			return;
		}
		
		if(getzhye < zzje)
		{
			outputStr = "�˻����㣡";
			//ת����ʾ�������
			request.setAttribute("outputMessage", outputStr);
			request.getRequestDispatcher("Zhuanzhang/zzoutput.jsp").forward(request, response);
			return;
		}
		
		
		//û�д���д�����ݿ�
		//��Ҫ�Ĳ������տ��˻���֧���˻�����
		getTable.setskzh(getskzh);
		getTable.setzfzh(getzfzh);
		getTable.setzzje(getzzje);
		try {
			ServDAO.ZzWriteSQL(getTable);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ת����ʾ�������
		outputStr = "ת�˳ɹ�";
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
