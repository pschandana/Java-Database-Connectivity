package com.wipro_training.UserBean_ArrayList;

import com.wipro_training.UserBean.UsserBean;

import java.sql.*;
import java.util.ArrayList;

public class getNames {
	public static Connection getConnection() throws ClassNotFoundException,SQLException{
   	 Class.forName("oracle.jdbc.driver.OracleDriver");
   	 return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","5005");
   	 
    }
    public static String[] getName(){
   	 ArrayList<String> userList = new ArrayList<>();
   	 try {
   		 Connection conn = getConnection();
   		 String sql = "SELECT Name from Employee_details";
   		 PreparedStatement pt = conn.prepareStatement(sql);
   		 //pt.setString(1,UserType);
   		 
   		 ResultSet rt = pt.executeQuery();
   		 while(rt.next()) {
   			 
                userList.add(rt.getString("Name"));
   		 }
   		 
   	 }catch(Exception e) {
   		 e.printStackTrace();
   	 }
   	 String[] namesList = new String[userList.size()];
   	 return userList.toArray(namesList);
    }
}
