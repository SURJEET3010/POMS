/**
 * 
 */
package com.poms.app.menu;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.poms.constant.Constant;
import com.poms.dao.impl.CustomerDaoImpl;
import com.poms.model.Customer;
import com.poms.service.impl.CustomerServiceImpl;
import com.poms.util.MenuCard;
import com.poms.util.ShowText;

/**
 * @author Surjeet
 *
 */
public class MenuDrivenApplication {
	private static final Logger logger = Logger.getLogger(MenuDrivenApplication.class);

	/**
	 * @param args
	 * @throws SQLException
	 * 
	 */

	public static void main(String[] args) throws SQLException {
		customerMenu();
	}

	private static void customerMenu() throws SQLException {

		CustomerServiceImpl customerService = new CustomerServiceImpl();
		Customer customer = new Customer();

		boolean close = true;
		do {
			MenuCard.print();
			Scanner scan = new Scanner(System.in);

			char choice = scan.next().charAt(0);
			switch (choice) {
			case '1':
				customerService.resgisterCustomer(customer);
				break;
			case '2':

				// Get input from user
				Scanner sc = new Scanner(System.in);
				logger.info("Email: ");
				String email = sc.next();
				logger.info("Password: ");
				String password = sc.next();

				CustomerDaoImpl.login(email, password);

				break;
			case '3':
				ShowText.inCenter(Constant.EXIT_MESSAGE);
				break;
			default:
				ShowText.inCenter(Constant.ERROR_MESSAGE);
			}
			logger.info("Want to continue ? (y/n)");
			char tmp = scan.next().charAt(0);
			close = (tmp != 'n')? true:false;

		} while (close);
	}

}
