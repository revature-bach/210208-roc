package com.revature.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.revature.model.Post;

public interface PostDAO {

	public List<Post> getPostsByUsername(String username, Connection con) throws SQLException;
	public Post insertPost(Post post, Connection con, String username) throws SQLException;
	
}
