package com.someco.helloworld.dao;

import java.util.List;

import com.someco.helloworld.model.UserProfile;

public interface UserProfileDao {
	
	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);

}
