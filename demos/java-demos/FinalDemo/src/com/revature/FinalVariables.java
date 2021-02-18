package com.revature;

import java.util.Arrays;

public class FinalVariables {

	public static void main(String[] args) {
		
		final int x; // perfectly valid, I can declare it as final and not assign anything yet
		x = 10; // as soon as I assign my first value, that value is set in stone
		
//		x = 100; // cannot set the value another time
		
		final int y = 100;

		
		/*
		 * Reference variables that are final
		 * 
		 * For reference variables that are final, we can still modify the properties of the object that variable is pointing to
		 * all we want. 
		 * 
		 * What we cannot do is change the object that the variable is pointing to to something else
		 */
		final int[] arr = new int[] {10, 20, 30};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr)); // toString() from Arrays not to be confused with toString from the Object class
		// the toString from Arrays is a static method, while toString that we have talked about is an instance method
		
		arr[1] = 1000;
		System.out.println(Arrays.toString(arr));
		
//		arr = new int[] {100, 54, 23, 50, 100, 1000}; // NOT ALLOWED
		
	}

}
