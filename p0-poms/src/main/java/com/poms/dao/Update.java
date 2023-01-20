//package com.revature.service.impl;
//
////import com.mysql.cj.xdevapi.Statement;
//import com.revature.app.menu.MenuDrivenApplication;
//import com.revature.configuration.DatabaseConnection;
//import com.revature.configuration.QueryUtil;
//import com.revature.constant.Constants;
//import com.revature.model.Customer;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Scanner;
//import java.sql.Statement;
//
//
//
//
//public class CustomerServices {
//	
//	public void updateField(String field) {
//		
//		System.out.println("Enter new "+field);
//		String newName = input.next();
//		PreparedStatement preparedStatement =connection.prepareStatement(QueryUtil.updateName(name,newName));
//		int rows =preparedStatement.executeUpdate();
//		if(rows>0) {
//			System.out.println("Name updated successfully");
//			System.out.println("Press 1 to go back");
//			int n1=input.nextInt();
//			if(n1==1) {
//			updateCustomer(name);
//			}
//		}
//		else {
//			System.out.println("Failed");
//		}
//		
//	}
//	
//	public void updateCustomer(String id) throws SQLException {
//		Scanner input=new Scanner(System.in);
//		String name = id;
//		try(Connection connection =databaseConnection.getConnection();){
//			
//			System.out.println("Press 1: Update Name");
//			System.out.println("Press 2: Update Email");
//			System.out.println("Press 3: Update Contact");
//			System.out.println("Press 4: Update Address");
//			System.out.println("Press 5: Update Date of Birth");
//			System.out.println("Press 6: Update Age");
//			System.out.println("Press 7 to exit");
//			
//			int choice = input.nextInt();
//			switch(choice) {
//			case 1:
//				String field = "name";
//				System.out.println("Enter new "+field);
//				String newName = input.next();
//				PreparedStatement preparedStatement =connection.prepareStatement(QueryUtil.updateName(name,newName));
//				int rows =preparedStatement.executeUpdate();
//				if(rows>0) {
//					System.out.println("Name updated successfully");
//					System.out.println("Press 1 to go back");
//					int n1=input.nextInt();
//					if(n1==1) {
//					updateCustomer(name);
//					}
//				}
//				else {
//					System.out.println("Failed");
//				}
//			case 2:
//				System.out.println("Enter new email");
//				String email = input.next();
//				PreparedStatement preparedStatement2 =connection.prepareStatement(QueryUtil.updateEmail(name,email));
//				int rows2 =preparedStatement2.executeUpdate();
//				if(rows2>0) {
//					System.out.println("Email updated successfully");
//					System.out.println("Press 1 to go back");
//					int n1=input.nextInt();
//					if(n1==1) {
//					updateCustomer(name);
//					}
//					
//				}
//				else {
//					System.out.println("Failed");
//				}
//			case 3:
//				System.out.println("Enter new contact");
//				String contact = input.next();
//				PreparedStatement preparedStatement3 =connection.prepareStatement(QueryUtil.updateContact(name,contact));
//				int rows3 =preparedStatement3.executeUpdate();
//				if(rows3>0) {
//					System.out.println("Contact updated successfully");
//					System.out.println("Press 1 to go back");
//					int n1=input.nextInt();
//					if(n1==1) {
//					updateCustomer(name);
//					}
//					
//				}
//				else {
//					System.out.println("Failed");
//				}
//			case 4:
//				System.out.println("Enter new address");
//				String address = input.next();
//				PreparedStatement preparedStatement4 =connection.prepareStatement(QueryUtil.updateContact(name,address));
//				int rows4=preparedStatement4.executeUpdate();
//				if(rows4>0) {
//					System.out.println("Contact updated successfully");
//					System.out.println("Press 1 to go back");
//					int n1=input.nextInt();
//					if(n1==1) {
//					updateCustomer(name);
//					}
//					
//				}
//				else {
//					System.out.println("Failed");
//				}
//			case 5:
//				System.out.println("Enter new date of birth");
//				String DOB = input.next();
//				PreparedStatement preparedStatement5 =connection.prepareStatement(QueryUtil.updateContact(name,DOB));
//				int rows5=preparedStatement5.executeUpdate();
//				if(rows5>0) {
//					System.out.println("Date of birth  updated successfully");
//					System.out.println("Press 1 to go back");
//					int n1=input.nextInt();
//					if(n1==1) {
//					updateCustomer(name);
//					}
//					
//				}
//				else {
//					System.out.println("Failed");
//				}
//			case 6:
//				System.out.println("Enter new age");
//				String age = input.next();
//				PreparedStatement preparedStatement6 =connection.prepareStatement(QueryUtil.updateContact(name,age));
//				int rows6=preparedStatement6.executeUpdate();
//				if(rows6>0) {
//					System.out.println("Age updated successfully");
//					System.out.println("Press 1 to go back");
//					
//					int n1=input.nextInt();
//					if(n1==1) {
//					updateCustomer(name);
//					}
//					
//				}
//				else {
//					System.out.println("Failed");
//				}
//			case 7:
//				MenuDrivenApplication.showMenu();
//				break;
//			default :
//				System.out.println("Wrong option selected");
//				updateCustomer(name);
//				
//			    
//			
//			}
//			
//		} 
//				
//		 
//	}
//
//}
