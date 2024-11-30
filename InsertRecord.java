package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
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
		String semail,sname,sdob,lastname;
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
	    	System.out.println("Student id alread exits cannot add record");
	  }
	  else { //not there go for insert
		  System.out.println("Enter name");
		  sc.nextLine();
		  sname=sc.nextLine();
		  System.out.println("Enter age");
		  sage = sc.nextInt();
		  System.out.println("Enter email");
		  semail = sc.next();
		  System.out.println("Enter fees");
		  sfees = sc.nextFloat();
		  System.out.println("Enter dob (yyyy-mm-dd)");
		  sdob = sc.next();
		  System.out.println("Enter lastname");
		  lastname = sc.next();
		  //| sid | sname  | sage | semail| sfees | sdob       |
String ins ="insert into student values("+sid+",'"+sname+"',"+sage+",'"+semail+"',"+sfees+",'"+sdob+"',"+lastname+")";
          int ret = stmt.executeUpdate(ins);
          if(ret>0) {
        	  System.out.println("Registerd successfully");
          }else {
        	  System.out.println("database error");
          }
	  }
	    conn.close();
	}

}
