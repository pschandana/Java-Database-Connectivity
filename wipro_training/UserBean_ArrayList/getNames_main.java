package com.wipro_training.UserBean_ArrayList;

import com.wipro_training.UserBean.UsserBean;

//import java.sql.*;
import java.util.ArrayList;

public class getNames_main {
   public static void main(String[] args) {
	   String[] names = getNames.getName();
	   for(String s:names) {
		   System.out.println("Name : "+ s);
	   }
   }
}
