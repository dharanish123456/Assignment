package com.course.enrollement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.enrollement.Entity.Users;

public interface UsersRepository  extends JpaRepository<Users, Integer>{
	

}
