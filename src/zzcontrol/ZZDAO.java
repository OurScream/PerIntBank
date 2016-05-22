package zzcontrol;

import java.sql.*;
import java.util.List;
import dbcontrol.DbConnect;
import zzcontrol.ZZTable;

public class ZZDAO {

	//根据账户查询收款人姓名，
	protected static String FIND_SKRXM_SQL = "select khxm from khxxb,zhb where khxxb.zjid=zhb.zjid and zhid=?";	

	//根据身份证和钱数查询支付账户ID
	protected static String FIND_ZHID_SQL = "select zhid from zhb where zjid=?";// and dqye=?";
	//根据支付账户查询余额
	protected static String FIND_DQYE_SQL = "select dqye from zhb where zhid=?"; 			//特定ID
//	protected static String FINE_DQYE_SQL = "select max(dqye) from zhb where zjid=?"; 		//钱最多的一个！	
	
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
			prepStmt.setString(1, zztable.getskzh()); 					//skzh:收款账户
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
	
	//更新收款账户的余额
	protected static String UPDATE_SKDQYE_SQL = "update zhb set dqye=dqye+? where zhid=?";
	//更新支付账户余额
	protected static String UPDATE_ZFDQYE_SQL = "update zhb set dqye=dqye-? where zhid=?"; 	
	
	public void ZzWriteSQL(ZZTable zztable) throws Exception{
		Connection con = null;
		PreparedStatement prepStmt = null;
		ResultSet rs = null;
		
		try {
			con = DbConnect.getDBconnection();
			
			//
			prepStmt = con.prepareStatement(UPDATE_SKDQYE_SQL);
			System.out.println("转账金额=" + zztable.getzzje() + "收款账户="+zztable.getskzh()+"++++++++++++++++++++++++++++++++++++++++++++++++");
			prepStmt.setDouble(1, zztable.getzzje());
			prepStmt.setString(2, zztable.getskzh());
			
			int rowCount = prepStmt.executeUpdate();
			if (rowCount == 0)
			{
				throw new Exception("Update error: 更新收款账户余额出错");
			}
			
			//
			prepStmt = con.prepareStatement(UPDATE_ZFDQYE_SQL);
			prepStmt.setDouble(1, zztable.getzzje());
			prepStmt.setString(2, zztable.getzfzh());
			
			rowCount = prepStmt.executeUpdate();
			if (rowCount == 0)
			{
				throw new Exception("Update error: 更新支付账户余额出错");
			}			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			DbConnect.closeDB(con,prepStmt,rs);
		}
	}
	
}