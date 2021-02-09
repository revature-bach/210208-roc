package com.revature;

import com.revature.model.Animal;
import com.revature.model.Cat;
import com.revature.model.Dog;
import com.revature.model.Gender;

public class Application {

	public static void main(String[] args) {
		Animal animal = new Animal(4, "striped", "meat", true, Gender.MALE, "orange");
		
		System.out.println(animal.numOfLegs);
		System.out.println(animal.color);
		System.out.println(animal.fur);
		System.out.println(animal.gender);
		
		Animal animal2 = new Animal(4, "striped", "meat", true, Gender.FEMALE, "orange");
		System.out.println(animal2.gender);
		
		animal.makeNoises();
		animal2.makeNoises();
		
		//
		Dog dog1 = new Dog("Sparky", 4, "brown", "kibbles", true, Gender.FEMALE, "brown");
		dog1.playFetch();
		
		dog1 = new Dog("Fido", 4, "brown", "kibbles", true, Gender.FEMALE, "brown");
		dog1.playFetch();
		
		// You can use the Animal reference type with a Dog object
		Animal animal3 = dog1; // implicit upcasting
		// because dog1 is of type Dog, which is a child class of Animal, we can directly assign the location of the Dog reference variable
		// to the Animal reference variable without any explicit casting
		((Dog) animal3).playFetch();
		System.out.println(animal3.diet);
		System.out.println(((Dog) animal3).name);
		
		animal3 = new Cat();
		
		Dog dog3;
		if (animal3 instanceof Dog) {
			System.out.println("downcasting animal3 to Dog");
			dog3 = (Dog) animal3;
		}
		
		Cat cat;
		if (animal3 instanceof Cat) {
			System.out.println("downcasting animal3 to Cat");
			cat = (Cat) animal3;
		}
		
		System.out.println("==============================================");
		
		// This here is getting a bit into polymorphism which we haven't covered yet
		// In particular, this is demonstrating that polymorphism does not exist for fields/properties
		// Instead it's dependent on the reference variable type if the two properties are both defined in each
		// respective class
		Animal a = new Dog("Sparky", 4, "brown", "kibbles", true, Gender.FEMALE, "brown");
		System.out.println(a.testVar);
		Dog d = (Dog) a;
		System.out.println(d.testVar);
	}

}
