package com.revature.model;

public class Person {

	public String firstName;
	public String lastName;
	public int age;
	public double salary;
	public String favoriteColor;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, int age, double salary, String favoriteColor) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
		this.favoriteColor = favoriteColor;
	}

	// IDE generated
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary
				+ ", favoriteColor=" + favoriteColor + "]";
	}
	
}
