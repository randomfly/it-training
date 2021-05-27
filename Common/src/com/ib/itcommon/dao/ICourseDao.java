package com.ib.itcommon.dao;

import java.util.List;

import com.ib.itcommon.bo.Course;

public interface ICourseDao {

	List<Course> findAll();

	void delete(Course course);

	void update(Course course);

	void save(Course course);

	Course get(Integer id);

}