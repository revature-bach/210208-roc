package com.revature.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void demo() {
		
		List<String> list = new ArrayList<>();
		
		list.add("Peaches");
		list.add("Avocadoes");
		list.add("Apples");
		list.add("Plums");
		list.add("Oranges");
		list.add("Kiwis");
		list.add("Kiwis");
		list.add("Kiwis");
		
		System.out.println("list: " + list);
		System.out.println("size of list: " + list.size());
		
		list.add(1, "Pears");
		System.out.println("list: " + list);
		
		System.out.println(list.get(3));
		
		list.remove(3);
		
		System.out.println(list);
		
		list.remove(new String("Kiwis"));
		
		System.out.println(list);
		
		// traversing list
		for (int i = 0; i < list.size(); i++) {
			System.out.println("index " + i + ": " + list.get(i));
			if (list.get(i).equals("Kiwis")) {
				// Whenever we remove a "Kiwis" reference from the ArrayList,
				// we are shifting all elements to the right of the removed element over to the left by 1
				// so we should continue iteration on the same exact index that the remove element was on
				list.remove("Kiwis");
				i--;
			}
		}
		
		System.out.println(list);
		
		// Enhanced for loop (for each)
		for (String i : list) {
			System.out.println(i);
		}
		
		// Using iterators
		// Iterators navigate in one direction
		// Once we finish iterating, we must obtain a new iterator
		// Iterators start before the first element, and in order to obtain the first element, we must then invoke the
		// next() method
		System.out.println("=== ITERATOR ===");
		
		list.add("Kiwis");
		list.add("Kiwis");
		list.add("Kiwis");
		
		System.out.println(list);
		
		Iterator<String> iter = list.iterator();
		String element;
		while (iter.hasNext()) {
			element = iter.next();
			
			if (element.equals("Kiwis")) {
				iter.remove();
			}
		}
		
		System.out.println(list);
		
		// contains
		System.out.println("list contains Apples: " + list.contains("Pears"));
		
		// indexOf
		System.out.println("index of 'Pears' inside list: " + list.indexOf("Pears"));
		
		// Collections
		// Is a utility class
		// A utility class is a class that contains only static methods
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
