package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import perinfo.perinfoDAO;
import perinfo.person;
import javax.servlet.http.Cookie;
public class Per_info extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	
	try {
		perinfoDAO dao=new perinfoDAO();
		List<person> per=dao.findAll();
		
		
	request.setAttribute("per", per);
request.getRequestDispatcher("khxx.jsp").forward(request, response);
				
			

		
		
		
//		request.getRequestDispatcher("khxx.jsp").forward(request, response);
		
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
