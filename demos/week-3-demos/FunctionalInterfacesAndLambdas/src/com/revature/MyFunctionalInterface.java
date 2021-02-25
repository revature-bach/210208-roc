package com.revature;

// The definition of a Functional interface is an interface that has only 1 abstract method
// They can still have as many static methods as they want
// As well as as many default methods as they want
public interface MyFunctionalInterface {

	public boolean test(String s); // this is our abstract method, and is the 1 and only that we can have
	// for this to be a functional interface
	
}
