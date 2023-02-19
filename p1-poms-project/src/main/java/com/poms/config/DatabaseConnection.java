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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DatabaseConnection {
	private static Connection connection = null;

	public static Connection getConnection() {
		if(connection == null) {
			ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
			String dburl = resourceBundle.getString("dburl");
			String username = resourceBundle.getString("username");
			String password = resourceBundle.getString("password");
			try {
				Class.forName(resourceBundle.getString("driver"));
				connection = DriverManager.getConnection(dburl,username,password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return connection;
	}
}


