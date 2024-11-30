package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertValueUsingPreparedstatement {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String driver ="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/batch_12826_12827";
		String un="root";
		String pass="root";
		
		Connection conn = null;
		PreparedStatement pst = null;
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
		String s = "select * from student where sid =?";
		pst = conn.prepareStatement(s);
		pst.setInt(1,sid);
	    rs = pst.executeQuery();
	    
	    if(rs.next()) {
	    	String ins = "insert into student(sid,sname,sage,semail,sdob,lastname)values(?,?,?,?,?,?,?,?)";
	          pst = conn.prepareStatement(ins);
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
			  
			  pst.setInt(1, sid);
				pst.setString(2, sname);
				pst.setInt(3, sage);
				pst.setString(4, semail);
				pst.setFloat(5, sfees);
				pst.setString(6, sdob);
				pst.setString(7,lastname);
				int ret = pst.executeUpdate();
				if(ret>0) {
					System.out.println("Successfully Registered");
				}else {
					System.out.println("Error in sql query");
				}
			
			
			}else {
				System.out.println("That student id already exist");
			}
			conn.close();

	}

}
