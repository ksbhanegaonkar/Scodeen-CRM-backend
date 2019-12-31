package com.scodeen.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CANDIDATE_DETAILS")
public class CandidateDetails extends CommonAuditColumns{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CANDIDATE_ID")
	int candidateId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="MIDDLE_NAME")
	private String middleName;
	@Column(name="CONTACT_NUMBER")
	private String contactNumber;
	@Column(name="EMAIL")
	private String email;
	@Column(name="CITY_ID")
	private int cityId;
	@Column(name = "COURSE_ID")
	private int courseId;
	@Column(name = "BATCH_ID")
	private int batchId;
	@Column(name = "IS_REGISTERED")
	private int isRegistered;
	@Column(name = "IS_WORKING")
	private int isWorking;
	@Column(name = "WORKING_FIELD")
	private int workingField;
	@Column(name = "REGISTER_DATE")
	private Date registerDate;
	@Column(name = "ENQUIRY_DATE")
	private Date enquiryDate;
	
	@OneToOne
	@JoinColumn(name = "CITY_ID", insertable = false,updatable = false)
	private City city;

	public int getCandidateId() {
		return candidateId;
	}

	
	public CandidateDetails(){
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public int getBatchId() {
		return batchId;
	}


	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}


	public int getIsRegistered() {
		return isRegistered;
	}


	public void setIsRegistered(int isRegistered) {
		this.isRegistered = isRegistered;
	}


	public int getIsWorking() {
		return isWorking;
	}


	public void setIsWorking(int isWorking) {
		this.isWorking = isWorking;
	}


	public int getWorkingField() {
		return workingField;
	}


	public void setWorkingField(int workingField) {
		this.workingField = workingField;
	}


	public Date getRegisterDate() {
		return registerDate;
	}


	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}


	public Date getEnquiryDate() {
		return enquiryDate;
	}


	public void setEnquiryDate(Date enquiryDate) {
		this.enquiryDate = enquiryDate;
	}


	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}


}
