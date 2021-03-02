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
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import com.revature.dao.PostDAO;
import com.revature.dao.UserDAO;
import com.revature.exceptions.UserNotFoundException;
import com.revature.model.Post;
import com.revature.model.User;
import com.revature.util.ConnectionUtil;

public class UserServiceTest {

	public UserService userService;
	
	public static UserDAO userDAO;
	public static PostDAO postDAO;
	public static Connection mockConnection;
	public static MockedStatic<ConnectionUtil> mockedStatic;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Create fake objects (mock objects)
		userDAO = mock(UserDAO.class);
		postDAO = mock(PostDAO.class);
		mockConnection = mock(Connection.class);
		
//		mockedStatic = Mockito.mockStatic(ConnectionUtil.class);
//		mockedStatic.when(ConnectionUtil::getConnection).thenReturn(mockConnection);
		
		// Instruct the methods from these fake objects on what to return when certain parameters are passed into them
		// utilize matchers from org.mockito.ArgumentMatchers
		when(userDAO.getUserByUsername(eq("abc123"), eq(mockConnection))).thenReturn(new User("abc123", "Jane", "Doe"));
		
		List<Post> posts = new ArrayList<>();
		posts.add(new Post(1, "This is a post"));
		posts.add(new Post(2, "This is another post"));
		when(postDAO.getPostsByUsername(eq("abc123"), eq(mockConnection))).thenReturn(posts);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
//		mockedStatic.close();
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
		// As of 3.4.0 Mockito, we can actually mock static methods as well! No longer just objects!
		try (MockedStatic<ConnectionUtil> mockedStatic = Mockito.mockStatic(ConnectionUtil.class)) {
		
			mockedStatic.when(ConnectionUtil::getConnection).thenReturn(mockConnection);
			
			User actual = userService.getUserByUsername("abc123");
			
			User expected = new User("abc123", "Jane", "Doe");
			List<Post> posts = new ArrayList<>();
			posts.add(new Post(1, "This is a post"));
			posts.add(new Post(2, "This is another post"));
			expected.setPosts(posts);
			
			assertEquals(expected, actual);
		
		}
	}
	
	@Test(expected = UserNotFoundException.class)
	public void testInvalidUserName() throws UserNotFoundException, SQLException {
		try (MockedStatic<ConnectionUtil> mockedStatic = Mockito.mockStatic(ConnectionUtil.class)) {
			mockedStatic.when(ConnectionUtil::getConnection).thenReturn(mockConnection);
			
			User actual = userService.getUserByUsername("abc1234");
		}
		
	}

}
