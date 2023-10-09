 package com.project.StudentManagementSystem.service;

import java.util.List;

import com.project.StudentManagementSystem.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	Student updatestudent(Student student);
	
	void deleteStudentById(Long id);
}
