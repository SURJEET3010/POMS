package com.poms.service.impl;

import com.poms.dao.CustomerDao;
import com.poms.dao.impl.CustomerDaoImpl;
import com.poms.model.Customer;
import com.poms.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{
	CustomerDao customerDao;
	private Object username;
	private Object password;

	public CustomerServiceImpl() {
		super();
		this.customerDao = new CustomerDaoImpl();
	}


	@Override
	public Customer postAuthenticationGetUser(String customerName, String password) {
		
		return null;
	}
	
	/**
	
	Customer jdbcFoundUser = customerDao.getUser(username,password);
	if(Objects.notnull(jdbcFoundUser)){
	//  
	if(jdbcFoundUser.getRole()=="Admin"){
	//com.revature.menu/view call menus for Admin menus
	}
	else if(jdbcFoundUser.getRole()=="Receptionist"){
	//com.revature.menu/view call menus for receptionist menus
	 }
	else{
	}
		// com.revature.menu/view call menus for customer menus
	}
	
	**/
}

