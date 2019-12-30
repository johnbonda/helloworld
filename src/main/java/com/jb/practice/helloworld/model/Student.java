package com.jb.practice.helloworld.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String department;
	private int marks;

	public Student() {
		super();
	}

	public Student(int id, String name, String department, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
