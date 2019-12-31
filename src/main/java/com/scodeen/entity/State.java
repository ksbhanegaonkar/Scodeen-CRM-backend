package com.scodeen.entity;

import javax.persistence.Column;

public class State extends BaseIdEntity{
	@Column(name = "COUNTRY_ID")
	private int countryId;
	@Column(name = "STATE_NAME")
	private String stateName;
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	
	
}
