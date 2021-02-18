package com.revature.demo;

public class ScopeDemo {

	static int a; // static scoped variable
	int b; // instance scoped variable
	
	public static void demo() {
		a = 20;
		System.out.println(a);
		System.out.println(ScopeDemo.a);
		
		ScopeDemo demo = new ScopeDemo();
		demo.b = 10;
		
		// myInt and sum are method scoped variables.
		// They only exist within the context of this method executing
		int[] myInts = { 10, 20, 30, 40 };
		int sum = calculateArrSum(myInts);
		
		System.out.println(sum);
		
		demo.instanceMethod();
		
		/*
		 * Block scope
		 */
		int i = 0;
		if (sum > 50) {
			i = 50;
			i += sum;
		}
		
		System.out.println(i);
		
	}
	
	public static int calculateArrSum(int[] arr) {
		int sum = 0; // method scoped variable
		
		// i is a block scoped variable
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum;
	}
	
	public void instanceMethod() {
		System.out.println("Inside instanceMethod()");
		
		sayHi();
		
		System.out.println(a);
	}
	
	public static void sayHi() {
		System.out.println("Hi!");
	}
	
}
