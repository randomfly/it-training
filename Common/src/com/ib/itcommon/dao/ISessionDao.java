package com.ib.itcommon.dao;

import java.util.List;

import com.ib.itcommon.bo.Session;

public interface ISessionDao {

	List<Session> findAll();

	void delete(Session session);

	void update(Session session);

	void save(Session session);

	Session get(Integer id);

}