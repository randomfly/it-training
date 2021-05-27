package com.ib.itcommon.bo;

import java.util.Date;

/**
 * @author YH
 *
 */

public abstract class Course {

	protected Integer id;
	protected String description;
	protected String programme;
	protected String certification;
	protected Integer audiance;
	protected Integer finance;
	protected Date length;

	/**
	 * 
	 * @param id
	 * @param description
	 * @param programme
	 * @param certification
	 * @param audiance
	 * @param finance
	 * @param length
	 */

	public Course(Integer id, String description, String programme, String certification, Integer audiance,
			Integer finance, Date length) {
		super();
		this.id = id;
		this.description = description;
		this.programme = programme;
		this.certification = certification;
		this.audiance = audiance;
		this.finance = finance;
		this.length = length;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * fonction to confirm inscription
	 */
//	public boolean confirmEnrollement() {
//		if() {
//			return false;
//		}else {
//			return true;
//		}
//	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the programme
	 */
	public String getProgramme() {
		return programme;
	}

	/**
	 * @param programme the programme to set
	 */
	public void setProgramme(String programme) {
		this.programme = programme;
	}

	/**
	 * @return the certification
	 */
	public String getCertification() {
		return certification;
	}

	/**
	 * @param certification the certification to set
	 */
	public void setCertification(String certification) {
		this.certification = certification;
	}

	/**
	 * @return the audiance
	 */
	public Integer getAudiance() {
		return audiance;
	}

	/**
	 * @param audiance the audiance to set
	 */
	public void setAudiance(Integer audiance) {
		this.audiance = audiance;
	}

	/**
	 * @return the finance
	 */
	public Integer getFinance() {
		return finance;
	}

	/**
	 * @param finance the finance to set
	 */
	public void setFinance(Integer finance) {
		this.finance = finance;
	}

	/**
	 * @return the length
	 */
	public Date getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(Date length) {
		this.length = length;
	}

	public void add(Course course) {
		// TODO Auto-generated method stub

	}

}
