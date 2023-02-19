package com.poms.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.function.Predicate;

import com.poms.config.DatabaseConnection;
import com.poms.model.Customer;

public class Authentication {

	static Connection con = DatabaseConnection.getConnection();

	public static void main(String[] args) {

		PreparedStatement pstmt = null;
//	// Get input from user
		Scanner sc = new Scanner(System.in);

		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Password: ");
		String password = sc.next();

		try {

			// Execute a query
			System.out.print("Checking credentials...");

			pstmt = con.prepareStatement(
					"SELECT email , password from  `poms`.`customer` where `email` = ? and `password` = ?");
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();

			// Extract data from result set
//
//		if (rs.next()) {
//			// Retrieve by column name
//			String customerName = rs.getString("customer_name");
//			String customerPassword = rs.getString("password");
//			int id = rs.getInt("customer_id");
//
//			// Display values
//			System.info("Welcome, " + customerName + "!");
//			postLoginOperations(id);
//		} else {
//			logger.warn("Invalid username or password.");
//		}
			if (rs.next()) {
				String authEmail = rs.getString("email");
				String authPassword = rs.getString("password");
				Predicate<Customer> auth = c -> c.getEmail().equals(authEmail) && c.getPassword().equals(authPassword);
				Customer customer = new Customer();

				if (auth.test(customer)) {
					System.out.println("Valid User");
				} else
					System.out.println("Invalid user");
			}

			rs.close();
			pstmt.close();

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se2) {

			}

		}

	}
}
