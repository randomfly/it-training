package com.ib.itcommon.ac;

import java.util.List;

import com.ib.itcommon.bo.Attendance;
import com.ib.itcommon.dao.AttendanceDAOBouchon;
import com.ib.itcommon.dao.IAttendanceDAO;

/**
 * @author YH
 *
 */
public class AttendanceAC implements IAttendanceAC {

	private IAttendanceDAO attendanceDAO = new AttendanceDAOBouchon();

	public AttendanceAC() {
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
		attendances = attendanceDAO.findAll();

		return attendances;
	}

	@Override
	public void delete(Attendance attendance) {
		attendanceDAO.delete(attendance);

	}

	@Override
	public void update(Attendance attendance) {
		attendanceDAO.update(attendance);

	}

	@Override
	public void save(Attendance attendance) {
		attendanceDAO.save(attendance);

	}

	@Override
	public Attendance get(Integer id) {
		Attendance attendance = attendanceDAO.get(id);
		return attendance;
	}

}
