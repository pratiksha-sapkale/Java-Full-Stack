package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecordById {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		String driver ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch_12826_12827";
		String un="root";
		String pass="root";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int sid,sage;
	    float sfees;
		String semail,sname,sdob;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student id");
		sid = sc.nextInt();
		
		
		//load the driver
		Class.forName(driver);
		
		//make the Connection
		conn = DriverManager.getConnection(url, un, pass);
		//create statement
		stmt = conn.createStatement();
		
		String s = "select * from student where sid ="+sid;
		
	    rs = stmt.executeQuery(s);
	    
	    if(rs.next()) {
	    	String del = "delete from student where sid="+sid;
	    	 int ret = stmt.executeUpdate(del);//delete, update and insert
	         if(ret>0) {
	        	 System.out.println("Record is deleted");
	         }
	         else {
	        	 System.out.println("Database error");
	         }
	    }
	    else {
	    	System.out.println("Student not exists");
	    	
	    }
			
		
	}

}
