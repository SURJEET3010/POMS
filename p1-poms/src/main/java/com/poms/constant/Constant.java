/**
 * 
 */
package com.poms.constant;

/**
 * @author Surjeet
 *
 */
public class Constant {
	private Constant() {
	}

	public static final String DATABASE_URL = "jdbc:mysql://localhost:3306/poms";
	public static final String DATABASE_USERNAME = "Surjeet";
	public static final String DATABASE_PASSWORD = "QAZwsx@1234";

	public static final String WELCOME_MESSAGE = "*****WELECOME TO PIZZA STORE*****";
	public static final String EXIT_MESSAGE = "THANK YOU";
	public static final String ERROR_MESSAGE = "WRONG SELECTION";
	public static final String ENTER_DETAIL_MSG = "PLEASE ENTER FOLLOWING DETAILS";

	public static final String LOGIN_ID = "Enter Customer Id";

	public static final String INSERT_CUSTOMER_DETAILS = "Press 1 to insert Customer details:-";
	public static final String UPDATE_CUSTOMER_DETAILS = "Press 2 to update Customer details:-";
	public static final String DELETE_CUSTOMER_DETAILS = "Press 3 to delete Customer details:-";
	public static final String SELECT_CUSTOMER = "Press 4 to get Customer details:-";

	// Update messages

	public static final String CUSTOMER_NAME = "Enter the name of Customer:-";
	public static final String CUSTOMER_EMAIL = "Enter the email of Customer:-";
	public static final String CUSTOMER_ADDRESS = "Enter the address of the Customer:-";
	public static final String CUSTOMER_CONTACT = "Enter the contact no of Customer:-";
	public static final String CUSTOMER_DATE_OF_BIRTH = "Enter the date of birth of Customer:-";
	public static final String CUSTOMER_AGE = "Enter the age of Customer:-";
	public static final String CUSTOMER_ID_PROOF = "Enter the id proof (PAN/ Adhaar / Voter card) of Customer:-";
	public static final String CUSTOMER_PREFERRED_lOGIN_ID = "Enter preferrd login id of Customer:-";
	public static final String CUSTOMER_PASSWORD = "Enter the password of Customer:-";
	public static final String CUSTOMER_ID = "Enter the ID of Customer:-";

	public static final String EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@"
			+ "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
	public static final String PHONE_PATTERN = "^\\d{10}$";
	public static final String  DATE_PATTERN_FORMATTER= "dd/MM/yyyy";
	public static final String DATE_PATTERN = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$"; 
	
	
	public static final String END_MESSAGE = "*****THANK YOU******";

}
