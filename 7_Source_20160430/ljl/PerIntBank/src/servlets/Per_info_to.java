package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		Cookie cookies[]=request.getCookies(); 
		Cookie sCookie=null; 
		for(int i=0;i<cookies.length-1;i++){    //��һ��ѭ���������ղŽ�����Cookie��������
	
			sCookie=cookies[i];
		}
		
		son.setZjid(sCookie.getValue());
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
