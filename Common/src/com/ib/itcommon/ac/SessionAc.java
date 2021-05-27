package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.Session;
import com.ib.itcommon.dao.ISessionDAO;
import com.ib.itcommon.dao.SessionDAOBouchon;

/**
 * @author YH
 *
 */
public class SessionAC implements ISessionAC {

	private ISessionDAO sessionDAO = new SessionDAOBouchon();

	public SessionAC() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : SessionDAOBouchon for more info
	 */

	@Override
	public List<Session> findAll() {
		List<Session> sessions = null;

		// appel à  la couche DAO
		sessions = sessionDAO.findAll();

		return sessions;
	}

	@Override
	public void delete(Session session) {
		sessionDAO.delete(session);

	}

	@Override
	public void update(Session session) {
		sessionDAO.update(session);

	}

	@Override
	public void save(Session session) {
		sessionDAO.save(session);

	}

	@Override
	public Session get(Integer id) {
		Session session = sessionDAO.get(id);
		return session;
	}

}
