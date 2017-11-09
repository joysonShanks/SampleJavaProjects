package com.someco.helloworld.service;

import com.someco.helloworld.model.User;

public interface UserService {
	
	public void saveUser(User user) throws Exception;
	
	public void updateUser(User user);
	
	public void deleteUser(String userName);
	
	public User findByUserName(String userName);

}
