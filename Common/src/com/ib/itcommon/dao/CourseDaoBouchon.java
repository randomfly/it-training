package com.ib.itcommon.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ib.itcommon.bo.Course;
import com.ib.itcommon.bo.Inter;

/**
 * @author YH
 *
 */
public class CourseDaoBouchon implements ICourseDao {

	@Override
	public List<Course> findAll() {
		List<Course> Courses = new ArrayList<Course>();

		// Bouchon inter
		Course inter = new Inter(1, "Lorem Ipsum description", "Lorem Ipsum programme", "Lorem Ipsum certification", 15,
				15000, new Date(), 15);
		inter.add(inter);

		return Courses;
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Course course) {
		// TODO Auto-generated method stub

	}

	@Override
	public Course get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
