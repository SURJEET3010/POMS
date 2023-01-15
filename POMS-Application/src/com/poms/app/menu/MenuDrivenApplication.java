/**
 * 
 */
package com.poms.app.menu;

import java.util.Objects;
import java.util.Scanner;

import com.poms.dao.CustomerDao;
import com.poms.dao.impl.CustomerDaoImpl;
import com.poms.util.MenuCard;

/**
 * @author Surjeet
 *
 */
public class MenuDrivenApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // throws IOException, SQLException {
		char choice = 'y';
		CustomerDao userDao = new CustomerDaoImpl();
		do {
			MenuCard.print();
			Scanner choiceScan = new Scanner(System.in);
			choice = choiceScan.next().charAt(0);
			switch (choice) {
			case '1':
				addForm(userDao);
				break;
			case '2':
				updateForm(userDao);
				break;
			case '3':
				deleteForm(userDao);
				break;
			case '4':
				searchSpecificForm(userDao);
				break;
			default:
				System.out.println("      Wrong option selected!");
			}
		} while (choice !='n');
	}

	private static void searchSpecificForm(CustomerDao userDao) { // throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("You Selected -Search Guest");
		System.out.print("Please Enter Login ID To Search:");
		String loginId = scan.nextLine();
		
//		CustomerDao found = userDao.getUser(loginId.trim());
//		if (Objects.nonNull(found)) {
//			System.out.println("Guest Found!");
//			System.out.println(found);
//		} else {
//			System.out.print("Guest Not Found!");
//		}
	}

	private static void deleteForm(CustomerDao userDao) { //throws SQLException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("You Selected -Delete Guest");
		System.out.print("Please Enter Login ID To Delete:");
		
		String loginId = scan.nextLine();
		
//		if (Objects.nonNull(userDao.getUser(loginId))) {
//			int result = userDao.delete(loginId.trim());
//			if (result > 0)
//				System.out.print("Guest Deleted sucessfully!");
//		} else {
//			System.out.print("Incorrect Login Id!");
//		}
	}

	private static void updateForm(CustomerDao userDao) { // throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("You Selected -Update Guest");
		System.out.print("Please Enter You Login ID:");
		
		String loginId = scan.nextLine();
		
//		if (Objects.nonNull(userDao.getUser(loginId))) {
//			System.out.print("Please Enter New Password:");
//			String password = scan.nextLine();
//			int result = userDao.update(new CustomerDao(loginId.trim(), password.trim(), DateTimeUtil.getCurrentDateTime()));
//			if (result > 0)
//				System.out.print("Guest Updated sucessfully!");
//		} else
//			System.out.print("Incorrect Login Id!");
	}

	private static void addForm(CustomerDao userDao) { // throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("You Selected -Add Guest");
		System.out.print("Please Enter You Login ID (can't change later):");
		String loginId = scan.nextLine();
		
		
//		if (Objects.isNull(userDao.getUser(loginId))) {
//			System.out.print("Please Enter You Password:");
//			String password = scan.nextLine();
//			int result = userDao.add(new CustomerDao(loginId.trim(), password.trim(), DateTimeUtil.getCurrentDateTime()));
//			if (result > 0)
//				System.out.print("Guest added sucessfully!");
//		}
//		else {
//			System.out.print("Login Id Already Taken!");
//		}
	}

}
