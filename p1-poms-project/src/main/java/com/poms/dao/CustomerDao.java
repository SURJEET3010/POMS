package com.poms.dao;

import java.sql.SQLException;
import java.util.List;

import com.poms.model.Customer;

public interface CustomerDao {
	
	void addCustomer(Customer customer) throws SQLException;
	public void viewOrders(int customerId) throws SQLException;
	//public void updateCustomer(int customerId) throws SQLException;
	
}
