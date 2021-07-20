package com.phoenix.dbconfig;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
//author : raja.kumar@stltech.in
public class OracleConnection {
	
	   public static Connection getOracleConnection() throws ClassNotFoundException, SQLException
	   {
			/*
			 * String jdbcDriver="oracle.jdbc.driver.OracleDriver"; String
			 * jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe"; String username="hr"; String
			 * password="hr";
			 */
		   Properties props=new Properties();
		   try {
			   props.load(new FileReader("dbConfig.properties"));
			   
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   String jdbcDriver=props.getProperty("driver");
		   String jdbcUrl=props.getProperty("Url");
		   String username=props.getProperty("username");
		   String  password=props.getProperty("password");
		 
		   return DatabaseConfig.getConnection(jdbcDriver, jdbcUrl, username, password);
		   
		   
	  
	   }
}
