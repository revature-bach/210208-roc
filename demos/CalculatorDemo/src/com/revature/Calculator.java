package com.revature;

public class Calculator {
	
	// Object oriented programming is a paradigm in which we revolve around the idea of objects
	// Classes are typically used as blueprints for objects
	// Inside these "blueprints" we can define 2 sorts of things:
	// 1. state: different variables, properties that that object has
	// 2. behavior: actual logic that happens, (methods)
	
	/*
	 * Whenever there is no static keyword on the variable or the method, it's describing an object of that class
	 * instead of belonging to the class itself
	 * 
	 * So to use these methods and variables, we need to create objects for them
	 */
	
	
	// This is an example of an instance variable that will belong to an object
	public String name;
	
	// Here's a static variable that belongs to the class itself and is shared by all objects
	public static String nameTwo;
	
	// This method is not static like our previous examples
	// meaning this method does not belong to the class itself, but to an object of that class
	// It is also not void like the previous examples
	// it returns some sort of value.. in this case the two parameters being added together
	// The naming does not actually matter in how the method itself behaves, we could name it whatever we want to
	// But in this case, it makes sense to call it add, because we know that it is adding two numbers together
	public int add(int x, int y) {
		int result = x + y;
		return result;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
}
