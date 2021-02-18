package com.revature.model;

public class PersonBuilder {

	private String name;
	private int age;
	private String occupation;
	private String phoneNumber;
	
	public PersonBuilder() {
	}
	
	public PersonBuilder setName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	
	public PersonBuilder setOccupation(String occupation) {
		this.occupation = occupation;
		return this;
	}
	
	public PersonBuilder setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	@Override
	public String toString() {
		return "PersonBuilder [name=" + name + ", age=" + age + ", occupation=" + occupation + ", phoneNumber="
				+ phoneNumber + "]";
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
		PersonBuilder other = (PersonBuilder) obj;
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
