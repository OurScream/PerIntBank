package perinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;





import dbcontrol.DbConnect;



public class perinfoDAO{
	

	
	public List<person> findAll() throws Exception {
		Connection con=null;
	    PreparedStatement prepStmt=null;
	    ResultSet rs=null;	
	    List<person> perto = new ArrayList<person>();
	    con=DbConnect.getDBconnection();
	    prepStmt = con.prepareStatement("select * from khxxb");
        rs = prepStmt.executeQuery();
        while(rs.next()) {
        	person per = new person();
            per.setZjid(rs.getString(1)); 
            per.setKhdlmm(rs.getString(2));
            per.setKhxm(rs.getString(3)); 
            per.setCsrq(rs.getString(4));
            per.setHyzk(rs.getString(5)); 
            per.setSsmz(rs.getString(6)); 
            per.setZjlx(rs.getString(7)); 
            per.setZjqsrq(rs.getString(8)); 
            per.setZjjzrq(rs.getString(9)); 
            per.setKhxb(rs.getString(10)); 
            per.setKhgj(rs.getString(11)); 
            per.setYddh(rs.getString(12)); 
            per.setGddh(rs.getString(13)); 
            per.setJtdz(rs.getString(14)); 
            per.setJtyb(rs.getString(15)); 
           
            perto.add(per);
            System.out.println(per);
           
           
            
        }
        DbConnect.closeDB(con, prepStmt, rs); 
        return perto;
	}
	
	public person find(person pe) throws Exception {
	    Connection con=null;
	    PreparedStatement prepStmt=null;
	    ResultSet rs=null;
	    person pe1 = null;
	    try {
	       con=DbConnect.getDBconnection();
            prepStmt = con.prepareStatement("select * from khxxb where zjid=?");
            prepStmt.setString(1,pe.getZjid());
            rs = prepStmt.executeQuery();
            if (rs.next()){
            	pe1=new person();
                pe1.setZjid(rs.getString(1)); 
                pe1.setKhdlmm(rs.getString(2));
                pe1.setKhxm(rs.getString(3)); 
                pe1.setCsrq(rs.getString(4));
                pe1.setHyzk(rs.getString(5)); 
                pe1.setSsmz(rs.getString(6)); 
                pe1.setZjlx(rs.getString(7)); 
                pe1.setZjqsrq(rs.getString(8)); 
                pe1.setZjjzrq(rs.getString(9)); 
                pe1.setKhxb(rs.getString(10)); 
                pe1.setKhgj(rs.getString(11)); 
                pe1.setYddh(rs.getString(12)); 
                pe1.setGddh(rs.getString(13)); 
                pe1.setJtdz(rs.getString(14)); 
                pe1.setJtyb(rs.getString(15));      
           } 
      } catch (Exception e) {
          // handle exception
      } 
	    finally {
   	     DbConnect.closeDB(con, prepStmt, rs);
     }
	    return pe1;
	}
	
	public void update(person stu) throws Exception {
		Connection con=null;
	    PreparedStatement prepStmt=null;
	    ResultSet rs=null;
	    try {
	    	 con=DbConnect.getDBconnection();
//         prepStmt = con.prepareStatement("update khxxb set zjid=?,khdlmm=?,khxm=?,"
//         		+ "csrq=?,hyzk=?,ssmz=?,zjlx=?,zjqsrq=?,zjjzrq=?,khxb=?,khgj=?,yddh=?,gddh=?,jtdz=?,jtyb=? where zjid=?");
         prepStmt = con.prepareStatement("update khxxb set khdlmm=? where zjid=?");
//         prepStmt.setString(1,stu.getZjid());
         
         prepStmt.setString(1,stu.getKhdlmm());
         prepStmt.setString(2,stu.getZjid());
         prepStmt.executeUpdate();
       
        
//         int rowCount=prepStmt.executeUpdate();
//         if (rowCount == 0) {
//                throw new Exception("Update Error:Student Id:" + stu.getZjid());
//         }
     } catch (Exception e) {
            System.out.println("nnnnnnnnnnnnn");
     } finally {
     	 DbConnect.closeDB(con, prepStmt, rs);
     }
    }

    	  
	public void ud(person per) throws Exception {
		Connection con=null;
	    PreparedStatement prepStmt=null;
	    ResultSet rs=null;
	    try {
	    	 con=DbConnect.getDBconnection();
         prepStmt = con.prepareStatement("update khxxb set khxm=?,csrq=?,hyzk=?,ssmz=?,zjlx=?,zjqsrq=?,zjjzrq=?,khxb=?,khgj=?,yddh=?,gddh=?,jtdz=?,jtyb=? where zjid=?");
    //     prepStmt = con.prepareStatement("update khxxb set khdlmm=? where zjid=?");
//         prepStmt.setString(1,stu.getZjid());
         
         
//         prepStmt.setString(1,stu.getZjid());
//         prepStmt.setString(2,stu.getKhdlmm());
         prepStmt.setString(1,per.getKhxm());
         prepStmt.setString(2,per.getCsrq());
         prepStmt.setString(3,per.getHyzk());
         prepStmt.setString(4,per.getSsmz());
         prepStmt.setString(5,per.getZjlx());
         prepStmt.setString(6,per.getZjqsrq());
         prepStmt.setString(7,per.getZjjzrq());
         prepStmt.setString(8,per.getKhxb());
         prepStmt.setString(9,per.getKhgj());
         prepStmt.setString(10,per.getYddh());
         prepStmt.setString(11,per.getGddh());
         prepStmt.setString(12,per.getJtdz());
         prepStmt.setString(13,per.getJtyb());
         prepStmt.setString(14,per.getZjid());       
         prepStmt.executeUpdate();
       
        
//         int rowCount=prepStmt.executeUpdate();
//         if (rowCount == 0) {
//                throw new Exception("Update Error:Student Id:" + stu.getZjid());
//         }
     } catch (Exception e) {
            System.out.println("nnnnnnnnnnnnn");
     } finally {
     	 DbConnect.closeDB(con, prepStmt, rs);
     }
    }
	
	
}
	
	
   

