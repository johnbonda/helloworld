package com.jb.practice.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jb.practice.helloworld.model.Teacher;
import com.jb.practice.helloworld.repository.TeacherRepository;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

}
