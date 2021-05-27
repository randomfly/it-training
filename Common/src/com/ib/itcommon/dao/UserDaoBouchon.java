package com.ib.itcommon.dao;

import java.util.ArrayList;
import java.util.List;

import com.ib.itcommon.bo.User;

/**
 * @author YH
 *
 */
public class UserDaoBouchon implements IUserDao {

	@Override
	public List<User> findAll() {
		List<User> Users = new ArrayList<User>();

		// Bouchon
		User user = new User(10, "test@gmail.com", "password", "Yoann", "Hardy");
		user.add(user);

		return Users;
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
