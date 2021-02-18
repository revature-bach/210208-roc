package com.revature.model;

public class Person {

	public String firstName;
	public String lastName;
	public String SSN;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, String SSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}
	
	// We overrode this method from the Object class that Person inherits from
	@Override
	public String toString() {
		return "firstName: " + firstName + ", lastName: " + lastName + ", SSN: " + SSN;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SSN == null) ? 0 : SSN.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
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
		if (SSN == null) {
			if (other.SSN != null)
				return false;
		} else if (!SSN.equals(other.SSN))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object o) {
//		if (!(o instanceof Person)) {
//			return false;
//		}
//		
//		if (this.firstName != ((Person) o).firstName) {
//			return false;
//		}
//		
//		if (this.lastName != ((Person) o).lastName) {
//			return false;
//		}
//		
//		if (this.SSN != ((Person) o).SSN) {
//			return false;
//		}
//		
//		return true;
//	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collector invoked finalize on this object: " + this);
	}
	
}
