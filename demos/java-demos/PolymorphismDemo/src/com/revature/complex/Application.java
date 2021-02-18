package com.revature.complex;

import java.util.Scanner;

public class Application {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Movie movie = new Movie();
		System.out.println(movie.getMovieDescription());
		
		Movie movie2 = new AWhiskerAwayMovie();
		System.out.println(movie2.getMovieDescription());
		
		Movie movie3 = new SupermanMovie();
		System.out.println(movie3.getMovieDescription());
		
		Movie movie4 = new TitanicMovie();
		System.out.println(movie4.getMovieDescription());
		
		// Introduce user input, which means we can make decisions based on what the user enters
		String choice;
		do {
			System.out.println("=========================");
			System.out.println("Enter a movie you would like to obtain a description for: ");
			System.out.println("0.) Exit");
			System.out.println("1.) Generic Movie");
			System.out.println("2.) A Whisker Away");
			System.out.println("3.) Superman Movie");
			System.out.println("4.) Titanic Movie");
			
			choice = sc.nextLine();
			
			Movie movieChoice = null;
			
			switch(choice) {
			case "1":
				movieChoice = new Movie();
				break;
			case "2":
				movieChoice = new AWhiskerAwayMovie();
				break;
			case "3":
				movieChoice = new SupermanMovie();
				break;
			case "4":
				movieChoice = new TitanicMovie();
				break;
			}
			
			if (movieChoice != null) {
				System.out.println(movieChoice.getMovieDescription()); // runtime polymorphism (method overriding)
			} else if (!choice.equals("0")) {
				System.out.println("Invalid movie choice, please try again");
			}
			
			
		} while (!choice.equals("0"));
		
	}

}
