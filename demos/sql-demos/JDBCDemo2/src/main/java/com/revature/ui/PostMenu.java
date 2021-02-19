package com.revature.ui;

public class PostMenu implements Menu {

	public void display() {
		int choice = 0;
		
		do {
			System.out.println("=== POST MENU ===");
			System.out.println("Please select an option below: ");
			System.out.println("1.) Back");
			
			try {
				choice = Integer.parseInt(Menu.sc.nextLine());
			} catch (NumberFormatException e) {
			}
			
			switch (choice) {
				case 1:
					break;
				default:
					System.out.println("No valid choice entered, please try again");
			}
			
		} while(choice != 1);
	}

}
