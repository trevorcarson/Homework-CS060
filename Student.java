package com.gradescope.hw5;

public class Student {
	private String name;
	private long id;
	
	public Student(String name, long id) {
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return name + " [" + id + "]";
	}
	public long getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public boolean equals(Student s) {
		if(this.id == s.id) return true;
		return false;
	}
	public void setName(String n) {
		this.name = n;
	}

}
