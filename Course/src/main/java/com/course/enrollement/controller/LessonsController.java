package com.course.enrollement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.enrollement.Response.Response;
@RequestMapping("courses")
@RestController
public class LessonsController {
@Autowired
private LessonsService lessonsService;
@PostMapping("{courseID}/lessons/{lessonsID}/complete")
 public ResponseEntity<Response<String>> lessonsComplete(@PathVariable Integer courseId,@PathVariable Integer lessonsId){
	return lessonsService.lessonsComplete(courseId,lessonsId);
}
}
