package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.User;
import com.ib.itcommon.dao.IUserDAO;
import com.ib.itcommon.dao.UserDAOBouchon;

/**
 * @author ib
 *
 */
public class UserAC implements IUserAC {

	private IUserDAO userDAO = new UserDAOBouchon();

	/**
	 * 
	 */
	public UserAC() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> findAll() {
		List<User> users = null;

		// appel à  la couche DAO
		users = userDAO.findAll();

		return users;
	}

	@Override
	public void delete(User user) {
		userDAO.delete(user);

	}

	@Override
	public void update(User user) {
		userDAO.update(user);

	}

	@Override
	public void save(User user) {
		userDAO.save(user);

	}

	@Override
	public User get(Integer id) {
		User user = userDAO.get(id);
		return user;
	}

}
