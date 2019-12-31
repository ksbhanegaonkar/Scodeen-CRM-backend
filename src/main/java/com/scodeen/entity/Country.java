package com.scodeen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "COUNTRY")
public class Country extends BaseIdEntity{
	@Id
	@Column(name = "COUNYRY_ID")
	private int countryId;
	@Column(name = "COUNTRY_NAME")
	private String countryName;

	
	public int getCountryId() {
		return countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	

}
