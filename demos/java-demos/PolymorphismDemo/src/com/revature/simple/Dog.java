package com.revature.simple;

public class Dog extends Animal {
	
	public Dog() {
	}
	
	public Dog(int numOfLegs, String name) {
		super(numOfLegs, name);
	}
	
	public void playFetch() {
		System.out.println(super.name + " is playing fetch!");
	}
	
	public void makeNoise() {
		System.out.println(super.name + " is barking!");
	}
	
}
