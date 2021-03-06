package com.scodeen.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BATCH")
public class Batch extends CommonAuditColumns{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BATCH_ID")
	private int batchId;
	@Column(name = "COURSE_ID")
	private int courseId;
	@Column(name = "BATCH_NAME")
	private String batchName;
	@Column(name = "BATCH_SYLLABUS")
	private String batchSyllabus;
	@Column(name = "BATCH_DESCRIPTION")
	private String batchDescription;
	
	
	
	@ManyToMany(mappedBy = "batches", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	List<CandidateDetails> candidates = new ArrayList<>();
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getBatchSyllabus() {
		return batchSyllabus;
	}
	public void setBatchSyllabus(String batchSyllabus) {
		this.batchSyllabus = batchSyllabus;
	}
	public String getBatchDescription() {
		return batchDescription;
	}
	public void setBatchDescription(String batchDescription) {
		this.batchDescription = batchDescription;
	}
	public int getBatchId() {
		return batchId;
	}
	
	
	
	public List<CandidateDetails> getCandidates() {
		return candidates;
	}
	public void setCandidates(List<CandidateDetails> candidates) {
		this.candidates = candidates;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", courseId=" + courseId + ", batchName=" + batchName + ", batchSyllabus="
				+ batchSyllabus + ", batchDescription=" + batchDescription + "]";
	}
	
	
	
	
	
	
}
