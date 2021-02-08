package com.revature;

public class Main {

	public static void main(String[] args) {
		
		// Let's create our first Calculator object
		Calculator calcOne = new Calculator(); 
		
		// Let's create another Calculator object
		Calculator calcTwo = new Calculator();
		calcTwo.name = "Casio Calculator";
		
		// Let's access nameTwo, which is static
		// Because it's static, it belongs to the class itself
		// and is shared by all instances of that class
		System.out.println(Calculator.nameTwo);
		Calculator.nameTwo = "test";
		
		// new Calculator() creates a new Calculator object, and then it gives the location (memory address) of the object
		// to the new calcOne variable
		
		// Set the property name to something
		calcOne.name = "TI-84";
		
		int sum = calcOne.add(10, 20);
		System.out.println(sum);
		
		int difference = calcOne.subtract(20, 5);
		System.out.println(difference);
		
		// let's print out the name property belonging to the object
		System.out.println("Name of calcOne: " + calcOne.name);
		System.out.println("nameTwo accessing from calcOne object: " + calcOne.nameTwo);
		
		System.out.println("Name of calcTwo: " + calcTwo.name);
		System.out.println("nameTwo accessing from calcTwo object: " + calcTwo.nameTwo);
		
		
		System.out.println("=============================================");
		calcOne.setName("Reliable");
		calcTwo.setName("Another calculator");
		
		System.out.println("Name of calcOne: " + calcOne.name);
		System.out.println("Name of calcTwo: " + calcTwo.name);
		
		useCalculator(calcOne);
		System.out.println(calcOne.name);
	}
	
	public static void useCalculator(Calculator calc) {
		calc.setName("sdfsdf");
		System.out.println(calc.add(20, 1000));
	}

}
