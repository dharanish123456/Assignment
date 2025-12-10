package com.course.enrollement.Service;

import java.nio.channels.AcceptPendingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.course.enrollement.Response.Response;
import com.course.enrollement.UserDto.UserDto;

@Service
public class UserService {
@Autowired
private UserDto userDto;

public ResponseEntity<Response<String>> enrollUser(Integer courseId,Integer userId){
	Response<String> r=new Response<String>();
	r.setCode(HttpStatus.ACCEPTED.value());
	r.setMessage("Enrolled");
	r.setData(userDto.enrollUser(courseId,userId));
	return new ResponseEntity<Response<String>>(r,HttpStatus.ACCEPTED);
}

public ResponseEntity<Response<String>> getCourseProgress(Integer userID, Integer courseID) {
	Response<String> r=new Response<String>();
	r.setCode(HttpStatus.ACCEPTED.value());
	r.setMessage("Found");
	r.setData(userDto.getCourseProgress(userID,courseID));
	return new ResponseEntity<Response<String>>(r,HttpStatus.ACCEPTED);
}
}
