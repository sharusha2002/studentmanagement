package com.project.StudentManagementSystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.StudentManagementSystem.entity.Student;
import com.project.StudentManagementSystem.repository.StudentRepository;
import com.project.StudentManagementSystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}
	
	
	@Override
	public Student updatestudent(Student student) {
				return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
	}
	
}
