package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.Session;

public interface ISessionAc {

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : SessionDaoBouchon for more info
	 */

	List<Session> findAll();

	void delete(Session session);

	void update(Session session);

	void save(Session session);

	Session get(Integer id);

}