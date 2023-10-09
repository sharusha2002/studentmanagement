package com.project.StudentManagementSystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "coursename") // Corrected the field name
	private String coursename;
	
	@Column(name = "duration")
	private int duration;
	
	@Column(name = "instructorname")
	private String instructorname;
	
	@Column(name = "maxseats")
	private int maxseats;
	public Course() {
		
	}

	public Course(Long id, String coursename, int duration, String instructorname, int maxseats) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.duration = duration;
		this.instructorname = instructorname;
		this.maxseats=maxseats;
		}

	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getInstructorname() {
		return instructorname;
	}

	public void setInstructorname(String instructorname) {
		this.instructorname = instructorname;
	}

	public int getMaxseats() {
		return maxseats;
	}
	
	public void setMaxseats(int maxseats) {
		this.maxseats = maxseats;
	}

	
	
	
}
