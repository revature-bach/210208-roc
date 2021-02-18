package com.revature.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void demo() {
		
		System.out.println();
		System.out.println("==== SET DEMO ====");
		
		// In the case of a HashSet, there is no ordering of elements
		// It is unpredictable for the most part
		// The reason we would want to use a Set is to ensure that we have unique elements
		Set<String> set = new HashSet<>();
		
		set.add("Peaches");
		set.add("Avocadoes");
		set.add("Apples");
		set.add("Plums");
		set.add("Oranges");
		set.add("Kiwis");
		
		System.out.println(set);
		
		set.add("Kiwis");
		
		System.out.println(set);
		
		Set<Car> cars = new HashSet<>();
		
		cars.add(new Car(2021, "Toyota", "Supra", "v6"));
		cars.add(new Car(2018, "Tesla", "Model S", "Electric"));
		
		System.out.println(cars);
		
		System.out.println("I4 Supra added: " + cars.add(new Car(2020, "Toyota", "Supra", "I4")));
		
		System.out.println(cars);
		
		System.out.println("I4 Supra added: " + cars.add(new Car(2020, "Toyota", "Supra", "I4")));
		// here we're trying to add a new Car object that has the same properties as another one
		// that already exists in our set. 
		// So really our Set collection is ensuring uniqueness through the usage of the .equals() method that happened to be overridden
		// In the car class
		
		System.out.println(cars);
		
		for (Car c : cars) {
			System.out.println(c);
		}
		
		/*
		 * Car example but with TreeSet instead of HashSet
		 * 
		 * In Car we implement the Comparable interface, which forces us to implement the compareTo method that can compare
		 * different Car objects against each other.
		 * 
		 * In our case, we are comparing them by their year
		 */
		Car a = new Car(2021, "Toyota", "Supra", "v6");
		Car b = new Car(2018, "Tesla", "Model S", "Electric");
		Car c = new Car(2020, "Toyota", "Supra", "I4");
		
		Set<Car> orderedCars = new TreeSet<>();
		
		orderedCars.add(a);
		orderedCars.add(b);
		orderedCars.add(c);
		
		System.out.println("orderedCars: " + orderedCars);
		
		
		/*
		 * TreeSet example
		 */
		
		// TreeSets are ordered, based on the natural ordering of elements
		// In the case of strings, this will be in lexicographical (alphabetical) order
		Set<String> set2 = new TreeSet<>();
		
		set2.add("Peaches");
		set2.add("Avocadoes");
		set2.add("Apples");
		set2.add("Plums");
		set2.add("Oranges");
		set2.add("Kiwis");
		
		System.out.println(set2);
	
	}
	
}
