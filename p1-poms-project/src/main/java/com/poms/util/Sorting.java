package com.poms.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import com.poms.model.Customer;
/**
 * 
 * 
 * Utility methods to sort the data for specific attribute
 * 
 * */

public class Sorting {

	// main method
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Zoya", "xdse@bmail.com", 90909090, "Moscow", "1998-10-10",23, "XXXXXXX", "Addhaar", "email", 011);
		Customer customer2 = new Customer("Alexa", "Alexx@rev.com", 90909090, "Londin", "1999-09-11",22, "XXXXXXX", "Addhaar", "email", 012);
		Customer customer3 = new Customer("Yusuf", "YT@k.com", 90909090, "Tokyo", "2001-10-10",21, "XXXXXXX", "Addhaar", "email", 014);
		Customer customer4 = new Customer("Xavier", "loki@outlook.com", 90909090, "Denver", "2001-10-12",21, "XXXXXXX", "Addhaar", "email", 015);
		Customer customer5 = new Customer("Bunty", "bse@rev.lop", 90909090, "London", "2000-10-10",23, "XXXXXXX", "Addhaar", "email", 016);
	
		
		List<Customer>  lst= new ArrayList<Customer>();
		
		lst.add(customer1);
		lst.add(customer2);
		lst.add(customer3);
		lst.add(customer4);
		lst.add(customer5);
		
		// Sorting using anonymous comparator class
		
		Collections.sort(lst, new NameComparator());
		
		for(Customer c: lst) {
			
			System.out.println(c);
		}

		// Sorting Using Method
		
//		sortByName();
		
	
	}

	
	public static void sortByName() {
		TreeSet<Customer> customer = new TreeSet<Customer>(new Comparator<Customer>(){
//			@Override
			public int compare(Customer c1, Customer c2) {
				return c1.getCustomerName().compareTo(c2.getCustomerName());
			}
		});
	}

}
