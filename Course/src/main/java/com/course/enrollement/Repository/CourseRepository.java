package com.course.enrollement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.enrollement.Entity.Course;

public interface CourseRepository extends JpaRepository<Course,Integer> {
	

}
