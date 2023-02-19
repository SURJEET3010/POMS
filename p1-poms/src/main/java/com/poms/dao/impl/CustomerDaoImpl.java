/**
 * 
 */
package com.poms.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.poms.app.menu.MenuDrivenApplication;
import com.poms.config.DatabaseConnection;

import com.poms.constant.Constant;
import com.poms.constant.QueryList;
import com.poms.dao.CustomerDao;
import com.poms.model.Customer;
import com.poms.service.impl.CustomerServiceImpl;
import com.poms.util.AgeCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * @author Surjeet
 *
 */
public class CustomerDaoImpl implements CustomerDao {
	
	private static final Logger logger = Logger.getLogger(MenuDrivenApplication.class);
	static Connection con = DatabaseConnection.getConnection();

//	@Override
	public void addCustomer(Customer customer) throws SQLException {

		PreparedStatement pstmt = null;
		try {

			// Open a connection
			logger.info("Connecting to database...");

			// Execute a query
			logger.info("Inserting customer data...");
			
			pstmt = con.prepareStatement(QueryList.INSERT_QUERY);

			pstmt.setString(1, customer.getCustomerName()); // to be added
			pstmt.setString(2, customer.getEmail());
			pstmt.setString(3, customer.getPhone());
			pstmt.setString(4, customer.getAddress());
			pstmt.setString(5, customer.getDateOfBirth());
			pstmt.setString(6, customer.getAge());
			pstmt.setString(7, customer.getPassword());
			pstmt.setString(8, customer.getIdProof());
			pstmt.setString(9, customer.getPreferredLoginId());

			pstmt.executeUpdate();
			logger.info("Customer data inserted successfully.");
			logger.info(customer.getCustomerId());
			// Clean-up environment
			pstmt.close();
//			con.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se2) {
			} // nothing we can do

		} // end try

		return;
	}

//	@Override
	public void viewOrders(int customerId) throws SQLException {

		ResultSet rs = null;
		PreparedStatement ptstmt = null;

		try {
			ptstmt = con.prepareStatement(QueryList.SELECT_ITEMS_QUERY);
			ptstmt.setInt(customerId, customerId);
			rs = ptstmt.executeQuery();

			while (rs.next())
				logger.info(rs.getString(1));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Login
	public static void login(String email, String password) throws SQLException {

		PreparedStatement pstmt = null;
//		// Get input from user
//		Scanner sc = new Scanner(System.in);
//		logger.info("Email: ");
//		String email = sc.next();
//		logger.info("Password: ");
//		String password = sc.next();

		try {

			// Execute a query
			logger.info("Checking credentials...");

			pstmt = con.prepareStatement(QueryList.SELECT_LOGIN_QUERY);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();

			// Extract data from result set

			if (rs.next()) {
				// Retrieve by column name
				String customerName = rs.getString("customer_name");
				String customerPassword = rs.getString("password");
				int id = rs.getInt("customer_id");

				// Display values
				logger.info("Welcome, " + customerName + "!");
				postLoginOperations(id);
			} else {
				logger.warn("Invalid username or password.");
			}
			// Clean-up environment
			rs.close();
			pstmt.close();
//			con.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se2) {

			} // nothing we can do

		} // end try

	}

	private static void postLoginOperations(int id) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		logger.info("Operations to perform");
		logger.info("1.Update");
		logger.info("2.View Order History");
		logger.info("3.Exit");

		char selection = scan.next().charAt(0);
		CustomerServiceImpl services = new CustomerServiceImpl();

		switch (selection) {
		case '1':

			updateCustomer(id);
			return;
		case '2':
			try {
				services.viewOrdersDetails(id);
				break;
			} catch (SQLException e) {
				e.printStackTrace();
			}

		case '3':
			logger.info(Constant.EXIT_MESSAGE);
			return;

		default:
			logger.info(Constant.ERROR_MESSAGE);
			break;

		}

	}

	private static void updateField(String field, int id) throws SQLException {

		try {
			logger.info("Enter new " + field);
			Scanner scan = new Scanner(System.in);
			String newVal = scan.next();
			
			String query = "UPDATE `poms`.`customer` SET " + field + " = '" + newVal + "' where customer_id = " + id + ";";
			
//			PreparedStatement preparedStatement = con.prepareStatement(QueryList.UPDATE_CUSTOMER_QUERY);
			
			PreparedStatement preparedStatement = con.prepareStatement(query);
			
//			preparedStatement.setString(1, field);
//			preparedStatement.setString(2, newVal);
//			preparedStatement.setInt(3, id);
			int rows = preparedStatement.executeUpdate();
			if (rows > 0) {
				logger.info(field + " updated successfully");
				logger.info("Press 1 to go back");
				int n1 = scan.nextInt();
				if (n1 == 1) {
					updateCustomer(id);
				}
			} else {
				logger.info("Failed");
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
//	public List<Customer> getCustomerDetails() {
//		
//		List<Customer> recptDetails = new ArrayList<Customer>();
//		String query = "select * from receptionist ";
//		try {
//			PreparedStatement preparedStatement = con.prepareStatement(query);
//			ResultSet rs = preparedStatement.executeQuery();
//			while (rs.next()) {
//				Customer details = new Customer();
//				details.setReceptId(rs.getInt(1));
//				details.setReceptionistName(rs.getString(2));
//				details.setDesignation(rs.getString(3));
//				details.setGender(rs.getString(4));
//				details.setShiftTiming(rs.getString(5));
//				details.setReceptionistContact(rs.getString(6));
//				details.setAddress(rs.getString(7));
//				recptDetails.add(details);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return recptDetails;
//
//	}
//
//	
//	
	public static void updateCustomer(int id) throws SQLException {

		logger.info("Press 1: Update Name");
		logger.info("Press 2: Update Email");
		logger.info("Press 3: Update Contact");
		logger.info("Press 4: Update Address");
		logger.info("Press 5: Update Date of Birth");
		logger.info("Press 7: Logout");

		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			String field1 = "customer_name";
			updateField(field1, id);
			break;
		case 2:
			String field2 = "email";
			updateField(field2, id);
			// logger.info("Currently Not Available !"); // ---------------------------
			break;
		case 3:
			String field3 = "phone";
			updateField(field3, id);
			break;
		case 4:
			String field4 = "address";
			updateField(field4, id);
			break;
		case 5:
			String field5 = "date_of_birth";
			updateField(field5, id);
			break;

		case 7:
			logger.info("Logged Out !");
			break;
		default:
			logger.info("Wrong option selected");
			updateCustomer(id);

		}

	}
}
