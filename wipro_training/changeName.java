package com.wipro_training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class changeName {
    
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","5005");
	}
	
	public static int getLockStatus() {
		int result = 0;
		try {
		  
		  Connection conn = getConnection();
		  String sql = "SELECT COUNT(*) AS unlocked_rows from Employee_details where LockStatus=?";
		  PreparedStatement pt = conn.prepareStatement(sql);
		  pt.setInt(1,0);
		  ResultSet rt = pt.executeQuery();
		  if (rt.next()) {  // Move to the first row
              result = rt.getInt(1); // or rt.getInt("unlocked_rows")
          }
		  conn.close();
		  pt.close();
		  rt.close();
		}catch(Exception e) {
			System.out.println("Error "+ e);
		}
		return result;
		  
	}
	
	public static String changeName1(String id,String name) {
		String result = "Failed (may be your UserID doesnot exist)";
		try {
			Connection conn = getConnection();
			String sql = "UPDATE Employee_details set Name = ? where UserID = ? ";
			PreparedStatement pt = conn.prepareStatement(sql);
			pt.setString(1, name);
			pt.setString(2, id);
			int rt = pt.executeUpdate();
			if(rt > 0) {
				result = "success";
			}
			conn.close();pt.close();
		}catch(Exception e) {
			System.out.println("Error: "+ e);
		}
		return result;
	}
	public static String changePassword(String password) {
		String result = "Sorry we couldn't change your Password ";
		try {
			Connection conn = getConnection();
			String sql = "UPDATE Employee_details set Password = ? where UserType = ? ";
			PreparedStatement pt = conn.prepareStatement(sql);
			pt.setString(1, password);
			pt.setString(2, "Admin");
			int rt = pt.executeUpdate();
			if(rt > 0) {
				result = "Your Password Has been Changed";
			}
			conn.close();pt.close();
		}catch(Exception e) {
			System.out.println("Error: "+ e);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//check lock state
		int res = getLockStatus();
		System.out.println("Number of Rows with Lock Status '0' are "+ res);
		// changeName
		String id = "FD23985";//AB1001
		String name = "chandana";
		String result = changeName1(id,name);
		System.out.println("Your updation was "+result);
		//change password
		String password = "JDBC$";
		System.out.println(changePassword(password));
	}
}
