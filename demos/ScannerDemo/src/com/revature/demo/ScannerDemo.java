package com.revature.demo;

import java.util.Scanner;

import com.revature.model.Person;

public class ScannerDemo {

	private static Scanner sc = new Scanner(System.in);
	
	public static void demo() {
		
		String shouldContinue;
		do {
			System.out.println("Enter your firstname, lastname, age, salary, and favorite color: ");
			
			// String input
			String firstName = sc.nextLine();
			String lastName = sc.nextLine();
			int age = Integer.parseInt(sc.nextLine()); // sc.nextInt()
			double salary = Double.parseDouble(sc.nextLine()); // sc.nextDouble()
			// one way of getting around the issue here where we enter a number and then the nextLine statement after completely skips
			// would be to use another sc.nextLine()
//			sc.nextLine();
			String color = sc.nextLine();
			
			Person person = new Person(firstName, lastName, age, salary, color);
			System.out.println(person);
			
			System.out.println("Should we keep going? (y/n)");
			shouldContinue = sc.nextLine();
			
		} while (shouldContinue.equals("y"));
		
	}
	
}
