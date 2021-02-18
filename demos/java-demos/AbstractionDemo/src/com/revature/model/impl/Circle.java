package com.revature.model.impl;

import com.revature.model.abs.Shape;

public class Circle extends Shape {

	public double radius;
	
	public Circle() {
		super(0, "Circle");
	}
	
	public Circle(double radius) {
		super(0, "Circle");
		this.radius = radius;
	}
	
	@Override
	public void calculateArea() {
		super.area = Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + ", edges=" + edges + ", name=" + name + "]";
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
