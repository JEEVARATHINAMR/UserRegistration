package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	private static String FirstNamepattern ="^[A-Z][a-z]{3,}$" ;
	private static String LastNamepattern = "^[A-Z][a-z]{3,}$";
	
	public void FirstnameValidation(String FirstNamepattern, String name) {
		Pattern p = Pattern.compile(FirstNamepattern);

		Matcher m = p.matcher(name);
		boolean result = m.matches();
		System.out.println(result);
	}
	public void LastnameValidation(String LastNamepattern,String name) {
		Pattern p = Pattern.compile(LastNamepattern);
		
		Matcher m = p.matcher(name);
		boolean result = m.matches();
		System.out.println(result);
	}
	public static void main(String[] args) {
		UserRegistration User = new UserRegistration();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("UserRegistration");
		
		System.out.println("Enter first name: ");
		System.out.println("Enter Last name: ");
	
		String name = sc.next();
	User.FirstnameValidation(FirstNamepattern,name);
	
	User.LastnameValidation(LastNamepattern,name);
		
	
	}

}
