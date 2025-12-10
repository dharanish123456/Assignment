package com.course.enrollement.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


@Entity

public class LessonCompletion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "users")
    private Users users;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "course")
    private Course course;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "lesson")
    private Lesson lesson;

  

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Users getUser() {
		return users;
	}

	public void setUser(Users users) {
		this.users = users;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	@Override
	public String toString() {
		return "LessonCompletion [id=" + id + ", user=" + users + ", course=" + course + ", lesson=" + lesson + "]";
	}



  
}

