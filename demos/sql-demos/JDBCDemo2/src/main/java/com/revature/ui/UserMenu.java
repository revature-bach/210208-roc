package com.revature.ui;

import java.sql.SQLException;

import com.revature.exceptions.UserNotFoundException;
import com.revature.model.User;
import com.revature.services.UserService;

public class UserMenu implements Menu {

	public UserService userService;
	
	public UserMenu() {
		this.userService = new UserService();
	}
	
	public void display() {
		int choice = 0;
		
		do {
			System.out.println("=== USER MENU ===");
			System.out.println("Please select an option below: ");
			System.out.println("1.) Back");
			System.out.println("2.) Get user by username");
			
			try {
				choice = Integer.parseInt(Menu.sc.nextLine());
			} catch (NumberFormatException e) {
			}
			
			switch (choice) {
				case 1:
					break;
				case 2:
					String username = getUsernameInput();
					
					try {
						User user = userService.getUserByUsername(username);
						System.out.println(user);
					} catch (SQLException | UserNotFoundException e) {
						System.out.println(e.getClass().getSimpleName() + " " + e.getMessage());
					}
					break;
				default:
					System.out.println("No valid choice entered, please try again");
			}
			
		} while(choice != 1);
	}

	private String getUsernameInput() {
		System.out.println("Enter a username that you would like to lookup: ");
		String input = Menu.sc.nextLine().trim();
		
		return input;
	}
	
}
