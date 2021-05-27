package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.Attendance;
import com.ib.itcommon.dao.AttendanceDaoBouchon;
import com.ib.itcommon.dao.IAttendanceDao;

/**
 * @author YH
 *
 */
public class AttendanceAc implements IAttendanceAc {

	private IAttendanceDao attendanceDao = new AttendanceDaoBouchon();

	public AttendanceAc() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Description of the function
	 * 
	 * @return :
	 * @see : AttendanceDaoBouchon for more info
	 */

	@Override
	public List<Attendance> findAll() {
		List<Attendance> attendances = null;

		// appel à  la couche DAO
		attendances = attendanceDao.findAll();

		return attendances;
	}

	@Override
	public void delete(Attendance attendance) {
		attendanceDao.delete(attendance);

	}

	@Override
	public void update(Attendance attendance) {
		attendanceDao.update(attendance);

	}

	@Override
	public void save(Attendance attendance) {
		attendanceDao.save(attendance);

	}

	@Override
	public Attendance get(Integer id) {
		Attendance attendance = attendanceDao.get(id);
		return attendance;
	}

}
