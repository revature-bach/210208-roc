package com.revature;

public class StringExamples {

	public static void main(String[] args) {
		
		// Declare and initialize Strings using String literals
		String str1 = "hi";
		String str2 = "hi";
		
		System.out.println("str1 and str2 pointing to the same object?: " + (str1 == str2));
		
		System.out.println("1" + 1 + 1); // "1" + 1 + 1 -> "11" + 1 -> "111"
		System.out.println(1 + "2" + 3); // "123"
		System.out.println(1 + 1 + "2"); // "22"
		
		String str3 = "i";
		String str4 = "h" + str3;
		System.out.println(str4 == str2);
		
		// concat
		String concatExample = "h".concat("i"); // heap
		System.out.println(concatExample == "hi");
		System.out.println(concatExample.equals("hi"));
		
		// contains
		String str5 = "Hello, my name is Bob";
		System.out.println(str5.contains("name"));
		
		// startsWith
		System.out.println(str5.startsWith("Hello"));
		System.out.println(str5.startsWith("ello", 1));
		
		// endsWith
		System.out.println(str5.endsWith("Bob"));
		
		// compareTo
		System.out.println("apple".compareTo("apricot"));
		// if your number is < 0, the string is coming before
		// if it is 0, they are equal
		// if it is > 0, it comes after
		
	}

}
