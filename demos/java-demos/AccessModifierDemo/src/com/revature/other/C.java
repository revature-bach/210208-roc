package com.revature.other;

import com.revature.A;

public class C extends A {

	public C(int w, int x, int y, int z) {
		super(w, x, y, z);
	}
	
	public static void main(String[] args) {
		C cObj = new C(12, 56, 23, 98);
		
		System.out.println(cObj.w); // public
		System.out.println(cObj.x); // protected
		// System.out.println(cObj.y); // y is default, which means access only in the same package
		// System.out.println(cObj.z); // z is private, which means access only in the same class
		cObj.printInstanceFields();
		
		System.out.println(A.a); // public
		System.out.println(A.b); // protected
		// System.out.println(A.c); // default, not accessible from another package
		// System.out.println(A.d); // private, not accessible outside the class
	}
	
}
