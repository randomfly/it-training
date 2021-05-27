package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.Grade;
import com.ib.itcommon.dao.GradeDAOBouchon;
import com.ib.itcommon.dao.IGradeDAO;

/**
 * @author YH
 *
 */
public class GradeAC implements IGradeDAO {

	private IGradeDAO gradeDAO = new GradeDAOBouchon();

	public GradeAC() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : GradeDAOBouchon for more info
	 */

	@Override
	public List<Grade> findAll() {
		List<Grade> grades = null;

		// appel à  la couche DAO
		grades = gradeDAO.findAll();

		return grades;
	}

	@Override
	public void delete(Grade grade) {
		gradeDAO.delete(grade);

	}

	@Override
	public void update(Grade grade) {
		gradeDAO.update(grade);

	}

	@Override
	public void save(Grade grade) {
		gradeDAO.save(grade);

	}

	@Override
	public Grade get(Integer id) {
		Grade grade = gradeDAO.get(id);
		return grade;
	}

}
