package com.revature.simple;

public class Cat extends Animal {

	public Cat() {
	}
	
	public Cat(int numOfLegs, String name) {
		super(numOfLegs, name);
	}
	
	public void makeNoise() {
		System.out.println(super.name + " is meowing!");
	}
	
}
