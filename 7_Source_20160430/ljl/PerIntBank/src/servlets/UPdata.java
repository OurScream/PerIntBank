package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import perinfo.perinfoDAO;
import perinfo.person;

public class UPdata extends HttpServlet {



	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
        request.setCharacterEncoding("UTF-8");
		String zjid =request.getParameter("zjid");
		String khxm =request.getParameter("khxm");
		String csrq =request.getParameter("csrq");
		String hyzk =request.getParameter("hyzk");
		String ssmz =request.getParameter("ssmz");
		String zjlx =request.getParameter("zjlx");
		String zjqsrq =request.getParameter("zjqsrq");
		String zjjzrq =request.getParameter("zjjzrq");
		String khxb =request.getParameter("khxb");
		String khgj =request.getParameter("khgj");
		String yddh =request.getParameter("yddh");
		String gddh =request.getParameter("gddh");
		String jtdz =request.getParameter("jtdz");
		String jtyb =request.getParameter("jtyb");
		
		person per=new person();
		per.setZjid(zjid);
		per.setKhxm(khxm);
	    per.setCsrq(csrq);
	    per.setHyzk(hyzk);
		per.setSsmz(ssmz);
		per.setZjlx(zjlx);
	    per.setZjqsrq(zjqsrq);
	    per.setZjjzrq(zjjzrq);       
		per.setKhxb(khxb);
        per.setKhgj(khgj);
        per.setYddh(yddh);
        per.setGddh(gddh);
        per.setJtdz(jtdz);
        per.setJtyb(jtyb);
        System.out.println(per);
        System.out.println(per.getKhxm());
        System.out.println(per.getZjid());
        perinfoDAO oDAO=new perinfoDAO();
      
		
        try {
//        	 System.out.println("heloo  456456456456456456456456456456456456456");
        	 System.out.println("hello"+ per.getKhxm());
        		Cookie cookies[]=request.getCookies(); //�����û�Ӳ���ϵ�Cookie���������е�Cookie�ŵ�һ��cookie������������
        		Cookie sCookie=null; 
        		for(int i=0;i<cookies.length-1;i++){    //��һ��ѭ���������ղŽ�����Cookie��������
        		sCookie=cookies[i];   //ȡ�������е�һ��Cookie����
        		if(sCookie!=null){
        		   
        		    System.out.println( sCookie.getValue()+"scookie");
        		      }
        		   }
        	
  
        	System.out.println(per.getZjid());
        	if(sCookie.getValue().equals(per.getZjid()))
        	{
        	 
			      oDAO.ud(per);
			    if(oDAO.ud(per)){
			    	 request.getRequestDispatcher("success.jsp").forward(request, response);
		        	 System.out.println("�޸ĳɹ�");
			    }
			    else{
			    	 request.getRequestDispatcher("error.jsp").forward(request, response);
	        		 System.out.println("�޸�ʧ��");
			    }
			     
        	 }
        	else{
        		request.getRequestDispatcher("error.jsp").forward(request, response);
        		 System.out.println("�㲻���޸�");
        	}
 
        	
		//	 System.out.println("hello  456456456456456456456456456456456456456");
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
