package com.wipro_training.UserBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class adding_user1 {
    public static Connection getConnection() throws ClassNotFoundException,SQLException{
    	Class.forName("oracle.jdbc.driver.OracleDriver");
    	return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","5005");
    	
    }
    public static String add_user1(UsserBean bean) {
    	int rows = 0;
    	try {
	    	Connection conn = getConnection();
	    	String sql = "Insert into Employee_details" + "(UserID,Password,Name,IncorrectAttempts,LockStatus,UserType)" +
	    	             "values(?,?,?,?,?,?)";
	    	PreparedStatement pt = conn.prepareStatement(sql);
	    	pt.setString(1, bean.getUserId());
	    	pt.setString(2, bean.getPassword());
	    	pt.setString(3, bean.getName());
	    	pt.setInt(4, bean.getIncorrectattempts());
	    	pt.setInt(5, bean.getLockStatus());
	    	pt.setString(6, bean.getUserType());
	    	rows = pt.executeUpdate();
	    	conn.close();
	    	pt.close();
	    	
    	}catch(Exception e) {
    		System.out.println("Error : "+e);
    	}
    	return (rows > 0) ? "successfully Inserted" : "Failed to Inserted";
    }
    public static void main(String[] args) {
    	UsserBean user = new UsserBean();
    	user.setUserId("AB345");
    	user.setPassword("12345");
    	user.setName("Anu");
    	user.setIncorrectAttempts(4);
    	user.setLockStatus(3);
    	user.setUserType("Student");
    	
    	System.out.println(add_user1(user));
    }
}
