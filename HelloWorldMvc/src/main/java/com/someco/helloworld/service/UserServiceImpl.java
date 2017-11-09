package com.someco.helloworld.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.someco.helloworld.dao.UserDao;
import com.someco.helloworld.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Autowired
    private PasswordEncoder passwordEncoder;
	
	public void saveUser(User user) throws Exception {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userDao.saveUser(user);
	}

	public void updateUser(User user) {
		// do not use this, not completed
		userDao.updateUser(user);
	}

	public void deleteUser(String userName) {
		userDao.deleteUser(userName);
	}

	public User findByUserName(String userName) {
		return userDao.findByUserName(userName);
	}

}
