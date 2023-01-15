/**
 * 
 */
package com.poms.service;

import com.poms.model.Customer;

/**
 * @author Surjeet
 *
 */
public interface CustomerService {
	public Customer postAuthenticationGetUser(String customerName, String password);
}
