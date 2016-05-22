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
		
		
		//����cookie�� ����session
		if (getuserid != null) 
		{
			Cookie usercookie = new Cookie("PerIntBankUserId", getuserid); 
			usercookie.setMaxAge(900); 			 				//900s=15min
			response.addCookie(usercookie); 					//����cookie���ͻ���
			session.setAttribute("PerIntBankUserId", getuserid); 			//���û����浽session��Χ������Ȩ�޼�顣
			System.out.println("PerIntBankUserId = " + usercookie.getValue());
//			response.sendRedirect("main.html");
		}
		
		//��ѯ���ݿ⣬����ͻ���Ϣ�����д˿ͻ������¼�ɹ���������ݵ��ѵ�¼����������ɣ�
		LoginUser PushLoginUser = new LoginUser();
		LoginDAO checkDAO = new LoginDAO();
		LoginUser retUser = new LoginUser();
		String outputStr = null;
		String forwardfile = null;
		
		PushLoginUser.setzjid(getuserid);
		PushLoginUser.setkhdlmm(getuserpwd);
		
		//��ѯ
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
			outputStr = "�û�δע�ᣡ";
			forwardfile = "Login/weizhuce.html";
		}
		else
		{
			if(!getuserpwd.equals(retUser.getkhdlmm()))
			{
				outputStr = "�ʺŻ��������";
				forwardfile = "Login/errorpwd.html";

				//������¼
			}
			else{
				outputStr = "��¼�ɹ���"; 				//�ɲ���ʾֱ������������
				forwardfile = "main.html";

				//������ҳ�� -----------�����½����ݿ��¼����δʵ�֣���
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
