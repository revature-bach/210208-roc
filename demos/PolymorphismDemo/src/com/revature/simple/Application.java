package com.revature.simple;

public class Application {

	public static void main(String[] args) {
		
		Animal a1 = new Animal(4, "");
		a1.makeNoise(); // a1 is pointing to an Animal object, so it will use makeNoise in Animal

		a1 = new Dog(4, "Rocky");
		a1.makeNoise(); // a1 is now instead pointing to a Dog object, so it will use makeNoise in Dog
		
		// NOTICE!! This is despite using the Animal reference variable to point to either an Animal or a Dog object
		// So that is runtime polymorphism, because it is figuring out while the program is running, which implementation to use
		
		a1 = new Cat(4, "Whiskers");
		a1.makeNoise();
		
		Dog d1 = new Dog(4, "Fido");
		d1.makeNoise();
		
		d1 = new Husky(4, "Sparky");
		d1.makeNoise();
		
		a1 = d1;
		a1.makeNoise();
	}

}
