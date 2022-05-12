package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration_Main {
	
	public static void main(String[] args) {
		

        UserRegistration1 registration = new UserRegistration1();
        Scanner scanner = new Scanner(System.in);
        
	 System.out.println("Enter Email: ");
     String email = scanner.next();
     registration.validateEmail(email);

     System.out.println("Enter Phone-Number");
     String number = scanner.next();
     registration.validatePhoneNumber(number);

     System.out.println("Enter Password: ");
     String password = scanner.next();
     registration.validatePassword(password);
     registration.register();

	}
}