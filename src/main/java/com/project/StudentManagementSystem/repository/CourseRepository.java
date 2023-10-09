package com.project.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.StudentManagementSystem.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
