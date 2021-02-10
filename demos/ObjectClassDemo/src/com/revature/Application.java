package com.revature;

import com.revature.model.Person;

public class Application {

	public static void main(String[] args) {
		
		Person person1 = new Person("John", "Doe", "000-00-0001");
		System.out.println(person1);
		
		Person person2 = new Person("John", "Doe", "000-00-0001");
		
		System.out.println("person1 == person2: " + (person1 == person2));
		
		System.out.println("person1.equals(person2): " + person1.equals(person2));
		
		person1 = new Person("Jane", "Doe", "000-00-0002");
		System.gc();
		
		System.out.println("End of program");
		
	}

}
