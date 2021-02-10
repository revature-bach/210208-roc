package com.revature.simple;

public class Animal {

	public int numOfLegs;
	public String name;
	
	public Animal() {
	}
	
	public Animal(int numOfLegs, String name) {
		this.numOfLegs = numOfLegs;
		this.name = name;
	}
	
	public void makeNoise() {
		System.out.println("**GENERIC ANIMAL NOISES**");
	}
	
}
