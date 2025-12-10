package com.course.enrollement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.course.enrollement.Response.Response;
import com.course.enrollement.Service.UserService;

@RequestMapping("courses")
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/{courseID}/enroll")
	public ResponseEntity<Response<String>> enrollUser(@PathVariable Integer courseID,@RequestParam Integer userId){
		return userService.enrollUser(courseID,userId);
	}
	@GetMapping("users/{userID}/courses/{courseID}/progress")
		public ResponseEntity<Response<String>> getCourseProgress(@PathVariable Integer userID,@PathVariable Integer courseID){
			return userService.getCourseProgress(userID,courseID);
		}
	}
	

