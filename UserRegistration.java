package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	private static String FirstNamepattern ="^[A-Z]{1}[a-z]+$" ;
	
	public void FirstnameValidation(String FirstNamepattern, String name) {
		Pattern p = Pattern.compile(FirstNamepattern);
		
		Matcher m = p.matcher(name);
		boolean result = m.matches();
		System.out.println(result);
	}
	public static void main(String[] args) {
		UserRegistration User = new UserRegistration();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("UserRegistration");
		
		System.out.println("Enter first name: ");
		String name = sc.next();
	User.FirstnameValidation(FirstNamepattern,name);
		
	
	}

}
