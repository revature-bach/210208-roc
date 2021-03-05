package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Person person = new Person("B", "X", 10);
		Person person2 = new Person("A", "X", 11);
		Person person3 = new Person("B", "W", 11);
		Person person4 = new Person("A", "W", 11);

		List<Person> people = new ArrayList<>();
		people.add(person);
		people.add(person2);
		people.add(person3);
		people.add(person4);
		
//		Collections.sort(people);
//		Collections.sort(people, new FirstNameComparator());
		
		Comparator<Person> firstNameComp = Comparator.comparing((p) -> p.getFirstName());
		Comparator<Person> firstNameThenLastName = firstNameComp.thenComparing((p) -> p.getLastName());
		Comparator<Person> firstNameThenLastNameThenAge = firstNameThenLastName.thenComparing((p) -> p.getAge());
		
		Collections.sort(people, firstNameThenLastNameThenAge);
		
		System.out.println(people);
	}

}
