package com.revature.services;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.dao.PostDAO;
import com.revature.dao.PostDAOImpl;
import com.revature.dao.UserDAO;
import com.revature.dao.UserDAOImpl;
import com.revature.exceptions.UserNotFoundException;
import com.revature.model.Post;
import com.revature.model.User;
import com.revature.util.ConnectionUtil;

public class PostService {

	public PostDAO postDAO;
	public UserDAO userDAO;
	
	public PostService() {
		this.postDAO = new PostDAOImpl();
		this.userDAO = new UserDAOImpl();
	}
	
	public Post createPost(String username, Post post) throws SQLException, UserNotFoundException {
		Connection con = ConnectionUtil.getConnection();
		con.setAutoCommit(false); // By default, autocommit is on, so here I'm turning it off so I can control it myself
		
		User user = userDAO.getUserByUsername(username, con);
		
		if (user == null) {
			throw new UserNotFoundException("User with username '" + username + "' was not found!");
		}
		
		Post postWithID = postDAO.insertPost(post, con, username);
		
		return postWithID;
	}
	
}
