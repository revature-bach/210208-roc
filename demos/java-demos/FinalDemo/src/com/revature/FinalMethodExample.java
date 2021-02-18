package com.revature;

public class FinalMethodExample {

	public final void someInstanceMethod() {
		System.out.println("someInstanceMethod() invoked");
	}
	
	public double add(final double x, final double y) {	
		return x + y;
	}
	
}
