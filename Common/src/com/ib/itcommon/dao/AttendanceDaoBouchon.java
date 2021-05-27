package com.ib.itcommon.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ib.itcommon.bo.Attendance;

/**
 * @author YH
 *
 */
public class AttendanceDaoBouchon implements IAttendanceDao {

	@Override
	public List<Attendance> findAll() {
		List<Attendance> Attendances = new ArrayList<Attendance>();

		// Bouchon
		Attendance attendance = new Attendance(1, 1, 1, new Date(), true);
		attendance.add(attendance);

		return Attendances;
	}

	@Override
	public void delete(Attendance attendance) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Attendance attendance) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Attendance attendance) {
		// TODO Auto-generated method stub

	}

	@Override
	public Attendance get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
