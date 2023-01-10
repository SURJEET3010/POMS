package com.java.util;

import java.util.Comparator;

import com.poms.model.Customer;

public class NameComparator implements Comparator<Customer> {

	public int compare(Customer c1, Customer c2) {
		return c1.getCustomerName().compareTo(c2.getCustomerName());
//		if(c1.getCustomerName()>c2.getCustomerName();{
	}

}
