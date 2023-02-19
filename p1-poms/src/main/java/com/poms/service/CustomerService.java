/**
 * 
 */
package com.poms.service;

import java.sql.SQLException;
import java.util.Scanner;

import com.poms.model.Customer;

/**
 * @author Surjeet
 *
 */
public interface CustomerService {
	
	public void resgisterCustomer(Customer customer) throws SQLException;
	public void customerLogin(int customerId, Scanner input); 
	void viewOrdersDetails(int customerId) throws SQLException;
}
