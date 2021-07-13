package com.phoenix.dbconfig;

import java.sql.Connection;
import java.sql.SQLException;
//author : raja.kumar@stltech.in
public class OracleConnection {
	
	   public static Connection getOracleConnection() throws ClassNotFoundException, SQLException
	   {
	   String jdbcDriver="oracle.jdbc.driver.OracleDriver";
	   String jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe";
	   String username="hr";
	   String password="hr";
	  
	   return DatabaseConfig.getConnection(jdbcDriver, jdbcUrl, username, password);
	   }
}
