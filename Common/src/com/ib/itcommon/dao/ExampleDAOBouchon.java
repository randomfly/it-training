package com.ib.itcommon.dao;

import com.ib.itcommon.bo.Example;

public class ExampleDAOBouchon implements IExampleDAO {

	@Override
	public String helloWorld() {
		return Example.helloWorld();
	}

}
