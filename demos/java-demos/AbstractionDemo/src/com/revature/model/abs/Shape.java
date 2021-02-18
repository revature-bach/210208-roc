package com.revature.model.abs;

public abstract class Shape implements Calculable, Drawable {

	public double area;
	public int edges;
	public String name;
	
	// Abstract classes cannot be instantiated
	// SO why am I still putting constructors, and how can I use them?
	// The child classes can make use of these through super();
	public Shape() {
	}
	
	public Shape(int edges, String name) {
		this.edges = edges;
		this.name = name;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing shape.. " + name);
	}
	
	// WE should be able to calculate the area of a shape
	// public abstract void calculateArea(); // abstract method
	
	public double getArea() {
		calculateArea();
		return this.area;
	}
}
