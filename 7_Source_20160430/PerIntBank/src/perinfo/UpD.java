package perinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UpD extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String sss =(String)session.getAttribute("PerIntBankUserId");
		
//		String zjid =request.getParameter("zjid");
		String jmm =request.getParameter("jmm");
		String khdlmm =request.getParameter("khdlmm");
		String khdlmm1 =request.getParameter("khdlmm1");
//		System.out.println(zjid);
		System.out.println(khdlmm);
		person stu =new person();
		stu.setZjid(sss);
		stu.setKhdlmm(khdlmm);
		System.out.println(stu);
		System.out.println(stu.getZjid());
		System.out.println(stu.getKhdlmm());
		
//		Cookie cookies[]=request.getCookies(); //�����û�Ӳ���ϵ�Cookie���������е�Cookie�ŵ�һ��cookie������������
//		Cookie sCookie=null; 
//		for(int i=0;i<cookies.length-1;i++){    //��һ��ѭ���������ղŽ�����Cookie��������
//		sCookie=cookies[i];   //ȡ�������е�һ��Cookie����
//		if(sCookie!=null){
//		   
//		    System.out.println( sCookie.getValue()+"scookie");
//		      }
//		   }
		
		
		perinfoDAO idao =new perinfoDAO();
		try {
			person s=new person();
			s =idao.find(stu);
			s.getKhdlmm();
			System.out.println(s.getKhdlmm()+"mmmmmmmmmmmmmmmmmmmm");
			if(s.getKhdlmm().equals(jmm)){
				System.out.println("��������ԭ�������");
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
				    System.out.println("�������벻һ��");
				}
			}
			else{
				request.getRequestDispatcher("error.jsp").forward(request, response);
				System.out.println("��������ԭ���벻���");
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
	


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request,response);
	}



}
