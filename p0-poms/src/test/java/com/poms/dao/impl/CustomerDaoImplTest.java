/**
 * 
 */
package com.poms.dao.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.poms.app.menu.MenuDrivenApplication;
import com.poms.config.DatabaseConnection;
import com.poms.constant.Constant;
import com.poms.dao.CustomerDao;
import com.poms.model.Customer;
import com.poms.util.AgeCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * @author Surjeet
 *
 */
public class CustomerDaoImplTest{
	
	Customer testCustomer;

	@Test
	public void testInsertUser() {
		CustomerDaoImpl toBeInserted = new CustomerDaoImpl();
		CustomerDaoImpl inserted = new CustomerDaoImpl();
	
		assertNotEquals(inserted, toBeInserted);
	}

	}

