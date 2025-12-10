package com.course.enrollement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.enrollement.Entity.Course;
import com.course.enrollement.Entity.Lesson;
import com.course.enrollement.Entity.LessonCompletion;
import com.course.enrollement.Entity.Users;

public interface LessonCompletionRepository extends JpaRepository<LessonCompletion, Integer>{

	boolean existsByCourseAndLesson(Course course, Lesson lesson);

	int countByUserAndCourse(Users user, Course course);

}
