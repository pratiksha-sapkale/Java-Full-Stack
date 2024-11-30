package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateStudentBasedOnId {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String driver ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch_12826_12827";
		String un="root";
		String pass="root";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int sid;
        String newemail;
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
	    	System.out.println("Enter new email id ");
	    	newemail = sc.next();
	       String upd ="update student set semail='"+newemail+"' where sid="+sid;
	       int ret =  stmt.executeUpdate(upd);
	       if(ret>0) {
	    	   System.out.println("Email id is updated");
	       }else {
	    	   System.out.println("Error in database");
	       }
	      }
	    else {
	    	System.out.println("Student not exists");
	    }
		

	}

}
