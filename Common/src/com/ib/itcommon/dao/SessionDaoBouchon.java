package com.ib.itcommon.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ib.itcommon.bo.Session;

/**
 * @author YH
 *
 */
public class SessionDaoBouchon implements ISessionDao {

	@Override
	public List<Session> findAll() {
		List<Session> Sessions = new ArrayList<Session>();

		// Bouchon
		Session session = new Session(1, true, "lorem", new Date(), new Date(), true);
		session.add(session);

		return Sessions;
	}

	@Override
	public void delete(Session session) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Session session) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Session session) {
		// TODO Auto-generated method stub

	}

	@Override
	public Session get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
