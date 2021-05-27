package com.ib.itcommon.dao;

import java.util.List;

import com.ib.itcommon.bo.Attendance;

public interface IAttendanceDao {

	List<Attendance> findAll();

	void delete(Attendance attendance);

	void update(Attendance attendance);

	void save(Attendance attendance);

	Attendance get(Integer id);

}