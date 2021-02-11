package com.revature;

import com.revature.model.Person;
import com.revature.model.PersonBuilder;

public class Application {

	public static void main(String[] args) {
		Person p1 = new Person("Bach Tran", 23, "Trainer", "000-000-0000");
		
		System.out.println(p1.getName());
		
		p1.setAge(30);
		System.out.println(p1.getAge());
		
		p1.setName("John O'Leary");
		System.out.println(p1.getName());
		
		p1.setPhoneNumber("512-111-1111");
		System.out.println(p1.getPhoneNumber());
		
		System.out.println(p1);
		
		PersonBuilder p = new PersonBuilder().setAge(10)
				.setName("Bill").setOccupation("Student").setPhoneNumber("512-000-0000");
		
		System.out.println(p);
	}

}
