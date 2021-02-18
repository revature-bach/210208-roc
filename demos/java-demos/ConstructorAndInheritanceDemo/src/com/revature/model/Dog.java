package com.revature.model;

public class Dog extends Animal {
	
	public String name;
	
	public String testVar = "456";
	
	public Dog(String name, int numOfLegs, String fur, String diet, boolean hasTail, Gender gender, String color) {
		super(numOfLegs, fur, diet, hasTail, gender, color);
		this.name = name;
	}
	
	public void playFetch() {
		System.out.println(name + " is playing fetch!");
	}
	
}
