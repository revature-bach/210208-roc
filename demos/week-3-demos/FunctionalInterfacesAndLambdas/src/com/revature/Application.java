package com.revature;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		// Anonymous class concept being introduced
		// This means that we're not actually defining a class using the class declaration.
		// We're actually just providing an implementation for that interface then and there.. and then
		// instantiating that "implementation" as an object
		MyFunctionalInterface myObj = new MyFunctionalInterface() {
			
			@Override
			public boolean test(String s) {
				if (s.length() > 100) {
					return true;
				}
				
				return false;
			}
			
		};
		// let's invoke the stringComparison method
		System.out.println(stringComparison("This is a string that has a length greater than 20", myObj));
		
		// VERBOSE ^^^^^^^ Not the greatest thing to have to write all over the place
		
		// So instead we have this idea of lambdas
		// Lambdas look like this () -> ....;
		// the () contain the parameters for that particular method, and the .... represents some sort of code
		// inside that method
		
		// I can utilize lambdas with my functional interfaces, as a form of syntactical sugar
		// lambdas simply provide an implementation of that single abstract method less verbosely
		// so lambdas are an object of that functional interface, where we provide an implementation for that
		// single abstract method, so that we can actually instantiate an object
		
		MyFunctionalInterface myLambda = (s) -> s.length() > 20;
		System.out.println(stringComparison("This is another string here", myLambda));
		
		System.out.println(stringComparison("I can pass lambdas as an argument directly", 
				(s) -> s.length() < 100));
		
		MyFunctionalInterface multipleStatementLambda = (s) -> {
			System.out.println(s);
			return s.length() < 20;
		};
		
		// Reasons you might use it,
		// Include different methods in the various Collections that accept certain functional interface types
		// as parameters
		// Or the Stream API
		
		// Iterable iterface
		// contains the method void forEach(Consumer<? super E> consumer);
		List<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("This is the first string");
		listOfStrings.add("This is the second string");
		listOfStrings.add("This is the third string");
		listOfStrings.add("Short string");
		
		listOfStrings.forEach((s) -> System.out.println(s));
		
		// Collection interface
		// contains the method boolean removeIf(Predicate<? super E> filter);
//		System.out.println(listOfStrings.removeIf((s) -> s.length() > 15));
		
		System.out.println(listOfStrings);
		
		// On the List interface itself
		// we have boolean replaceAll(UnaryOperator<? super E> operator);
		listOfStrings.replaceAll((s) -> s + "!!!!!");
		
		System.out.println(listOfStrings);
		
		// Also on the List interface
		// we have boolean sort(Comparator<? super E> comparator);
		listOfStrings.sort((s1, s2) -> s1.length() - s2.length());
		System.out.println(listOfStrings);
		
		// Utilizing Map, Filter, Reduce using Lambdas and Collections
		List<Person> people = new ArrayList<>();
		people.add(new Person("John", 18));
		people.add(new Person("Jane", 25));
		people.add(new Person("Bob", 45));
		people.add(new Person("Billy", 10));
		people.add(new Person("Sarah", 15));
		
		// compute the average age of people 18 or older
		// The traditional way
		int sum = 0;
		int count = 0;
		for (Person p : people) {
			if (p.getAge() >= 18) {
				sum += p.getAge();
				count++;
			}
		}
		
		System.out.println("sum: " + sum);
		System.out.println(sum / count);
		
		// The cooler way
		int cumulativeSum = people.stream()
			.map((person) -> person.getAge()).filter((age) -> age >= 18)
			.reduce((cumulSum, age) -> cumulSum + age)
			.get();
		
		// Reduction operations can get pretty nuanced
		// In particular, your operations, in order to be done in parallel on different threads/CPU cores/Computers
		// need to be "associative". Which pretty much means that it doesn't matter what order your operation happens
		// important because when you do parallel processing of data, you're splitting the data up and sending it
		// to many different processing units
		// And therefore, in the final recombining of the result data together, it should not matter how we split
		// the data and how it gets recombined
		
		// Examples of Associative operations
		// i1 + i2
		// Integer.max(i1, i2)
		// i1 * i2
		
		// Examples of Non Associative
		// (i1 + i2) / 2
		// i1 * i1 + i2 * i2
		
		int count2 = (int) people.stream().filter((p) -> p.getAge() >= 18).count();
	
		System.out.println("cumulativeSum: " + cumulativeSum);
		System.out.println(cumulativeSum / count2);
	}
	
	public static boolean stringComparison(String s, MyFunctionalInterface f) {
		boolean result = f.test(s);
		return result;
	}

}
