package com.phoenix.dbconfig;
import java.sql.Connection;
//author : raja.kumar@stltech.in
import java.sql.SQLException;
public class ConnectionTest {
   public static void main(String[]args) 
   {
	   String jdbcDriver="oracle.jdbc.driver.OracleDriver";
	   String jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe ";
	   String username="hr";
	   String password="hr";
	   
	   try {
		Connection con=DatabaseConfig.getConnection(jdbcDriver, jdbcUrl, username, password);
		System.out.println("Connection established......!");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    
   }
}
