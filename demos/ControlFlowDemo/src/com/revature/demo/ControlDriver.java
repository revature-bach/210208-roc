package com.revature.demo;

public class ControlDriver {

	public static void demo() {
		
		/*
		 * If statement
		 */
		int num = 100;
		if (num < 200) {
			System.out.println("The variable num is less than 200. It is " + num);
		}
		
		/*
		 * If-else statement
		 */
		if (num < 100) {
			System.out.println("The variable num is less than 100. It is " + num);
		} else {
			System.out.println("The variable num is greater than or equal to 100. It is " + num);
		}
		
		/*
		 * Chaining if-else statements
		 * (else if) structure
		 * 
		 * The first condition that is true will be the block that executes and only that block
		 * 
		 * This is what you would call mutually exclusive execution
		 */
		int age = 45;
		if (age < 18) {
			System.out.println("You are a minor!");
		} else if (age < 40) {
			System.out.println("You are a young adult");
		} else if (age < 65) {
			System.out.println("You are a middle aged adult");
		} else {
			System.out.println("You are 65 or older");
		}
		
		/*
		 * Nested if statements
		 */
		num = 10;
		if (num < 101) {
			System.out.println("The variable num is less than 101");
			
			if (num % 2 == 0) {
				System.out.println("The variable num is even");
			} else {
				System.out.println("The variable num is odd");
			}
			
		}
		
		/*
		 * Switch statements
		 * 
		 * work with byte, short, char, int, enums, String, and the primitive Wrapper classes for byte, short, char, and int
		 * 
		 */
		int month = 1;
		switch (month) {
		case 1:
			System.out.println("It is the first month of the year");
			System.out.println("It is January");
			break; // the break statement prevents "fall-through" execution from occuring
			// sometimes you might want fall-through in certain scenarios that you build out
			// but typically you won't
		case 2:
			System.out.println("It is February");
			break;
		case 3:
			System.out.println("It is March");
			break;
		case 4:
			System.out.println("It is April");
			break;
		default:
			System.out.println("It is not January, February, March, or April");
		}
		
		/*
		 * Loops (or looping statements)
		 * 
		 * - for loops
		 * - while loops
		 * - do while loops
		 */
		for (int i = 0; i < 1000; i = i + 1) {
			System.out.println("The value of i: " + i);
		}

		System.out.println("Done with the loop");
		
		for (int i = 5; i > 0; i--) {
			System.out.println("The value of i: " + i);
		}
		
		for (int i = 0; i < 100; i += 3) {
			System.out.println("The value of i: " + i);
		}
				
		/*
		 * While loops
		 */
		int number = 100;
		while (number > 0) {
			System.out.println("number: " + number);
			number--;
		}
		System.out.println(number);
		
		/*
		 * Do-while loop
		 */
		number = 0;
		do {
			System.out.println("number: " + number);
			number--;
		} while (number > 0);
		System.out.println(number);
		
		/*
		 * break, continue keywords
		 */
		
		// break
		for (int i = 1; i < 10; i++) {
			if (i % 5 == 0) {
				break;
			}
			
			System.out.println("i: " + i);
		}
		
		// continue
		// print out all numbers divisible by 3 from between 1-100
		System.out.println("============");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 != 0) {
				continue;
			}
			
			System.out.println("i: " + i);
		}
		
		// labels
		exampleLabel:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 5) {
					continue exampleLabel;
				}
				
				System.out.println("i: " + i + ", j: " + j);
			}
		}
		
		System.out.println("Loop is over");
		
		System.out.println("is prime?: " + isPrime(0));
		
		System.out.println(0 % 2);
		
		test();
	}
	
	public static boolean isPrime(int num) {
		
		if (num <= 0) return false;
		
		if (num <= 3) return true;
		
		for (int div = 2; div < num; div++) {
			if (num % div == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void test() {
		for (int i = 0; i < 50; i++) {
			if (i == 25) {
				return;
			}
			System.out.println(i);
		}
	}
	
}
