package com.scodeen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scodeen.entity.Course;

public interface CourseRepo extends JpaRepository<Course,Integer>{
	Course getCourseByCourseId(int courseId);

}
