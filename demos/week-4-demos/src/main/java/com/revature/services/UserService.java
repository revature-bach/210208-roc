package com.revature.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.dao.PostDAO;
import com.revature.dao.PostDAOImpl;
import com.revature.dao.UserDAO;
import com.revature.dao.UserDAOImpl;
import com.revature.exceptions.UserNotFoundException;
import com.revature.model.Post;
import com.revature.model.User;
import com.revature.util.ConnectionUtil;

public class UserService {

	private static Logger log = Logger.getLogger(UserService.class);
	
	public UserDAO userDAO; 
	public PostDAO postDAO;
	
	public UserService() {
		this.userDAO = new UserDAOImpl();
		this.postDAO = new PostDAOImpl();
	}
	
	// We created and will be using this constructor in order to pass in
	// fake UserDAO and fake PostDAO objects
	// These fake objects are "mocks" that are mocked using the Mockito framework
	public UserService(UserDAO userDAO, PostDAO postDAO) {
		this.userDAO = userDAO;
		this.postDAO = postDAO;
	}
	
	public User getUserByUsername(String username) throws UserNotFoundException, SQLException {
		try (Connection con = ConnectionUtil.getConnection()) {
			User user;
			
			user = userDAO.getUserByUsername(username, con);
			
			if (user == null) {
				log.info("getUserByUsername(): attempted to get User with username " + username + ", but this user was not found");
				throw new UserNotFoundException("User with username '" + username + "' was not found!");
			}
			
			List<Post> userPosts = postDAO.getPostsByUsername(username, con);
			
			user.setPosts(userPosts);
			
			log.info("getUserByUsername() invoked and finished successfully");
			return user;
		}
	}
	
}
