package com.scodeen.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity
@Table(name = "CANDIDATE_DETAILS")
@Transactional
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
	@Column(name = "CITY")
	private String city;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "IS_REGISTER")
	private int isRegistered;
	@Column(name = "IS_WORKING")
	private int isWorking;
	@Column(name = "WOKRING_FIELD")
	private String workingField;
	@Column(name = "REGISTER_DATE")
	private Date registerDate;
	@Column(name = "ENQUIRY_DATE")
	private Date enquiryDate;
	

	
	@ManyToMany
	@JoinTable(name = "Candidate_batch",
	joinColumns = @JoinColumn(name = "CANDIDATE_ID"),
	inverseJoinColumns = @JoinColumn(name = "BATCH_ID"))
	List<Batch> batches = new ArrayList<>();
	
	
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="CANDIDATE_ID")
	List<PaymentDetails> paymentDetails = new ArrayList<>();
	

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


	public String getWorkingField() {
		return workingField;
	}


	public void setWorkingField(String workingField) {
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


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public List<Batch> getBatches() {
		return batches;
	}


	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}


	public List<PaymentDetails> getPaymentDetails() {
		return paymentDetails;
	}


	public void setPaymentDetails(List<PaymentDetails> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}


}
