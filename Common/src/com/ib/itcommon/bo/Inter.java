package com.ib.itcommon.bo;

import java.util.Date;

public class Inter extends Course {

	private Integer nbrParticipantMax;
	private Integer nbrParticipantCurrent;

	public Boolean checkNbr() {

		if (nbrParticipantCurrent >= nbrParticipantMax) {

			return true;
		} else {

			return false;
		}

	}

	/**
	 * @param id
	 * @param description
	 * @param programme
	 * @param certification
	 * @param audiance
	 * @param finance
	 * @param length
	 * @param nbrParticipantMax
	 * @param nbrParticipantCurrent
	 */
	public Inter(Integer id, String description, String programme, String certification, Integer audiance,
			Integer finance, Date length, Integer nbrParticipantMax, Integer nbrParticipantCurrent) {
		super(id, description, programme, certification, audiance, finance, length);
		this.nbrParticipantMax = nbrParticipantMax;
		this.nbrParticipantCurrent = nbrParticipantCurrent;
	}

	/**
	 * @param id
	 * @param description
	 * @param programme
	 * @param certification
	 * @param audiance
	 * @param finance
	 * @param length
	 * @param nbrParticipantMax
	 */
	public Inter(Integer id, String description, String programme, String certification, Integer audiance,
			Integer finance, Date length, Integer nbrParticipantMax) {
		super(id, description, programme, certification, audiance, finance, length);
		this.nbrParticipantMax = nbrParticipantMax;
		this.nbrParticipantCurrent = 0;
	};

}
