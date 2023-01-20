package com.poms.service.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.poms.app.menu.MenuDrivenApplication;
import com.poms.config.DatabaseConnection;
import com.poms.constant.Constant;
import com.poms.constant.QueryList;
import com.poms.dao.CustomerDao;
import com.poms.dao.impl.CustomerDaoImpl;
import com.poms.model.Customer;
import com.poms.service.CustomerService;
import com.poms.util.AgeCalculator;


public class CustomerServiceImpl implements CustomerService{
	
	private static final Logger logger=Logger.getLogger(MenuDrivenApplication.class);
	static Connection con = DatabaseConnection.getConnection();
	
	
	//  --------- Email Validation ------------------
	private static boolean emailValidation(String email) {

		Pattern pat = Pattern.compile(Constant.EMAIL_PATTERN);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	// ------------ Phone number validator ---------------------
	private static boolean phoneValidation(long phone) {

		Pattern pattern = Pattern.compile(Constant.PHONE_PATTERN);
		Matcher matcher = pattern.matcher(Long.toString(phone));
		return matcher.matches(); // returns true if pattern matches, else returns false
	}

	// ---------- Age generator -----------------------------

	public static int generateAge(String dateOfBirth) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constant.DATE_PATTERN_FORMATTER);
		LocalDate birthDate = LocalDate.parse(dateOfBirth, formatter);
		LocalDate currentDate = LocalDate.now();
		Period age = Period.between(birthDate, currentDate);

		return age.getYears();
	}

	// ------------- Date check ---------------------------------
	public static boolean validate(final String date) {

		Pattern pattern = Pattern.compile(Constant.DATE_PATTERN);
		Matcher matcher = pattern.matcher(date);
		return matcher.matches();
	}


	
	@Override
	public void resgisterCustomer(Customer customer) throws SQLException{


		Scanner scan = new Scanner(System.in);
		logger.info(Constant.ENTER_DETAIL_MSG);

		logger.info(Constant.CUSTOMER_NAME);
		String name = scan.next();
		customer.setCustomerName(name);

		// email validation and insertion

		String email = "";
		boolean check = false;
		while (!check) {

			logger.info(Constant.CUSTOMER_EMAIL);
			email = scan.next();
			if (emailValidation(email)) {
				customer.setEmail(email);
				check = true;
			} else {
				logger.warn("Invalid Email");
			}
		}

		long phone;
		boolean check1 = false;
		while (!check1) {

			logger.info(Constant.CUSTOMER_CONTACT);
			phone = scan.nextLong();
			if (phoneValidation(phone)) {
				customer.setPhone(phone);
				check1 = true;
			} else {
				logger.warn("Invalid Contact no. !");
			}
		}

		logger.info(Constant.CUSTOMER_ADDRESS);
		String address = scan.next();
		customer.setAddress(address);

		boolean check3 = false;
		String dateOfBirth;
		while (!check3) {

			logger.info(Constant.CUSTOMER_DATE_OF_BIRTH);
			dateOfBirth = scan.next();
			if (validate(dateOfBirth)) {
				check3 = true;
				customer.setDateOfBirth(dateOfBirth);
				customer.setAge(AgeCalculator.getAge(dateOfBirth));
				
			} else {
				logger.warn("Not Valid!");
			}
		}

		logger.info(Constant.CUSTOMER_ID_PROOF);
		String idProof = scan.next();
		customer.setIdProof(idProof);

		logger.info(Constant.CUSTOMER_PREFERRED_lOGIN_ID);
		String loginId = scan.next();
		customer.setPreferredLoginId(loginId);

		logger.info(Constant.CUSTOMER_PASSWORD);
		String password = scan.next();
		customer.setPassword(password);

		CustomerDaoImpl newCustomer = new CustomerDaoImpl();

		try {
			newCustomer.addCustomer(customer);
			logger.info("\n");
			logger.info("\t******You have successfully registered******");
			logger.info("To sign in press 1");
			logger.info("Any other key to exit");

			int choice = scan.nextInt();
			if (choice == 1) {
				newCustomer.login(email, password);
			} else {
				return ;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	

	@Override
	public void viewOrdersDetails(int customerId) throws SQLException {

		ResultSet rs = null;
		PreparedStatement ptstmt = null;

		try {
			ptstmt = con.prepareStatement(QueryList.SELECT_ITEMS_QUERY);
			//ptstmt.setInt(customerId, customerId);
			rs = ptstmt.executeQuery();

			while (rs.next())
				logger.info(rs.getString(1));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void customerLogin(int customerId, Scanner input) {

		
	}
	

}

