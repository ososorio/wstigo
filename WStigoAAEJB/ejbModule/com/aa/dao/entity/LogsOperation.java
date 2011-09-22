package com.aa.dao.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the logs_operations database table.
 * 
 */
@Entity
@Table(name="logs_operations")
public class LogsOperation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="lo_id")
	private int loId;

    @Temporal( TemporalType.DATE)
	@Column(name="lo_date")
	private Date loDate;

	@Column(name="lo_msisdn")
	private int loMsisdn;

	@Column(name="lo_next_packet")
	private int loNextPacket;

	@Column(name="lo_operation")
	private String loOperation;

	@Column(name="lo_operation_detail")
	private String loOperationDetail;

	@Column(name="lo_previous_packet")
	private int loPreviousPacket;

    public LogsOperation() {
    }

	public int getLoId() {
		return this.loId;
	}

	public void setLoId(int loId) {
		this.loId = loId;
	}

	public Date getLoDate() {
		return this.loDate;
	}

	public void setLoDate(Date loDate) {
		this.loDate = loDate;
	}

	public int getLoMsisdn() {
		return this.loMsisdn;
	}

	public void setLoMsisdn(int loMsisdn) {
		this.loMsisdn = loMsisdn;
	}

	public int getLoNextPacket() {
		return this.loNextPacket;
	}

	public void setLoNextPacket(int loNextPacket) {
		this.loNextPacket = loNextPacket;
	}

	public String getLoOperation() {
		return this.loOperation;
	}

	public void setLoOperation(String loOperation) {
		this.loOperation = loOperation;
	}

	public String getLoOperationDetail() {
		return this.loOperationDetail;
	}

	public void setLoOperationDetail(String loOperationDetail) {
		this.loOperationDetail = loOperationDetail;
	}

	public int getLoPreviousPacket() {
		return this.loPreviousPacket;
	}

	public void setLoPreviousPacket(int loPreviousPacket) {
		this.loPreviousPacket = loPreviousPacket;
	}

}