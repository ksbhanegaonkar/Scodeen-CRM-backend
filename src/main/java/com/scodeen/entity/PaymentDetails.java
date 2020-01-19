package com.scodeen.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;
@Entity
@Table(name = "PAYMENT_DETAILS")
public class PaymentDetails extends CommonAuditColumns{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PAYMENT_ID")
	private int paymentId;
	@Column(name = "CANDIDATE_ID")
	private int candidateId;
	@Column(name = "BATCH_ID")
	private int batchId;
	@Column(name = "COURSE_ID")
	private int courseId;
	@Column(name = "PAYMENT_DATE")
	private Date paymentDate;
	@Column(name = "TOTAL_FEES")
	private int totalFees;
	@Column(name = "FEES_PAID")
	private int feesPaid;
	
	@ManyToOne
	@JoinColumn(name="CANDIDATE_ID", insertable = false, updatable = false)
	CandidateDetails candidateDetails;
	
	@OneToOne
	@JoinColumn(name = "BATCH_ID",insertable = false, updatable = false)
	Batch batch;
	
	public int getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(int totalFees) {
		this.totalFees = totalFees;
	}
	public int getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}
	public void setCandidateDetails(CandidateDetails candidateDetails) {
		this.candidateDetails = candidateDetails;
	}
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	
}
