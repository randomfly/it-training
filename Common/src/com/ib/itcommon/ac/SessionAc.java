package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.Session;
import com.ib.itcommon.dao.ISessionDao;
import com.ib.itcommon.dao.SessionDaoBouchon;

/**
 * @author YH
 *
 */
public class SessionAc implements ISessionAc {

	private ISessionDao sessionDao = new SessionDaoBouchon();

	public SessionAc() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : SessionDaoBouchon for more info
	 */

	@Override
	public List<Session> findAll() {
		List<Session> sessions = null;

		// appel à  la couche DAO
		sessions = sessionDao.findAll();

		return sessions;
	}

	@Override
	public void delete(Session session) {
		sessionDao.delete(session);

	}

	@Override
	public void update(Session session) {
		sessionDao.update(session);

	}

	@Override
	public void save(Session session) {
		sessionDao.save(session);

	}

	@Override
	public Session get(Integer id) {
		Session session = sessionDao.get(id);
		return session;
	}

}
