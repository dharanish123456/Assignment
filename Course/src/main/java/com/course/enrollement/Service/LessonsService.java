package com.course.enrollement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.course.enrollement.Response.Response;
import com.course.enrollement.UserDto.LessonsDto;

@Service
public class LessonsService {
@Autowired
private LessonsDto lessonsDto;

public ResponseEntity<Response<String>> lessonsComplete(Integer cID,Integer lID){
	Response<String>r= new Response<String>();
r.setCode(HttpStatus.ACCEPTED.value());
r.setMessage("Complete");
r.setData(lessonsDto.lessonsDto(cID,lID));
return new ResponseEntity<Response<String>>(r,HttpStatus.ACCEPTED);
}

}
