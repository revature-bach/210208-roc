package com.revature.demo;

public class Application {

	// public is an access modifier
	// static is an example of a non-access modifier
	// void is the return type of the method
	public static void main(String[] args) {
		
		System.out.println("Application starting up");
		
		anotherMethod();
		
		yetAnotherMethod();
		
		greetUser("Bach");
		
		// This is for accessing static methods
		AnotherClass.hotdogs(); // runs the hotdogs() method from the AnotherClass class
		
		System.out.println("We're now done");
		
	}
	
	public static void anotherMethod() {
		
		System.out.println("I am inside anotherMethod");
		
	}
	
	public static void yetAnotherMethod() {
		
		System.out.println("yetAnotherMethod running..");
		
	}
	
	public static void greetUser(String name) {
		
		System.out.println("Hello, " + name);
		
	}

}
