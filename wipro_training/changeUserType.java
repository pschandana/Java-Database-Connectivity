package com.wipro_training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class changeUserType {
   
	public static Connection getConnection() throws ClassNotFoundException,SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","5005");
	}
	public static String changeUserType(String UserID) {
		String str = "Update Failed";
		try {
			Connection conn = getConnection();
			String sql = "UPDATE Employee_details set UserType = ? where UserID=?";
			PreparedStatement pt = conn.prepareStatement(sql);
			pt.setString(1, "Admin");
			pt.setString(2, UserID);
			int rt = pt.executeUpdate();
			if(rt > 1) {
				str = "Update Success";
			}
			
			conn.close();
			pt.close();
			
		}catch(Exception e) {
			System.out.println("Error: "+ e);
		}
		return str;
		
				
	}
	public static void main(String[] args) {
		String userid = "RS1003";
		String message = changeUserType(userid);
		System.out.println(message);
	}
	
	
}
