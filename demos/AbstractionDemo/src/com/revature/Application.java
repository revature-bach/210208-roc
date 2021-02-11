package com.revature;

import com.revature.model.abs.Calculable;
import com.revature.model.abs.Drawable;
import com.revature.model.abs.Shape;
import com.revature.model.impl.Circle;
import com.revature.model.impl.Triangle;

public class Application {

	public static void main(String[] args) {
		
		Shape tri = new Triangle(10, 5);
		System.out.println(tri.getArea());
		
		Shape circ = new Circle(2);
		System.out.println(circ.getArea());
		
		Calculable c = tri; // ctrl + shift + o as a shortcut for importing
		c.calculateArea();
		System.out.println(((Shape) c).getArea());
		
		Object o = c;
		System.out.println(o);
		System.out.println(c);
		System.out.println(tri);
		
		System.out.println(tri == o);
		
		tri.anotherMethod();
		
		circ.draw();
		
		Drawable d = circ;
		d.draw();
	}

}
