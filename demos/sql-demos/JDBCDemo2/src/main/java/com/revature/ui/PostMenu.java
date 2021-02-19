package com.revature.ui;

import java.sql.SQLException;

import com.revature.exceptions.UserNotFoundException;
import com.revature.model.Post;
import com.revature.services.PostService;

public class PostMenu implements Menu {

	public PostService postService;
	
	public PostMenu() {
		this.postService = new PostService();
	}
	
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
					String content = getContentForPost();
					
					Post post = new Post(0, content);
					try {
						
						post = this.postService.createPost(username, post);
						System.out.println("Post created successfully: " + post);
						
					} catch (SQLException | UserNotFoundException e) {
						System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
					}
					break;
				default:
					System.out.println("No valid choice entered, please try again");
			}
			
		} while(choice != 1);
	}
	
	private String getContentForPost() {
		System.out.println("Type in the information you would like to include for this post: ");
		String input = Menu.sc.nextLine();
		
		return input;
	}

	private String getUsernameInput() {
		System.out.println("Enter a username that you would like to create a post for: ");
		String input = Menu.sc.nextLine().trim();
		
		return input;
	}

}
