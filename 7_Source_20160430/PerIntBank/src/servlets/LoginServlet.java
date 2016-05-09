package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logincontrol.LoginUser;
import logincontrol.LoginDAO;

public class LoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public LoginServlet() {
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

		String getuserid = request.getParameter("userid"); 		//
		String getuserpwd = request.getParameter("userpwd");
		System.out.println("getuserid="+getuserid+"getuserpwd" +getuserpwd+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		HttpSession session = request.getSession();
		System.out.println("session="+session+"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		//保存cookie。 操作session
		if (getuserid != null) 
		{
			Cookie usercookie = new Cookie("PerIntBankUserId", getuserid); 
			usercookie.setMaxAge(900); 			 				//900s=15min
			response.addCookie(usercookie); 					//保存cookie到客户端
			session.setAttribute("PerIntBankUserId", getuserid); 			//将用户名存到session范围内用于权限检查。
			System.out.println("PerIntBankUserId = " + usercookie.getValue());
//			response.sendRedirect("main.html");
		}
		
		//查询数据库，如果客户信息表中有此客户，则登录成功（添加数据到已登录表？？？待完成）
		LoginUser PushLoginUser = new LoginUser();
		LoginDAO checkDAO = new LoginDAO();
		LoginUser retUser = new LoginUser();
		String outputStr = null;
		String forwardfile = null;
		
		PushLoginUser.setzjid(getuserid);
		PushLoginUser.setkhdlmm(getuserpwd);
		
		//查询
		try {
			retUser = checkDAO.CheckUser(PushLoginUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++zjid =" + retUser.getzjid() + "+++++++++++++++++++++++++++");
		System.out.println("+++++++++++++++++++++++++++++++++khdlmm =" + retUser.getkhdlmm() + "+++++++++++++++++++++++++++");


		if (retUser.getkhdlmm() == null)
		{
			outputStr = "用户未注册！";
			forwardfile = "Login/weizhuce.html";
		}
		else
		{
			if(!getuserpwd.equals(retUser.getkhdlmm()))
			{
				outputStr = "帐号或密码错误";
				forwardfile = "Login/errorpwd.html";

				//跳到登录
			}
			else{
				outputStr = "登录成功！"; 				//可不显示直接跳到主界面
				forwardfile = "main.html";

				//跳到主页面 -----------这里新建数据库登录表！【未实现！】
			}
		}
		
		request.setAttribute("outputMessage", outputStr);
		request.getRequestDispatcher(forwardfile).forward(request, response);
		return;
		
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
