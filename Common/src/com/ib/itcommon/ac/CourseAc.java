/**
 * 
 */
package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.Course;
import com.ib.itcommon.dao.CourseDaoBouchon;
import com.ib.itcommon.dao.ICourseDao;

/**
 * @author YH
 *
 */
public class CourseAc implements ICourseAc {

	private ICourseDao courseDao = new CourseDaoBouchon();

	public CourseAc() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : CourseDaoBouchon for more info
	 */

	@Override
	public List<Course> findAll() {
		List<Course> courses = null;

		// appel à  la couche DAO
		courses = courseDao.findAll();

		return courses;
	}

	@Override
	public void delete(Course course) {
		courseDao.delete(course);

	}

	@Override
	public void update(Course course) {
		courseDao.update(course);

	}

	@Override
	public void save(Course course) {
		courseDao.save(course);

	}

	@Override
	public Course get(Integer id) {
		Course course = courseDao.get(id);
		return course;
	}

}
