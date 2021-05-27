/**
 * 
 */
package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.Course;
import com.ib.itcommon.dao.CourseDAOBouchon;
import com.ib.itcommon.dao.ICourseDAO;

/**
 * @author YH
 *
 */
public class CourseAC implements ICourseAC {

	private ICourseDAO courseDAO = new CourseDAOBouchon();

	public CourseAC() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : CourseDAOBouchon for more info
	 */

	@Override
	public List<Course> findAll() {
		List<Course> courses = null;

		// appel à  la couche DAO
		courses = courseDAO.findAll();

		return courses;
	}

	@Override
	public void delete(Course course) {
		courseDAO.delete(course);

	}

	@Override
	public void update(Course course) {
		courseDAO.update(course);

	}

	@Override
	public void save(Course course) {
		courseDAO.save(course);

	}

	@Override
	public Course get(Integer id) {
		Course course = courseDAO.get(id);
		return course;
	}

}
