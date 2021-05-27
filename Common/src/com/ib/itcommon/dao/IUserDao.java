package com.ib.itcommon.dao;

import java.util.List;

import com.ib.itcommon.bo.User;

public interface IUserDao {

	List<User> findAll();

	void delete(User user);

	void update(User user);

	void save(User user);

	User get(Integer id);

}