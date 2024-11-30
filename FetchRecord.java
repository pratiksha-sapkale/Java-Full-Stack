package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class FetchRecord {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		 String driver ="com.mysql.cj.jdbc.Driver";
		  Class.forName(driver);
		  String url="jdbc:mysql://localhost:3306/batch_12826_12827";
		  String un = "root";
		  String pass ="root";
		  Connection conn=null;
		  conn = DriverManager.getConnection(url, un, pass);
		 
		  Statement stmt = null;
		  stmt = conn.createStatement();
		  String s = "select * from student";
		  
		  ResultSet rs = null;
		  rs=stmt.executeQuery(s);
		  int sid,sage;
		  float sfees;
		  String semail,sname,sdob;
		  
		  System.out.println("SID\tSNAME\tSAGE\tSEMAIL\tSFEES\tSDOB");
		  while(rs.next()) {
			  sid = rs.getInt("sid"); //rs.getInt(1);
			  sname = rs.getString("sname");
			  sage = rs.getInt("sage");
			  semail = rs.getString("semail");
			  sfees = rs.getFloat("sfees");
			  sdob = rs.getString("sdob");
		System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+semail+"\t"+sfees+"\t"+sdob);
		
		  }
		  conn.close();
	}

}
