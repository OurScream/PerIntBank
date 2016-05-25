package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import perinfo.perinfoDAO;
import perinfo.person;

public class Per_info_to extends HttpServlet {



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		person son=new person();
	
		HttpSession session = request.getSession();
		String s =(String)session.getAttribute("PerIntBankUserId");
		System.out.println(s);
//		Cookie cookies[]=request.getCookies(); 
//		Cookie sCookie=null; 
//		for(int i=0;i<cookies.length-1;i++){    //用一个循环语句遍历刚才建立的Cookie对象数组
//	
//			sCookie=cookies[i];
//		}
		
		son.setZjid(s);
		try {
			perinfoDAO fodao=new perinfoDAO();
			son =fodao.find(son);
			System.out.println(fodao.find(son));
			request.setAttribute("son", son);
			request.getRequestDispatcher("perxxb.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		

	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);

	}

	
}
