package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration1 {
	
		private static String EMAIL = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		
	    private static String PHONE_NUMBER = "^\\+?\\d[0-9\\-\\(\\)\\, ]+$";
	    
	    private static String PASSWORD = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";

	    static boolean isMailValid, isNumberValid, isPasswordValid;
	    
	    public boolean validateEmail(String mail) {
	        isMailValid = Pattern.matches(EMAIL, mail);
	        if (!isMailValid) {
	            System.out.println("E-mail is invalid...Please enter e-mail");
	            System.exit(0);
	        }
	        return Pattern.matches(EMAIL, mail);
	    }

	    public boolean validatePhoneNumber(String phoneNumber) {
	        isNumberValid = Pattern.matches(PHONE_NUMBER, phoneNumber);
	        if (!isNumberValid) {
	            System.out.println("Phone Number is invalid...Please enter proper phone-number");
	            System.exit(0);
	        }
	        return Pattern.matches(PHONE_NUMBER, phoneNumber);
	    }

	    public boolean validatePassword(String password) {
	        isPasswordValid = Pattern.matches(PASSWORD, password);
	        if (!isPasswordValid) {
	            System.out.println("Password is invalid...Please enter proper password");
	            System.exit(0);
	        }
	        return Pattern.matches(PASSWORD, password);
	    }

	    public void register() {
	        if (isMailValid && isNumberValid & isPasswordValid) {
	            System.out.println("You are registered!!!");
	            System.out.println("Welcome");
	        }
	    }
}
