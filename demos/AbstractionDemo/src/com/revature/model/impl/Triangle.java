package com.revature.model.impl;

import com.revature.model.abs.Shape;

public class Triangle extends Shape {

	public double base;
	public double height;
	
	public Triangle() {
		super(3, "Triangle");
	}
	
	public Triangle(double base, double height) {
		super(3, "Triangle");
		this.base = base;
		this.height = height;
	}
	
	@Override
	public void calculateArea() {
		super.area = 0.5 * base * height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", area=" + area + ", edges=" + edges + ", name="
				+ name + "]";
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
