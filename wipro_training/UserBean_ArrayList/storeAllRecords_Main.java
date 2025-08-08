package com.wipro_training.UserBean_ArrayList;

import java.util.ArrayList;

import com.wipro_training.UserBean.UsserBean;

public class storeAllRecords_Main {
     public static void main(String[] args) {
    	 ArrayList<UsserBean> allusers = storeAllRecords.storeAllRecords();
    	 System.out.println("All Records from Users Table : ");
    	 for(UsserBean user : allusers) {
    		 System.out.println("User Id: "+ user.getUserId());
    		 System.out.println("User Name: "+ user.getName());
    		 System.out.println("Password : "+ user.getPassword());
    		 System.out.println("Incorrect Attempts : "+ user.getIncorrectattempts());
    		 System.out.println("Lock Status : "+ user.getLockStatus());
    		 System.out.println("User Type: "+ user.getUserType());
    		 System.out.println("--------------------------------------");
    	 }
     }
}
