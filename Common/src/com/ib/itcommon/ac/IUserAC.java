package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.User;

public interface IUserAC {

	List<User> findAll();

	void delete(User user);

	void update(User user);

	void save(User user);

	User get(Integer id);

}