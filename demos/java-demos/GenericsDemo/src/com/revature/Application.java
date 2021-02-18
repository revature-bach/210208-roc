package com.revature;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		
		GenericDemo<String, String> gd = new GenericDemo<>();
		gd.setValue("a string");
		
		System.out.println(gd.getValue());

		GenericDemo<Integer, String> gd2 = new GenericDemo<>();
		gd2.setValue(10);
		
		System.out.println(gd2.getValue());
		
		// Generics allow us to enforce type safety
		// So that you are ensured that you can only have that one type
	}

}
