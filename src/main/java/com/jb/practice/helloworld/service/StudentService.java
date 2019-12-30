package com.jb.practice.helloworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jb.practice.helloworld.model.Student;
import com.jb.practice.helloworld.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}
	
	public List<Student> getStudentsGreaterThanFifty() {
		return studentRepository.marksGreaterThanFifty();
	}
	
	public List<Student> getByDepartment(String dept) {
		return studentRepository.findByDepartment(dept);
	}

}
