package zzcontrol;

import java.sql.*;
import java.util.List;
import dbcontrol.DbConnect;
import zzcontrol.ZZTable;

public class ZZDAO {

	//�����˻���ѯ�տ���������
	protected static String FIND_SKRXM_SQL = "select khxm from khxxb,zhb where khxxb.zjid=zhb.zjid and zhid=?";	

	//�������֤��Ǯ����ѯ֧���˻�ID
	protected static String FIND_ZHID_SQL = "select zhid from zhb where zjid=?";// and dqye=?";
	//����֧���˻���ѯ���
	protected static String FIND_DQYE_SQL = "select dqye from zhb where zhid=?"; 			//�ض�ID
//	protected static String FINE_DQYE_SQL = "select max(dqye) from zhb where zjid=?"; 		//Ǯ����һ����	
	
	public ZZTable find(ZZTable zztable) throws Exception {
		ZZTable getsqltable = null;
		Connection con = null;
		PreparedStatement prepStmt = null;
		ResultSet resset = null;
		
		try {
			con = DbConnect.getDBconnection();
			getsqltable = new ZZTable();
			
			//
			prepStmt = con.prepareStatement(FIND_SKRXM_SQL);
			prepStmt.setString(1, zztable.getskzh()); 					//skzh:�տ��˻�
			resset = prepStmt.executeQuery();
			if (resset.next())
			{
				getsqltable.setskrxm(resset.getString(1));
			}
			System.out.println("+++++++++++++++++++++++++++++++++" + getsqltable.getskrxm() + "+++++++++++++++++++++++++++");
			
			//
			prepStmt = con.prepareStatement(FIND_ZHID_SQL);
			prepStmt.setString(1, zztable.getsfzh());
			resset = prepStmt.executeQuery();
			if (resset.next())
			{
				getsqltable.setzfzh(resset.getString(1));
			}
			System.out.println("+++++++++++++++++++++++++++++++++" + getsqltable.getzfzh() + "+++++++++++++++++++++++++++");
			
			//
			prepStmt = con.prepareStatement(FIND_DQYE_SQL);
			prepStmt.setString(1, getsqltable.getzfzh()); 				//!!!
			resset = prepStmt.executeQuery();
			if (resset.next())
			{
				getsqltable.setzhye(resset.getDouble(1));
			}
			System.out.println("+++++++++++++++++++++++++++++++++" + getsqltable.getzhye() + "+++++++++++++++++++++++++++");
			
		}
		catch(Exception e)
		{
			//...
			e.printStackTrace();
		}
		finally{
			DbConnect.closeDB(con, prepStmt, resset);
		}
		
		return getsqltable;
	}
	
	//�����տ��˻������
	protected static String UPDATE_SKDQYE_SQL = "update zhb set dqye=dqye+? where zhid=?";
	//����֧���˻����
	protected static String UPDATE_ZFDQYE_SQL = "update zhb set dqye=dqye-? where zhid=?"; 	
	
	public void ZzWriteSQL(ZZTable zztable) throws Exception{
		Connection con = null;
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		
		try {
			con = DbConnect.getDBconnection();
			
			//
			prepStmt = con.prepareStatement(UPDATE_SKDQYE_SQL);
			System.out.println("ת�˽��=" + zztable.getzzje() + "�տ��˻�="+zztable.getskzh()+"++++++++++++++++++++++++++++++++++++++++++++++++");
			prepStmt.setDouble(1, zztable.getzzje());
			prepStmt.setString(2, zztable.getskzh());
			
			int rowCount = prepStmt.executeUpdate();
			if (rowCount == 0)
			{
				throw new Exception("Update error: �����տ��˻�������");
			}
			
			//
			prepStmt = con.prepareStatement(UPDATE_ZFDQYE_SQL);
			prepStmt.setDouble(1, zztable.getzzje());
			prepStmt.setString(2, zztable.getzfzh());
			
			rowCount = prepStmt.executeUpdate();
			if (rowCount == 0)
			{
				throw new Exception("Update error: ����֧���˻�������");
			}			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			DbConnect.closeDB(con,prepStmt,rs);
		}
	}
	
}