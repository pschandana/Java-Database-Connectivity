package com.wipro_training.UserBean_ArrayList;

import com.wipro_training.UserBean.UsserBean;

import java.util.ArrayList;

public class getUsers_Main {
   public static void main(String[] args) {
	   ArrayList<UsserBean> adminusers = getUsers.getUsers("Admin");
	   for(UsserBean user : adminusers) {
		   System.out.println("Id : "+user.getUserId());
		   System.out.println("Name : "+user.getName());
		   System.out.println("Passsword: "+user.getPassword());
		   System.out.println("Incorect Attempts: "+user.getIncorrectattempts());
		   System.out.println("Lock Status:"+user.getLockStatus());
		   System.out.println("UserType: "+ user.getUserType());
		   System.out.println("---------------------------------");
	   }
   }
}
