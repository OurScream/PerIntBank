package logincontrol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import zzcontrol.ZZTable;
import dbcontrol.DbConnect;
import logincontrol.LoginUser;

public class LoginDAO{
	
	//
	protected static String FIND_KHDLMM_SQL = "select khdlmm from khxxb where zjid=?";// and dqye=?";

	//
	public LoginUser CheckUser(LoginUser user) throws Exception
	{
		LoginUser retuser = null;
		String userid = user.getzjid();
		String userpwd = user.getkhdlmm();
		
		Connection con = null;
		PreparedStatement prepStmt = null;
		ResultSet resset = null;
		
		try {
			con = DbConnect.getDBconnection();
			retuser = new LoginUser();
			
			//
			prepStmt = con.prepareStatement(FIND_KHDLMM_SQL);
			prepStmt.setString(1, userid); 					//userid=zjid=֤��id�����ݿ�������
			resset = prepStmt.executeQuery();
			retuser.setkhdlmm(null);
			if (resset.next())
			{
				retuser.setkhdlmm(resset.getString(1));    //��ȡ����
				System.out.println("+++++++++++++++++++++++++++++++++��ȡ��������" + retuser.getkhdlmm() + "+++++++++++++++++++++++++++");
			}
			System.out.println("+++++++++++++++++++++++++++++++++��ȡ��������" + retuser.getkhdlmm() + "+++++++++++++++++++++++++++");

		}
		catch(Exception e)
		{
			//...
			e.printStackTrace();
		}
		finally{
			DbConnect.closeDB(con, prepStmt, resset);
		}
		
		retuser.setzjid(userid);
		System.out.println("+++++++++++++++++++++++++++++++++zjid =" + retuser.getzjid() + "+++++++++++++++++++++++++++");
		return retuser;
	}
}