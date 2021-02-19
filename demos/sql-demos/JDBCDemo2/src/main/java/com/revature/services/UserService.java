package com.revature.services;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.revature.dao.PostDAO;
import com.revature.dao.PostDAOImpl;
import com.revature.dao.UserDAO;
import com.revature.dao.UserDAOImpl;
import com.revature.exceptions.UserNotFoundException;
import com.revature.model.Post;
import com.revature.model.User;
import com.revature.util.ConnectionUtil;

public class UserService {

	public UserDAO userDAO; 
	public PostDAO postDAO;
	
	public UserService() {
		this.userDAO = new UserDAOImpl();
		this.postDAO = new PostDAOImpl();
	}
	
	public User getUserByUsername(String username) throws UserNotFoundException, SQLException {
		User user;
		
		Connection con = ConnectionUtil.getConnection();
		user = userDAO.getUserByUsername(username, con);
		
		if (user == null) {
			throw new UserNotFoundException("User with username '" + username + "' was not found!");
		}
		
		List<Post> userPosts = postDAO.getPostsByUsername(username, con);
		
		user.setPosts(userPosts);
		
		con.close();
		return user;
	}
	
}
