package com.wipro_training.UserBean_ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.wipro_training.UserBean.UsserBean;

public class storeAllRecords {
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
   	 Class.forName("oracle.jdbc.driver.OracleDriver");
   	 return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","5005");
   	 
    }
    public static ArrayList<UsserBean> storeAllRecords(){
   	 ArrayList<UsserBean> userList = new ArrayList<>();
   	 try {
   		 Connection conn = getConnection();
   		 String sql = "SELECT UserID,Password,Name,IncorrectAttempts,LockStatus,UserType From Employee_details";
   		 PreparedStatement pt = conn.prepareStatement(sql);
   		 
   		 
   		 ResultSet rt = pt.executeQuery();
   		 while(rt.next()) {
   			 UsserBean user = new UsserBean();
                user.setUserId(rt.getString("USERID"));
                user.setPassword(rt.getString("PASSWORD"));
                user.setName(rt.getString("NAME"));
                user.setIncorrectAttempts(rt.getInt("INCORRECTATTEMPTS"));
                user.setLockStatus(rt.getInt("LOCKSTATUS"));
                user.setUserType(rt.getString("USERTYPE"));
                
                userList.add(user);
   		 }
   		 
   	 }catch(Exception e) {
   		 e.printStackTrace();
   	 }
   	 return userList;
    }
}

