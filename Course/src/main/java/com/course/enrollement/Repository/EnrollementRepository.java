package com.course.enrollement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.enrollement.Entity.Course;
import com.course.enrollement.Entity.Enrollment;
import com.course.enrollement.Entity.Users;

public interface EnrollementRepository extends JpaRepository<Enrollment, Integer>{
	boolean existsByUserAndCourse(Users user, Course course);


}
