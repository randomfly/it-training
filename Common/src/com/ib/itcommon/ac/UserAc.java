package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.User;
import com.ib.itcommon.dao.IUserDao;
import com.ib.itcommon.dao.UserDaoBouchon;

/**
 * @author ib
 *
 */
public class UserAc implements IUserAc {

	private IUserDao userDao = new UserDaoBouchon();

	/**
	 * 
	 */
	public UserAc() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> findAll() {
		List<User> users = null;

		// appel à  la couche DAO
		users = userDao.findAll();

		return users;
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);

	}

	@Override
	public void update(User user) {
		userDao.update(user);

	}

	@Override
	public void save(User user) {
		userDao.save(user);

	}

	@Override
	public User get(Integer id) {
		User user = userDao.get(id);
		return user;
	}

}
