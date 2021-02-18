package com.revature.demo;

import java.util.ArrayList;

public class WrapperDemo {
	
	public static void demo() {
		System.out.println("Max value that an integer can have: " + Integer.MAX_VALUE);
		System.out.println("Min value that an integer can have: " + Integer.MIN_VALUE);
		
		int primitiveInt = 5;
		Integer wrapperInt1 = new Integer("5");
		Integer wrapperInt2 = new Integer(5);
		
		// Autoboxing
		Integer wrapperIntAutoboxing = 5; // Convert from a primitive int 5 to Integer wrapper object automatically
		
		Integer result = 50 + wrapperIntAutoboxing; // it will **unbox** wrapperIntAutoboxing into a primitive,
		// this primitive will then be added to 50.. the result will then be autoboxed into a wrapper object.
		
		System.out.println(result);
		int unboxingExample = wrapperIntAutoboxing; // wrapperIntAutoboxing is being unboxed into a primitive int
		
		// Sneak peak at Collections
		// Here is an ArrayList
		ArrayList<Integer> arrayList = new ArrayList<>(); // This ArrayList can contain Integer objects
		arrayList.add(1); // 1 is a primitive being autoboxed into an Integer object
		arrayList.add(2); // 2 " "
		
		System.out.println(arrayList.get(0));
		
		System.out.println("wrapperInt1 == wrapperInt2: " + (wrapperInt1 == wrapperInt2)); // FALSE! why??
		// We are comparing the memory addresses of both reference variables
		// We are seeing if wrapperInt1 and wrapperInt2 point to the same object
		// They don't, so it's false
		
		// So the above is also true for things like Strings
		String myStr = "hello";
		String myStr2 = "hello";
		System.out.println("myStr == myStr2: " + myStr == myStr2); // myStr and myStr2 are pointing to the same string literal in the string pool
		
		String myStr3 = new String("hello"); // the string that myStr3 is pointing to is in the heap.. totally different object from the 
		// string literal in the string pool
		
		System.out.println("myStr == myStr3: " + myStr == myStr3); // false
		
		// This is where we want to use something like .equals()
		System.out.println("myStr.equals(myStr3): " + myStr.equals(myStr3));
		
		
		/*
		 * 
		 */
		System.out.println("wrapperInt1.equals(wrapperInt2): " + wrapperInt1.equals(wrapperInt2));
	}
	
	public static void parsing() {
		int parsedInt = Integer.parseInt("5");
		System.out.println("parsedInt: " + parsedInt);
		
		Integer parsedWrapperInt = Integer.valueOf("5");
		System.out.println("parsedWrapperInt: " + parsedWrapperInt);
	}
	
}
