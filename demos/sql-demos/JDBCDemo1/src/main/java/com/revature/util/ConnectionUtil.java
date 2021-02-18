package com.revature.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

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
		
		/*
		 * Using environment variables
		 */
		String url = System.getenv("db_url");
		String username = System.getenv("db_username");
		String password = System.getenv("db_password");
		
		
		/*
		 * Using properties file for storing credentials
		 */
//		Properties p = new Properties();
//		InputStream is = ConnectionUtil.class.getClassLoader().getResourceAsStream("db.properties"); //new FileInputStream("src/main/resources/db.properties");
//		try {
//			p.load(is);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		String url = p.getProperty("url");
//		String username = p.getProperty("username");
//		String password = p.getProperty("password");
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		return connection;
	}
}
