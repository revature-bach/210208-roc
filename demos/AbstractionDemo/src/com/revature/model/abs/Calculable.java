package com.revature.model.abs;

public interface Calculable extends ParentInterface {

	// public abstract implicitly
	void calculateArea(); // abstract method
	
	// Some time later.. we add another abstract method
	// void anotherMethod(); // This would break previously existing code that was written before this update
	
	// so instead we can use the default keyword to get around this problem
	// 'default' allows us to provide a default implementation in our interface
	// instead of having an abstract method that you MUST be forced to implement
	default void anotherMethod() {
		System.out.println("anotherMethod() not yet implemented");
	}
	
	// public implicitly
	static void staticMethod() {
		System.out.println("This is a static method inside the Calculable interface");
	}
	
	// public static final implicitly
	int someVariable = 50;
	
}
