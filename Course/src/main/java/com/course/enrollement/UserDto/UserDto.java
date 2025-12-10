package com.course.enrollement.UserDto;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.course.enrollement.Entity.Course;
import com.course.enrollement.Entity.Enrollment;
import com.course.enrollement.Entity.Users;
import com.course.enrollement.Repository.*;

@Repository
public class UserDto {
	@Autowired
	private UsersRepository usersRepo;
	@Autowired
	private CourseRepository courseRepo;
	@Autowired 
	private EnrollementRepository enrolledRepo;
	@Autowired
	private LessonsRepository lessonsRepo;
	@Autowired
	private LessonCompletionRepository lessonCompletionRepo;
	public String enrollUser(Integer courseID,Integer userID) {
		Optional<Course> o=courseRepo.findById(courseID);
		if(o.isEmpty()) {
			
			return "No Course Found";
		}
		Optional<Users> u= usersRepo.findById(userID);
		if(u.isEmpty()) {
			return "No User found";
			
		}
		boolean alreadyEnrolled=enrolledRepo.existsByUserAndCourse(u.get(), o.get());
		if(alreadyEnrolled) {
			return "User Already Enreolled The Course";
		}
		else {
			Enrollment e=new Enrollment();
			e.setCourse(o.get());
			e.setUser(u.get());
			enrolledRepo.save(e);
			return "Course Has Been Enrolled";
		}
	}
	public String getCourseProgress(Integer userID, Integer courseID) {

	    Optional<Course> courseOpt = courseRepo.findById(courseID);
	    if (courseOpt.isEmpty()) {
	        return "Course not found";
	    }

	    Optional<Users> userOpt = usersRepo.findById(userID);
	    if (userOpt.isEmpty()) {
	        return "User not found";
	    }

	    Course course = courseOpt.get();
	    Users user = userOpt.get();

	    int totalLessons = lessonsRepo.countByCourse(course);

	    if (totalLessons == 0) {
	        return "This course has no lessons";
	    }

	    int completedLessons = lessonCompletionRepo.countByUserAndCourse(user, course);

	    double percent = (completedLessons * 100.0) / totalLessons;

	    return "Completed " + completedLessons + " out of " + totalLessons + " lessons (" + percent + "%)";
	}

}
