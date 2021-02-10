package com.revature;

import com.revature.other.C;

public class B {

	public static void main(String[] args) {
		A aObj = new A(10, 100, 200, 300);
		
		System.out.println(aObj.w); // public
		System.out.println(aObj.x); // protected
		System.out.println(aObj.y); // default
//		System.out.println(aObj.z); // z is private, so I cannot access it from this other class
		
		aObj.printInstanceFields();
		
		System.out.println(A.a);
		System.out.println(A.b);
		System.out.println(A.c);
		// System.out.println(A.d); // d is private
	}
	
}
