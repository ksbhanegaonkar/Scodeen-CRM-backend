package com.scodeen.model;

public class CandidateSearchModel {
	String name;
	String batchName;
	int isRegistered;
	
	
	public CandidateSearchModel(String name, String batchName, int isRegistered) {
		super();
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
	
	
}
