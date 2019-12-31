package com.scodeen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CITY")
public class City extends BaseIdEntity{
	@Column(name = "STATE_ID")
	private int stateId;
	@Column(name = "CITY_NAME")
	String cityName;
	@Column(name = "PINCODE")
	String pincode;
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
