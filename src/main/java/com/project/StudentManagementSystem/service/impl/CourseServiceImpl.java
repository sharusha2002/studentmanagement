package com.project.StudentManagementSystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.StudentManagementSystem.entity.Course;
import com.project.StudentManagementSystem.repository.CourseRepository;
import com.project.StudentManagementSystem.service.CourseService;


@Service
public class CourseServiceImpl implements CourseService{

	
	private CourseRepository courseRepository;
	
	public CourseServiceImpl(CourseRepository courseRepository) {
		super();
		this.courseRepository = courseRepository;
	}

	@Override
	public List<Course> getAllCourses() {
		
		return courseRepository.findAll();
	}

	@Override
	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}

	@Override
	public Course getCourseById(Long id) {
		return courseRepository.findById(id).get();
	}


	@Override
	public Course updateCourse( Course course) {
				return courseRepository.save(course);
	}
	
	@Override
	public void deleteCourseById(Long id) {
		courseRepository.deleteById(id);
	}
	



	
}
