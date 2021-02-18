package com.revature.dao;

import java.util.List;

import com.revature.exceptions.UserNotFoundException;
import com.revature.model.User;

public interface UserDAO {

	public List<User> getAllUsers();
	
	public User getUserByUsername(String username) throws UserNotFoundException;
	
	public int insertUser(User user);
	
}
