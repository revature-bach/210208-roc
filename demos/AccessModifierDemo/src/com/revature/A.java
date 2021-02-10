package com.revature;

public class A {

	// instance fields
	public int w;
	protected int x;
	int y; // default, don't confuse with using the 'default' keyword. Here there is no keyword that should be used
	private int z;
	
	// static fields
	public static int a;
	protected static int b;
	static int c;
	private static int d;
	
	public A() {
		super();
	}
	
	public A(int w, int x, int y, int z) {
		this.w = w;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public static void main(String[] args) {
		A aObj = new A(10, 15, 20, 25);
		
		aObj.printInstanceFields();
		
		System.out.println(aObj.w);
		System.out.println(aObj.x);
		System.out.println(aObj.y);
		System.out.println(aObj.z);
		
		aObj.w = 10;
		aObj.x = 20;
		aObj.y = -100;
		aObj.z = 200;
		
		aObj.printInstanceFields();
	}
	
	public void printInstanceFields() {
		System.out.println("=== Instance fields of Object ===");
		System.out.println("w: " + w);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
	}
}
