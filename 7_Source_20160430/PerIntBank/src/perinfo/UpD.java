package perinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpD extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String zjid =request.getParameter("zjid");
		String khdlmm =request.getParameter("khdlmm");
		System.out.println(zjid);
		System.out.println(khdlmm);
		person stu =new person();
		stu.setZjid(zjid);
		stu.setKhdlmm(khdlmm);
		System.out.println(stu);
		System.out.println(stu.getZjid());
		System.out.println(stu.getKhdlmm());
		perinfoDAO idao =new perinfoDAO();
		try {
			 System.out.println("heloo  ok");
			
			idao.update(stu);
			
		    System.out.println("heloo  ok");
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
