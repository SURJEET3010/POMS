package com.poms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateCheck {

	public static void main(String[] args) {

		boolean check = false;
		while (!check) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter date: ");
			String date = scan.next();
			
			if (validate(date)) {
				System.out.println("Valid ");
				check = true;
			} else {
				System.out.println("Not Valid!");
			}
		}
	}

	public static boolean validate(final String date) {
		final String DATE_PATTERN = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";
		Pattern pattern = Pattern.compile(DATE_PATTERN);
		Matcher matcher = pattern.matcher(date);
		return matcher.matches();
	}

}
