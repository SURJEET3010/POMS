package com.poms.dao;

import com.poms.model.Customer;

public interface CustomerDao {
	public Customer getCustomer(String customerName, String password);
}
