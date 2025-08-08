package com.wipro_training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class getUserType {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","5005");
		
	}
	public static String getUserType(String userID) {
		String userType = null;
		
		try {
			Connection conn = getConnection();
			String sql = "SELECT UserType,Name,IncorrectAttempts from Employee_details where UserID= ?";
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setString(1,userID);
			
			ResultSet rt = ptmt.executeQuery();
			if(rt.next()) {
				String type =  rt.getString("UserType");
				String name =  rt.getString("Name");
				String incorrectAttempts = rt.getString("IncorrectAttempts");
				userType = type + " Who is "+ name +"\n"+ "Having Incorrect Attempts "+ incorrectAttempts;
			}
			else {
				userType = "UserID can not be found";
			}
			 conn.close();
			 rt.close();
			 ptmt.close();
	     }
		 
		catch(Exception e) {
			userType = "Error : "+e.getMessage();
		}
		return userType;
		
	}
	public static void main(String[] args) {
		String UserId = "AB1001";
		
		String usertype = getUserType(UserId);
		System.out.println("User Type for "+ UserId + " is "+ usertype);
	}
}