package com.revature;

import java.util.Iterator;

public class Application {

	public static void main(String[] args) {
		
		MyArrayList<Integer> integers = new MyArrayList<>();
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(10);
		integers.add(20);
		integers.add(30);

		System.out.println(integers);
		integers.set(2, 10234);
		System.out.println(integers);
		System.out.println("contains 20: " + integers.contains(20));
		
		// Enhanced for loop makes use of Iterable, and the Iterator object's next() method
		for (Integer i : integers) {
			System.out.println(i);
		}
		
		// Manual way of utilizing iterator
		Iterator<Integer> iter = integers.iterator();
		System.out.println();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		integers.clear();
		System.out.println(integers);
	}

}
