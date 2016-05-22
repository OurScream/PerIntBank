package servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import perinfo.person;
import zccontrol.YonghuDAO;
import dbcontrol.*;
public class create extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
		request.setCharacterEncoding("utf-8");
		String zjid=request.getParameter("zjid");
		String khdlmm=request.getParameter("khdlmm");
		String khxm=request.getParameter("khxm");
		String csrq=request.getParameter("csrq");
		String hyzk=request.getParameter("hyzk");
		String ssmz=request.getParameter("ssmz");
		String zjlx=request.getParameter("zjlx");
		String zjqsrq=request.getParameter("zjqsrq");
		String zjjzrq=request.getParameter("zjjzrq");
		String khxb=request.getParameter("khxb");
		String khgj=request.getParameter("khgj");
		String yddh=request.getParameter("yddh");
		String gddh=request.getParameter("gddh");
		String jtdz=request.getParameter("jtdz");
		String jtyb=request.getParameter("jtyb");
//		String sql1="Insert into per_info(zjid)";
//		String sql2="values("+zjid+","+khdlmm+","+khxm+""+csrq+","+hyzk+","+ssmz+","+zjlx+","+zjqsrq+","+zjjzrq+""
//				+ ""+khxb+","+khgj+","+yddh+","+gddh+","+jtdz+","+jtyb+")";
//		String sql =sql1+sql2;
		person son =new person();
		
		son.setZjid(zjid);
		son.setKhdlmm(khdlmm);
		son.setKhxm(khxm);
		son.setCsrq(csrq);
		son.setHyzk(hyzk);
		son.setSsmz(ssmz);
		son.setZjlx(zjlx);
		son.setZjqsrq(zjqsrq);
		son.setZjjzrq(zjjzrq);
		son.setKhxb(khxb);
		son.setKhgj(khgj);
		son.setYddh(yddh);
		son.setGddh(gddh);
		son.setJtdz(jtdz);
		son.setJtyb(jtyb);
		
		YonghuDAO dao =new YonghuDAO();
		try {
			dao.create(son);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

//		DbConnect run =new DbConnect();
//		int n =run.
//		int n=run.updateSQL(sql);
//		if(n>=1)
//			request.getRequestDispatcher("index.html").forward(request, response);
//		else
//			request.getRequestDispatcher("main.html").forward(request, response);
		
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
			doGet(request,response);
		}
}
