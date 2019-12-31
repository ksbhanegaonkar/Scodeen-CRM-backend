package com.scodeen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Course extends CommonAuditColumns{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COURSE_ID")
	private int courseId;
	@Column(name = "COURSE_NAME")
	private String courseName;
	@Column(name = "COURSE_SYLLABUS")
	private String courseSyllabus;
	@Column(name = "COURSE_DESCRIPTION")
	private String courseDescription;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseSyllabus() {
		return courseSyllabus;
	}
	public void setCourseSyllabus(String courseSyllabus) {
		this.courseSyllabus = courseSyllabus;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public int getCourseId() {
		return courseId;
	}
	
	
	
	

}
