package com.revature;

import java.util.Scanner;

import com.revature.customexceptions.DenominatorIsZeroException;
import com.revature.customexceptions.AnotherException;

public class UserInputDemo {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//ternary 
		int age = 20;
		String ageCategory = age < 18 ? "minor" : "adult";
		
		try {
			
			double num = method1(); // method1() throws DenominatorIsZeroException, so needs to be declared in the method 
			// or caught like in this example
			
			// method2(); // method2() throws AnotherException, so needs to be declared in the method
			// or caught like in this example
			
			System.out.println("The result of division is: " + num);
			
			return;
		} catch (DenominatorIsZeroException e)  { // both are checked exceptions
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) { // unchecked exception
			System.out.println("You entered a non-integer value!");
		} catch (RuntimeException e) { // unchecked exception
			System.out.println("Any other unchecked exception caught here besides NumberFormatException");
		} finally {
			System.out.println("This will always execute no matter what!");
		}
		
		System.out.println("End of program");
	}
	
	// throws v. throw v. Throwable
	
	public static double method1() throws DenominatorIsZeroException { // throws is used to declare that a method could have that exception occur
		System.out.println("Enter an integer numerator: ");
		int numerator = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter an integer denominator: ");
		int denominator = Integer.parseInt(sc.nextLine());
		
		if (denominator == 0) {
			DenominatorIsZeroException exc = new DenominatorIsZeroException("Denominator cannot be zero!!!");
			throw exc; // it's the actual place where you begin to propagate that exception
		}
		
		double result = (double) numerator / denominator;
		
		return result;
	}
	
	public static void method2() {
		throw new AnotherException();
	}

}
