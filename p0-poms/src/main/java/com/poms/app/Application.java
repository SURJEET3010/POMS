package com.poms.app;

import java.util.ResourceBundle;

public class Application {

	public static void main(String[] args) {
		
		usingResourceBundle();
		
	}

	public static void usingResourceBundle() {
		ResourceBundle resourceBundle =  ResourceBundle.getBundle("poms");
		String dburl = resourceBundle.getString("dburl");
		String driver = resourceBundle.getString("driver");
		String username = resourceBundle.getString("username");
		String password = resourceBundle.getString("password");
		
		System.out.println("dburl: "+dburl);
		System.out.println("driver:" + driver);
		System.out.println("username:" + username);
		System.out.println("password: " + password); 
	}

}
