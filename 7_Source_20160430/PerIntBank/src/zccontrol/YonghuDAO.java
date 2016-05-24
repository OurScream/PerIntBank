package zccontrol;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import dbcontrol.DbConnect;
import perinfo.person;;
public class YonghuDAO implements IYonghuDAO {     
	protected static final String FIELDS_INSERT ="zjid,khdlmm,khxm,csrq,hyzk,ssmz,"
			+ "zjlx,zjqsrq,zjjzrq,khxb,khgj,yddh,gddh,jtdz,jtyb";
	protected static String INSERT_SQL="insert into khxxb ("
			+FIELDS_INSERT+")"+"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	//实现向数据库中添加记录的方法 
	public person create(person per) throws Exception{
		 Connection con=null;
	      PreparedStatement prepStmt=null;
	      ResultSet rs=null;
	      try{
	    	  con=DbConnect.getDBconnection();
	    	  prepStmt =con.prepareStatement(INSERT_SQL);
	    	  prepStmt.setString(1,per.getZjid());
	    	  prepStmt.setString(2,per.getKhdlmm());
	    	  prepStmt.setString(3,per.getKhxm());
	    	  prepStmt.setString(4,per.getCsrq());
	    	  prepStmt.setString(5,per.getHyzk());
	    	  prepStmt.setString(6,per.getSsmz());
	    	  prepStmt.setString(7,per.getZjlx());
	    	  prepStmt.setString(8,per.getZjqsrq());
	    	  prepStmt.setString(9,per.getZjjzrq());
	    	  prepStmt.setString(10,per.getKhxb());
	    	  prepStmt.setString(11,per.getKhgj()); 
	    	  prepStmt.setString(12,per.getYddh());
	    	  prepStmt.setString(13,per.getGddh()); 
	    	  prepStmt.setString(14,per.getJtdz());
	    	  prepStmt.setString(15,per.getJtyb()); 
	          prepStmt.executeUpdate();
	      } catch(Exception e){
	      } finally{
	    	     DbConnect.closeDB(con, prepStmt, rs);
	      }

	     return per;
	}
}
