package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.Grade;

public interface IGradeAC {

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : GradeDaoBouchon for more info
	 */

	List<Grade> findAll();

	void delete(Grade grade);

	void update(Grade grade);

	void save(Grade grade);

	Grade get(Integer id);

}