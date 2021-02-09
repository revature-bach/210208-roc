package com.revature.model;

public class Animal {
	
	public int numOfLegs;
	public String fur;
	public String diet;
	public boolean hasTail;
	public Gender gender;
	public String color;
	
	public String testVar = "123";
	
	/*
	 * If no user-defined constructor is present, then the default constructor is added by the compiler
	 * Otherwise, it is not included
	 */
	// This is basically what the default constructor looks like when we don't define our own constructors
//	public Animal() {
//		super();
//	}
	
	// But since we are defining our own constructors, if we want to have a no-args constructor, we must now define it ourselves
	public Animal() {
		System.out.println("Default constructor invoked");
		// maybe I could set default values here
		this.numOfLegs = 4;
		this.fur = "brown";
		this.diet = "food";
		this.hasTail = true;
		this.gender = Gender.FEMALE;
		this.color = "brown";
	}
	
	public Animal(int numOfLegs) {
		this();
		System.out.println("1 arg invoked");
		this.numOfLegs = numOfLegs;
	}
	
	public Animal(int numOfLegs, String fur) {
		this(numOfLegs);
		System.out.println("2 args invoked");
		this.fur = fur;
	}
	
	public Animal(int numOfLegs, String fur, String diet) {
		this(numOfLegs, fur);
		System.out.println("3 args invoked");
		this.diet = diet;
	}
	
	public Animal(int numOfLegs, String fur, String diet, boolean hasTail) {
		this(numOfLegs, fur, diet);
		System.out.println("4 args invoked");
		this.hasTail = hasTail;
	}
	
	public Animal(int numOfLegs, String fur, String diet, boolean hasTail, Gender gender) {
		this(numOfLegs, fur, diet, hasTail);
		System.out.println("5 args invoked");
		this.gender = gender;
	}
	
	public Animal(int numOfLegs, String fur, String diet, boolean hasTail, Gender gender, String color) {
		this(numOfLegs, fur, diet, hasTail, gender);
		System.out.println("6 args invoked");
		this.color = color;
	}
	
	public void makeNoises() {
		System.out.println("animal making generic animal noise");
	}
	
}
