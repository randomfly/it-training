package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.Course;

public interface ICourseAC {

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : CourseDaoBouchon for more info
	 */

	List<Course> findAll();

	void delete(Course course);

	void update(Course course);

	void save(Course course);

	Course get(Integer id);

}