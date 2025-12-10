package com.course.enrollement.Entity;

import jakarta.persistence.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "users")
    private List<Enrollment> enrollments;
    @JsonIgnore
    @OneToMany(mappedBy = "users")
    private List<LessonCompletion> completedLessons;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Enrollment> getEnrollments() {
		return enrollments;
	}
	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}
	public List<LessonCompletion> getCompletedLessons() {
		return completedLessons;
	}
	public void setCompletedLessons(List<LessonCompletion> completedLessons) {
		this.completedLessons = completedLessons;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", enrollments=" + enrollments + ", completedLessons="
				+ completedLessons + "]";
	}
	
    
}

