package com.jb.practice.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jb.practice.helloworld.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
