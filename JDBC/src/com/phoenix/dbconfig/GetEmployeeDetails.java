package com.phoenix.dbconfig;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
//author : raja.kumar@stltech.in
public class GetEmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Connection con=null;
       try {
    	   con=OracleConnection.getOracleConnection();
    	   String sql="select * from login";
    	   Statement stmt=con.createStatement();
    	   ResultSet rs = stmt.executeQuery(sql);
    	   
    	   while(rs.next())
    	   {
    		    /*String firstName = rs.getString("first_name");
    	        int salary=rs.getInt("salary");
    	        System.out.println("First_Name: "+firstName+"\tSalary: "+salary);*/
    	    
    	   }
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
       
	}

}
