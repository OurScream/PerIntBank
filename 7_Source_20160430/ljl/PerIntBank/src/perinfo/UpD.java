package perinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
		String jmm =request.getParameter("jmm");
		String khdlmm =request.getParameter("khdlmm");
		String khdlmm1 =request.getParameter("khdlmm1");
		System.out.println(zjid);
		System.out.println(khdlmm);
		person stu =new person();
		stu.setZjid(zjid);
		stu.setKhdlmm(khdlmm);
		System.out.println(stu);
		System.out.println(stu.getZjid());
		System.out.println(stu.getKhdlmm());
		
		Cookie cookies[]=request.getCookies(); //读出用户硬盘上的Cookie，并将所有的Cookie放到一个cookie对象数组里面
		Cookie sCookie=null; 
		for(int i=0;i<cookies.length-1;i++){    //用一个循环语句遍历刚才建立的Cookie对象数组
		sCookie=cookies[i];   //取出数组中的一个Cookie对象
		if(sCookie!=null){
		   
		    System.out.println( sCookie.getValue()+"scookie");
		      }
		   }
		if(sCookie.getValue().equals(zjid)){
		perinfoDAO idao =new perinfoDAO();
		try {
			person s=new person();
			s =idao.find(stu);
			s.getKhdlmm();
			System.out.println(s.getKhdlmm()+"mmmmmmmmmmmmmmmmmmmm");
			if(s.getKhdlmm().equals(jmm)){
				System.out.println("旧密码与原密码相符");
				if(khdlmm.equals(khdlmm1)){
					try {
						
						idao.update(stu);
						request.getRequestDispatcher("success.jsp").forward(request, response);
					    System.out.println("heloo  ok");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else{
					request.getRequestDispatcher("error.jsp").forward(request, response);
				    System.out.println("俩次密码不一致");
				}
			}
			else{
				request.getRequestDispatcher("error.jsp").forward(request, response);
				System.out.println("旧密码与原密码不相符");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		try {
//			
//			idao.update(stu);
//			request.getRequestDispatcher("success.jsp").forward(request, response);
//		    System.out.println("heloo  ok");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		}
		else{
			request.getRequestDispatcher("error.jsp").forward(request, response);
			 System.out.println("不能修改");
		}
	
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}



}
