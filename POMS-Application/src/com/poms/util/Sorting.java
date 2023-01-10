package com.poms.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import com.poms.model.Customer;


public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		
		
//		Collections.sort(customer, new Comparator<Customer>() {
//			
//			
//		});
		
		Collections.sort(lst, new NameComparator());
		
		for(Customer c: lst) {
			
			System.out.println(c);
		}
		
		
//		sortByName();
		
	
	}

	
//	public static int stringCompare(String str1, String str2)
//    {
//  
//        int l1 = str1.length();
//        int l2 = str2.length();
//        int lmin = Math.min(l1, l2);
//  
//        for (int i = 0; i < lmin; i++) {
//            int str1_ch = (int)str1.charAt(i);
//            int str2_ch = (int)str2.charAt(i);
//  
//            if (str1_ch != str2_ch) {
//                return str1_ch - str2_ch;
//            }
//        }
//  
//        // Edge case for strings like
//        // String 1="Geeks" and String 2="Geeksforgeeks"
//        if (l1 != l2) {
//            return l1 - l2;
//        }
//  
//        // If none of the above conditions is true,
//        // it implies both the strings are equal
//        else {
//            return 0;
//        }
   // }
  
    
	
	public static void sortByName() {
		TreeSet<Customer> customer = new TreeSet<Customer>(new Comparator<Customer>(){
			@Override
			public int compare(Customer c1, Customer c2) {
				return c1.getCustomerName().compareTo(c2.getCustomerName());
				//return stringCompare(c1.getCustomerName(),c2.getCustomerName());
			}
		});
	}

}
