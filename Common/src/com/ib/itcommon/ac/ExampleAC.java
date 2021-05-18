package com.ib.itcommon.ac;

import com.ib.itcommon.dao.ExampleDAOBouchon;
import com.ib.itcommon.dao.IExampleDAO;

public class ExampleAC implements IExampleAC {
	
	private IExampleDAO exampleDAO = new ExampleDAOBouchon();

	/**
	 * Description of the function
	 * @return : the static string from the example DAO
	 * @see : ExampleDAOBouchon for more info
	 */
	@Override
	public String helloWorld() {		
		return this.exampleDAO.helloWorld();
	}
}
