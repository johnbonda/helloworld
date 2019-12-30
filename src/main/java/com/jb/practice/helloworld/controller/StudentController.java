package com.jb.practice.helloworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jb.practice.helloworld.model.Student;
import com.jb.practice.helloworld.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@GetMapping
	public List<Student> getStudents() {
		return studentService.getAllStudents();
	}
	
	@DeleteMapping
	public String deleteStudent(int id) {
		studentService.deleteStudent(id);
		return "Deleted";
	}
	
	@GetMapping("/greaterThan50")
	public List<Student> greaterThanFifty() {
		return studentService.getStudentsGreaterThanFifty();
	}

	@GetMapping("/department/{dept}")
	public List<Student> getByDepartment(@PathVariable String dept) {
		return studentService.getByDepartment(dept);
	}
	
}
