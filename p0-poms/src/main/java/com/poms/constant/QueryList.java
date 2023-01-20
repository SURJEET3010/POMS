package com.poms.constant;

public class QueryList {
	
	private QueryList() {}

	public static final String SELECT_ITEMS_QUERY = "SELECT * FROM `poms`.`items`;";
	
	//public static final String SELECT_SPECIFIC_QUERY = "SELECT `LOGIN_ID`,`PASSWORD`,`LAST_MODIFIED` FROM `gd`.`authentication` WHERE `LOGIN_ID`=? ";
	
	public static final String INSERT_QUERY = "INSERT INTO  `poms`.`customer`(customer_name, email, phone, address, date_of_birth, age, password, identity_proof, preferred_login_id ) VALUES (?,?,?,?,?,?,?,?,?)";
	
	public static final String UPDATE_CUSTOMER_QUERY = "UPDATE `poms`.`customer` SET ? = ? where customer_id = ?;";
	
	//public static final String DELETE_QUERY = "DELETE FROM `poms`.`customer` WHERE `Customer_ID`=? ";
	
	public static final String SELECT_LOGIN_QUERY = "SELECT * FROM customer WHERE email = ?  AND password = ? ;";

}
