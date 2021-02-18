package com.revature.demo;

import java.util.Arrays;

public class Demo {

	public static void demo() {
		// Array declarations
		int myIntArray[];
		int[] myOtherIntArray; // this way is more popular and typical
		
		// Array instantiation
		myIntArray = new int[5]; // we instantiate an array of type int with 5 elements
		// upon instantiation we might have default values
		// 0 for numbers.. 0.0
		// false for boolean
		// for objects in general.. null
		
		System.out.println(myIntArray);
		System.out.println(Arrays.toString(myIntArray));
		
		myOtherIntArray = new int[] { 100, 56, 42, 1000, 324 };
		System.out.println(Arrays.toString(myOtherIntArray));
		myOtherIntArray[3] = 500;
		System.out.println(Arrays.toString(myOtherIntArray));
		System.out.println(myOtherIntArray.length);
		
		char[] myCharArray = {'a', 'b', 'c'}; // shorthand when you are both declaring and instantiating an array on the same line
		
		// for loop iteration
		for (int i = 0; i < myCharArray.length; i++) {
			System.out.println("value at index " + i + " : " + myCharArray[i]);
		}
		
		// enhanced for loop
		for (char c : myCharArray) {
			System.out.println(c);
		} // enhanced for loop is less flexible, but more convenient
		
		// We wouldn't be able to do reverse traversal like we can here
		for (int i = myCharArray.length - 1; i >= 0; i--) {
			System.out.println(myCharArray[i]);
		}
		
		// We can also have arrays that contain references to objects of a certain type, for example Strings
		String[] names = new String[3];
		names[0] = "John";
		names[1] = "Jose";
		names[2] = "Pedro";
		System.out.println(Arrays.toString(names));
		
		for (String name : names) {
			System.out.println(name);
		}
		
		// multi-dimensional arrays
		int[][] the2DArray = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		System.out.println(the2DArray[2][0]);
		
		// Nested for loops to traverse through a 2D array
		for (int i = 0; i < the2DArray.length; i++) {
			for (int j = 0; j < the2DArray[i].length; j++) {
				System.out.println("i: " + i + ", j: " + j + " : " + the2DArray[i][j]);
			}
		}
		
		// enhanced for loop
		for (int[] myArray : the2DArray) {
			for (int number : myArray) {
				System.out.println(number);
			}
		}
	}
	
}
