package com.revature.main;

import com.revature.dao.UserDAO;
import com.revature.dao.UserDAOImpl;
import com.revature.exceptions.UserNotFoundException;
import com.revature.model.User;

public class Application {

	public static void main(String[] args) {
		
		// Here we were just testing to see if our connection worked or not
//		try {
//			Connection con = ConnectionUtil.getConnection();
//			System.out.println(con);
//			con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// jdbc:postgresql://localhost:5432/postgres
		// postgres
		// ...
		
		UserDAO dao = new UserDAOImpl();
//		System.out.println(dao.getAllUsers());
//		
//		try {
//			System.out.println(dao.getUserByUsername("abc1234"));
//		} catch (UserNotFoundException e) {
//			System.out.println(e.getMessage());
//		}
		
//		User user = new User("user12345", "Jane", "Smith");
//		dao.insertUser(user);
		
		System.out.println(dao.getAllUsers());
	}

}
