package com.project.StudentManagementSystem.service;

import java.util.List;

import com.project.StudentManagementSystem.entity.Course;
public interface CourseService {
	List<Course> getAllCourses();
	Course saveCourse(Course course);
	
	Course getCourseById(Long id);
	Course updateCourse(Course course);
	void deleteCourseById(Long id);
	
	
}
