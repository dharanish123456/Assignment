package com.course.enrollement.Entity;

import jakarta.persistence.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @JsonIgnore
    @OneToMany(mappedBy = "course")
    private List<Lesson> lessons;
    @JsonIgnore
    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Lesson> getLessons() {
		return lessons;
	}
	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
	public List<Enrollment> getEnrollments() {
		return enrollments;
	}
	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", lessons=" + lessons + ", enrollments=" + enrollments + "]";
	}
    
}

