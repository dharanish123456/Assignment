package com.course.enrollement.UserDto;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.course.enrollement.Entity.Course;
import com.course.enrollement.Entity.Lesson;
import com.course.enrollement.Entity.LessonCompletion;
import com.course.enrollement.Repository.CourseRepository;
import com.course.enrollement.Repository.LessonCompletionRepository;
import com.course.enrollement.Repository.LessonsRepository;

@Repository
public class LessonsDto {
@Autowired
private CourseRepository courseRepo;
@Autowired
private LessonsRepository lessonsRepo;
@Autowired
private LessonCompletionRepository lessonCompletionRepo;
public String lessonsDto(Integer cID, Integer lID) {
	
	Optional<Course> course =courseRepo.findById(cID);
	if(course.isEmpty()) {
		return "Course Not Found";
	}
	Optional<Lesson> lesson=lessonsRepo.findById(lID);
	if(lesson.isEmpty()) {
		return "Lesson not Found";
	}
	
	if (!lesson.get().getCourse().getId().equals(course.get().getId())) {
	    return "Lesson does not belong to this course";
	}
	
	
	boolean alreadyComplete=lessonCompletionRepo.existsByCourseAndLesson(course.get(),lesson.get());
	
	if(alreadyComplete) {
		return "User already Completed the Lesson";
	}
	 LessonCompletion lc = new LessonCompletion();
     lc.setCourse(course.get());
     lc.setLesson(lesson.get());

     lessonCompletionRepo.save(lc);

     return "Lesson marked as completed";

}

}
