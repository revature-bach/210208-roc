package com.revature;

public class StringBuilderExample {

	public static void main(String[] args) {
		String str = "apple";
		
		String result;
		
		long startTime = System.nanoTime();
		result = reverseStringInefficient(str);
		long endTime = System.nanoTime();
		System.out.println(result + " took " + (endTime - startTime) + " nanoseconds");
		
		startTime = System.nanoTime();
		result = reverseStringEfficient(str);
		endTime = System.nanoTime();
		System.out.println(result + " took " + (endTime - startTime) + " nanoseconds");
	}
	
	public static String reverseStringInefficient(String str) {
		
		String result = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i); // String concatenation (creating a new object every time)
		}
		
		return result;
	}
	
	public static String reverseStringEfficient(String str) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i)); // modifying internal value of StringBuilder
		}
		
		return sb.toString();
	}

}
