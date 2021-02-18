package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class ConnectionUtil {
	
	// This is where we will actually obtain a connection to the database
	// This is a utility class, which means it will just contain static methods
	// We really don't need to instantiate this class as an object
	private ConnectionUtil() {
		super();
	}
	
	// I will define a static method that is going to return a Connection
	public static Connection getConnection() throws SQLException {
		
		// Here I will use the DriverManager class and register the postgres driver
		DriverManager.registerDriver(new Driver());
		
		// Hardcoding credentials is bad
		// We should use environment variables instead
		String url = System.getenv("db_url");
		String username = System.getenv("db_username");
		String password = System.getenv("db_password");
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		return connection;
	}
}
