package com.rakuten.prj.dao;

import java.util.List;

import com.rakuten.prj.entity.User;

public interface UserDao {

	void addUser(User p);
	User getUser(int id);
	List<User> getUsers();
	
}
