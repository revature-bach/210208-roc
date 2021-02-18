package com.revature.app;

public class Driver {

	// Default values apply for static variables belonging to a class
	// OR instance variables
	public static boolean myStaticBoolean; // false is default (static variables)
	public static int myStaticInt; // 0 is default (static variables)
	
	public int myInstanceInt; // 0 is default, (instance variable)
	
	public static void main(String[] args) {
		
		/*
		 * Two concepts:
		 * 1. Declaration: this is where we actually declare a new variable (pop it into existence)
		 * 2. Initialization: this is where we assign some value for the very first time to a variable
		 * 
		 * It is certainly possible to declare and initialize on the same line
		 */
		
		/*
		 * Integral Types
		 */
		
		// 8 bits
		byte myByte; // I have not initialized this variable yet, only declared it
		myByte = 10; // this is where I actually initialize it
		
		byte mySecondByte = 20; // declaration and initialization on the same line
		
		System.out.println("myByte: " + myByte);
		System.out.println("mySecondByte: " + mySecondByte);
		
		System.out.println("myStaticInt: " + myStaticInt);
		
		Driver d = new Driver();
		System.out.println("myInstanceInt: " + d.myInstanceInt);
		
		myByte = 30;
		System.out.println("new value of myByte: " + myByte);
		
		// 16 bits
		short myShort = 25_767; // _ is for readability, you cannot use "," to separate digits. _ cannot be at the beginning or end
		// or adjacent to a decimal point in the case of floating-point literals.
		
		// 32 bits
		int myInt = 1_000_000_567;
		long myLong = 4345634234234L; // with the L, we signify that it is a long
		long mySecondLong = 1000; // implicit cast from int to long, because 1000 is an int literal
		
		// type sysout and ctrl + space as a shortcut so you don't have to type out System.out.println every time
		System.out.println("myShort: " + myShort);
		System.out.println("myInt: " + myInt);
		System.out.println("myLong: " + myLong);
		System.out.println("mySecondLong: " + mySecondLong);
		
		char c = 1000; // I put this in the "Character type category", but it can technically also store numbers
		// In this case, only positive numbers
		
		// Floating Types
		float myFloat = 3.14159f; // f to signify a float literal
		double myDouble = 41.4545;
		System.out.println("myFloat: " + myFloat);
		System.out.println("myDouble: " + myDouble);
		
		// Character Type
		c = 'A'; // note here, char can only contain a single character/letter. It is enclosed by single quotes ' ', which is different
		// from the double-quotes " " for String literals
		System.out.println("char c: " + c);
		
		// Boolean type
		boolean myBoolOne = true;
		System.out.println("myBoolOne: " + myBoolOne);
		
		myBoolOne = false;
		System.out.println("myBoolOne: " + myBoolOne);
		
		boolean myBoolTwo = (10 == 100); // 10 == 100 is an expression that evaluates to false
		System.out.println("myBoolTwo: " + myBoolTwo);
	}

}
