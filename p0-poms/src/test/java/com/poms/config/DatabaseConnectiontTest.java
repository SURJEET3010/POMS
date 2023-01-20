//package com.poms.config;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//import com.poms.constant.Constant;
//
//public class DatabaseConnection {
//	
//	private static Connection con = null;
//	
//	static {
//		String url = Constant.DATABASE_URL;
//		String username = Constant.DATABASE_USERNAME;
//		String password = Constant.DATABASE_PASSWORD;
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection(url, username, password);
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		}
//	
//	public static Connection getConnection() {
//		return con;
//	}
//}




package com.poms.config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import org.junit.Test;

public class DatabaseConnectiontTest {


    @Test
    public void testConnection()
    {
    	assertNotNull(new DatabaseConnection().getConnection());
    }
}


