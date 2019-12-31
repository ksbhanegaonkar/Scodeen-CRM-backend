package com.scodeen.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseIdEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	@Column(name="CREATED_ON")
	private Date createdOn;
	@Column(name="CREATED_BY")
	private int createdBy;
	@Column(name="MODFIED_ON")
	private Date modifiedOn;
	//@Column(name="MODFIED_BY")
	//private int modifiedBy;
	@Column(name="REMARKS")
	private String remarks;

	public int getId() {
		return id;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/*
	 * public int getModifiedBy() { return modifiedBy; }
	 * 
	 * public void setModifiedBy(int modifiedBy) { this.modifiedBy = modifiedBy; }
	 */




	
	

}