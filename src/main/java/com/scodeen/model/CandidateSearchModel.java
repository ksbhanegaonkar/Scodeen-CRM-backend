package com.scodeen.model;

public class CandidateSearchModel {
	int id;
	String name;
	String batchName;
	int isRegistered;
	
	
	public CandidateSearchModel(int id, String name, String batchName, int isRegistered) {
		super();
		this.id = id;
		this.name = name;
		this.batchName = batchName;
		this.isRegistered = isRegistered;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public int getIsRegistered() {
		return isRegistered;
	}
	public void setIsRegistered(int isRegistered) {
		this.isRegistered = isRegistered;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
