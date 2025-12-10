package com.course.enrollement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.enrollement.Entity.Course;
import com.course.enrollement.Entity.Lesson;

public interface LessonsRepository extends JpaRepository<Lesson, Integer>{

	int countByCourse(Course course);

}
