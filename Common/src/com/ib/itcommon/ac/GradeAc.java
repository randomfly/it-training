package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.Grade;
import com.ib.itcommon.dao.GradeDaoBouchon;
import com.ib.itcommon.dao.IGradeDao;

/**
 * @author YH
 *
 */
public class GradeAc implements IGradeDao {

	private IGradeDao gradeDao = new GradeDaoBouchon();

	public GradeAc() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : GradeDaoBouchon for more info
	 */

	@Override
	public List<Grade> findAll() {
		List<Grade> grades = null;

		// appel à  la couche DAO
		grades = gradeDao.findAll();

		return grades;
	}

	@Override
	public void delete(Grade grade) {
		gradeDao.delete(grade);

	}

	@Override
	public void update(Grade grade) {
		gradeDao.update(grade);

	}

	@Override
	public void save(Grade grade) {
		gradeDao.save(grade);

	}

	@Override
	public Grade get(Integer id) {
		Grade grade = gradeDao.get(id);
		return grade;
	}

}
