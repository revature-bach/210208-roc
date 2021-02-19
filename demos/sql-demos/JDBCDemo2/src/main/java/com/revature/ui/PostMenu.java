package com.revature.ui;

public class PostMenu implements Menu {

	public void display() {
		int choice = 0;
		
		do {
			System.out.println("=== POST MENU ===");
			System.out.println("Please select an option below: ");
			System.out.println("1.) Back");
			System.out.println("2.) Create post");
			
			try {
				choice = Integer.parseInt(Menu.sc.nextLine());
			} catch (NumberFormatException e) {
			}
			
			switch (choice) {
				case 1:
					break;
				case 2:
					String username = getUsernameInput();
					
					
					break;
				default:
					System.out.println("No valid choice entered, please try again");
			}
			
		} while(choice != 1);
	}
	
	public String getUsernameInput() {
		System.out.println("Enter a username that you would like to create a post for: ");
		String input = Menu.sc.nextLine().trim();
		
		return input;
	}

}
