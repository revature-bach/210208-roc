package com.revature.simple;

public class Husky extends Dog {

	public Husky() {
	}
	
	public Husky(int numOfLegs, String name) {
		super(numOfLegs, name);
	}
	
	public void makeNoise() {
		System.out.println(name + " is howling!");
	}
}
