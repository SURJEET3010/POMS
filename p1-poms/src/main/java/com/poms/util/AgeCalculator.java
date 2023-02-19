package com.poms.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class AgeCalculator {
	
	private static final String DATE_PATTERN = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";

	private static Pattern pattern;
	private static Matcher matcher;


	private static  boolean validate(final String date){
		pattern = Pattern.compile(DATE_PATTERN);
	    matcher = pattern.matcher(date);
	    return matcher.matches();
	}
	
	public static int getAge(String dob){
	
	if (validate(dob)) {
	System.out.println(dob + " is a valid date.");
	
	LocalDate today = LocalDate.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	LocalDate birthdate = LocalDate.parse(dob, formatter);
	Period age = Period.between(birthdate, today);
	
	int custAge = age.getYears()+ (age.getMonths()/12);
//	System.out.println(custAge);
	
	return custAge;
	
	} else {
		
		return 0;
	}
	}
		
}



