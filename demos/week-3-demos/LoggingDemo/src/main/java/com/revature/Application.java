package com.revature;

import org.apache.log4j.Logger;

import com.revature.model.User;
import com.revature.service.MyService;

public class Application {

	private static Logger log = Logger.getLogger(Application.class);
	
	public static User currentlyLoggedInUser;
	
	public static void main(String[] args) {		
		log.debug("Hi there from DEBUG");
		log.info("Hi there from INFO");
		log.warn("Hi there from WARN");
		log.error("Hi there from ERROR");
		log.fatal("Hi there from FATAL");
		
		// pretend we're logging in
		currentlyLoggedInUser = new User("abc123");
		
		MyService service = new MyService();
		service.getAllUsers();
	}

}
