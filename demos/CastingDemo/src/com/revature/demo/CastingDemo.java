package com.revature.demo;

import java.util.ArrayList;

public class CastingDemo {

	public static void main(String[] args) {
		
		/*
		 * Implicit casting example
		 * 
		 * Widening conversion from int to long
		 * since ints can fit inside longs
		 * 
		 * Implicit
		 */
		long myLong; // declaration only
		int myInt = 1000;
		
		myLong = myInt; // a long can always fit a value stored inside an int because it is wider in range
		System.out.println("myLong: " + myLong);
		
		/*
		 * Explicit casting example
		 * 
		 * Narrowing conversion from long to int
		 */
		
		int myInt2;
		myInt2 = (int) myLong; // explicitly casting from a long value to an int
		
		long myLong2 = 100; // 100 can fit inside a long, so we're good, even though 100 is an int literal
		myLong2 = 1000000;
		byte myByte = (byte) myLong2;
		System.out.println("myByte: " + myByte);
		
		// Narrowing from double to int
		double myDouble = 13.99999999;
		System.out.println((int) myDouble);
		System.out.println(myDouble);
		System.out.println(Math.ceil(13.9999));
		
		/*
		 * Reference type casting
		 * 
		 * 1. upcasting: from more specific to less specific
		 * 2. downcasting: from less specific to more specific
		 */
		
		// Strings are objects
//		String myStr = "Hello there!";
		String myStr = "Hello there!";
		
		// Every object "extends" from a class called 'Object'
		// The special Object class is extended either directly or indirectly by all other classes in Java.
		// So in other words, a String is an Object
		// But not all Objects are Strings
		
		Object myObj = myStr; // implicit cast from String (which is more specific) to Object (which is less specific)
		// Nothing about the string object changed, it's just that we are using an Object reference variable to point to the exact
		// same object that myStr is pointing to
		
		// Downcasting is unsafe
		// We need to know what object is actually being referred to
		// to not have any issues
		String myStr2 = (String) myObj;
		
		ArrayList al = (ArrayList) myObj;
		
	}

}
