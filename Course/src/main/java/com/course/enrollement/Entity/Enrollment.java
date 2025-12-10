package com.course.enrollement.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity

public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Users getUser() {
		return users;
	}

	public void setUser(Users user) {
		this.users= user;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Enrollment [id=" + id + ", user=" + users + ", course=" + course + "]";
	}




}
