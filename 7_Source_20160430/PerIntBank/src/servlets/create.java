package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import perinfo.person;
import perinfo.perinfoDAO;
import zccontrol.YonghuDAO;
import dbcontrol.*;
/*
 * ģ�����ƣ����û�ע��ģ��
 * ģ�鹦�ܣ�������ݣ����������û���Ϣ
 * ʱ�䣺2016-5-22
 * ���ߣ����� 
 */
public class create extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		//��ʼ�������Ϣ
		String zjid = request.getParameter("zjid");
		String khdlmm = request.getParameter("khdlmm");
		String khxm = request.getParameter("khxm");
		String csrq = request.getParameter("csrq");
		String hyzk = request.getParameter("hyzk");
		String ssmz = request.getParameter("ssmz");
		String zjlx = request.getParameter("zjlx");
		String zjqsrq = request.getParameter("zjqsrq");
		String zjjzrq = request.getParameter("zjjzrq");
		String khxb = request.getParameter("khxb");
		String khgj = request.getParameter("khgj");
		String yddh = request.getParameter("yddh");
		String gddh = request.getParameter("gddh");
		String jtdz = request.getParameter("jtdz");
		String jtyb = request.getParameter("jtyb");
		
		//�����û�
		person son = new person();

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

		perinfoDAO perdao = new perinfoDAO();
		YonghuDAO dao = new YonghuDAO();
		//�������ݿ��ѯ���ɹ��������һ��
		try {
			if ((perdao.find(son) != null)) {
				request.getRequestDispatcher("error.jsp").forward(request,response);
			}

		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//�������ݿ����
		try {
			dao.create(son);
			request.getRequestDispatcher("index.html").forward(request,
					response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.getRequestDispatcher("error.jsp").forward(request,
					response);
		};


	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
