package com.revature.model;

public class Person {

	private String name;
	private int age;
	private String occupation;
	private String phoneNumber;
	
	public Person() {
	}
	
	public Person(String name, int age, String occupation, String phoneNumber) {
		setName(name);
		setAge(age);
		setOccupation(occupation);
		setPhoneNumber(phoneNumber);
	}
	
	/*
	 * Getters
	 */
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getOccupation() {
		return this.occupation;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/*
	 * Setters
	 */
	public void setName(String name) {
		// this regular expression (regex) here matches if only alphabetical
		// characters are in name
		if (name.matches("[a-zA-Z\\s']+")) {
			this.name = name;
		} else {
			System.out.println("Only alphabetical characters are allowed");
		}
	}
	
	public void setAge(int age) {
		if (age < 0 || age > 130) {
			System.out.println("Invalid value for setting age");
		} else {
			this.age = age;
		}
	}
	
	public void setOccupation(String occupation) {
		if (name.matches("[a-zA-Z\\s]+")) {
			this.occupation = occupation;
		} else {
			System.out.println("Only alphabetical characters are allowed");
		}
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
			this.phoneNumber = phoneNumber;
		} else {
			System.out.println("Invalid phone number format. Must be (xxx-xxx-xxxx)");
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", occupation=" + occupation + ", phoneNumber=" + phoneNumber
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (occupation == null) {
			if (other.occupation != null)
				return false;
		} else if (!occupation.equals(other.occupation))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}

}
