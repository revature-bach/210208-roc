package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.exceptions.UserNotFoundException;
import com.revature.model.User;
import com.revature.util.ConnectionUtil;

public class UserDAOImpl implements UserDAO {

	@Override
	public List<User> getAllUsers() {
		
		List<User> users = new ArrayList<>();
		
		// this is a special form of try known as try-with-resources
		// normal try blocks would be try-catch-finally, try-catch.. or try-finally
		// but here with try-with-resources we could technical have try () {} all by itself
		// Try with resources works with anything that is an AutoCloseable (interface)
		// What try with resources will do is automatically close the resource after the try block or catch block, or finally
		// if those exist
		try (Connection con = ConnectionUtil.getConnection()) {
			// 1. get a Connection object
			
			// 2. Obtain some sort of Statement object
			Statement stmt = con.createStatement();
			
			// 3. Execute the query
			String sql = "SELECT * FROM sql_demo.users";
			ResultSet rs = stmt.executeQuery(sql);
			
			// 4. Process the results
			// ResultSet does not actually contain the data. It is simply "pointing" to the results over on the database
			// After the database has executed our query
			// When we iterate over the results using ResultSet, that is when we are actually getting the data one by one
			while (rs.next()) {
				// You can use indices starting from 1 (unlike 0 for Arrays and Lists)!
//				String username = rs.getString(1);
//				String firstName = rs.getString(2);
//				String lastName = rs.getString(3);
				
				// or we can just specify the column alias
				String username = rs.getString("username");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				
				User user = new User(username, firstName, lastName);
				users.add(user);
			}
			
		} catch (SQLException e) {
			System.out.println("An error occurred with JDBC: " + e.getMessage());
		}
		
		return users;
	}

	@Override
	public User getUserByUsername(String username) throws UserNotFoundException {
		
		User user = null;
		
		try (Connection con = ConnectionUtil.getConnection()) {
			// PreparedStatement is safer than Statement because it prevents SQL injection
			String sql = "SELECT * FROM sql_demo.users WHERE username = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String uname = rs.getString("username");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				
				user = new User(uname, firstName, lastName);
			} else {
				throw new UserNotFoundException("A user with username '" + username + "' was not found!");
			}
			
		} catch (SQLException e) {
			System.out.println("An error occurred with JDBC: " + e.getMessage());
		}
		
		return user;
	}

	@Override
	public int insertUser(User user) {
		
		int updateCount = 0;
		
		try (Connection con = ConnectionUtil.getConnection()) {
			String sql = "INSERT INTO sql_demo.users (username, first_name, last_name) VALUES (?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getFirstName());
			pstmt.setString(3, user.getLastName());
			
			updateCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("An error occurred with JDBC: " + e.getMessage());
		}
		
		return updateCount;
	}

}
