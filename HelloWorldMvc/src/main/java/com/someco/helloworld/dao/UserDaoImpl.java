package com.someco.helloworld.dao;

//import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.someco.helloworld.model.User;

@Repository("userDao")
//@{javax.transaction.Transactional} @Transactional(rollbackOn = Exception.class) transaction is rolled back for exception of type Exception
@Transactional
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao {

	public void saveUser(User user) throws Exception {
		persist(user);
		//throw new Exception("some exception");
	}

	public void deleteUser(String userName) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("userName", userName));
		User user = (User) criteria.uniqueResult();
		delete(user);
	}

	public void updateUser(User user) {
		update(user);
	}

	public User findByUserName(String userName) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("userName", userName));
		return (User) crit.uniqueResult();
	}

}
