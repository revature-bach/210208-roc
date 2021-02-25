package com.revature.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.dao.PostDAO;
import com.revature.dao.UserDAO;
import com.revature.exceptions.UserNotFoundException;
import com.revature.model.Post;
import com.revature.model.User;

public class UserServiceTest {

	public UserService userService;
	
	public static UserDAO userDAO;
	public static PostDAO postDAO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Create fake objects (mock objects)
		userDAO = mock(UserDAO.class);
		postDAO = mock(PostDAO.class);
		
		
		// Instruct the methods from these fake objects on what to return when certain parameters are passed into them
		// utilize matchers from org.mockito.ArgumentMatchers
		when(userDAO.getUserByUsername(eq("abc123"), any(Connection.class))).thenReturn(new User("abc123", "Jane", "Doe"));
		
		List<Post> posts = new ArrayList<>();
		posts.add(new Post(1, "This is a post"));
		posts.add(new Post(2, "This is another post"));
		when(postDAO.getPostsByUsername(eq("abc123"), any(Connection.class))).thenReturn(posts);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// Inject the fake objects into the actual UserService object being created
		userService = new UserService(userDAO, postDAO);
	}

	@After
	public void tearDown() throws Exception {
	}

	// Actually test those methods
	@Test
	public void testValidUserName() throws UserNotFoundException, SQLException {
		User actual = userService.getUserByUsername("abc123");
		
		User expected = new User("abc123", "Jane", "Doe");
		List<Post> posts = new ArrayList<>();
		posts.add(new Post(1, "This is a post"));
		posts.add(new Post(2, "This is another post"));
		expected.setPosts(posts);
		
		assertEquals(expected, actual);
	}
	
	@Test(expected = UserNotFoundException.class)
	public void testInvalidUserName() throws UserNotFoundException, SQLException {
		User actual = userService.getUserByUsername("abc1234");
	}

}
