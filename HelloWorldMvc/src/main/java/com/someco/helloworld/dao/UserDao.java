package com.someco.helloworld.dao;

import com.someco.helloworld.model.User;

public interface UserDao {
	
	public void saveUser(User user) throws Exception;
	
	public void deleteUser(String userName);
	
	public void updateUser(User user);

	public User findByUserName(String userName);

}
