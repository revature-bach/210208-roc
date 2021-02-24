package com.revature.service;

import org.apache.log4j.Logger;

import com.revature.Application;

public class MyService {

	private static Logger log = Logger.getLogger(MyService.class);
	
	public void getAllUsers() {
		// Other logic up here
		
		log.info("User " + Application.currentlyLoggedInUser.getUsername() + " retrieved information about all users");
	}
	
}
