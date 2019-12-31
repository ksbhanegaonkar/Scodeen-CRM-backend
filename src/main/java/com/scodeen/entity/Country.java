package com.scodeen.entity;

import javax.persistence.Column;

public class Country extends BaseIdEntity{
	@Column(name = "COUNTRY_NAME")
	private String countryName;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	

}
