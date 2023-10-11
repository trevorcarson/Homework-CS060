package com.gradescope.hw5;

public class Course {
	private String code;
	private int cap;
	private Student [] enrolled;
	//Constructor:
	
	public Course(String code, int cap) {
		this.code = code;
		this.cap = cap;
		this.enrolled = new Student [0];
	}
	// Returns the number of students enrolled in a course:
	public int getNumEnrolled() {
        return this.enrolled.length;
    }
	// enrolls a student in a course
	public int enrollStudent(Student s) {
		if(this.enrolled.length < this.cap) {
			Student [] newEnrolled = new Student [this.enrolled.length + 1];
			for(int i = 0; i < this.enrolled.length; i++) {
				if(this.enrolled[i].equals(s)) return -1;
				newEnrolled[i] = this.enrolled[i];
			}
			newEnrolled[this.enrolled.length] = s;
			this.enrolled = newEnrolled;
			return newEnrolled.length;
			}
		else return -1;
	}
	// lists the students with their id in the course
	public String getStudents(){
		String s = "[";
		for(int i = 0; i < enrolled.length; i++) {
			s += enrolled[i];
         if(!(i + 1 == enrolled.length)) s += ", ";
		}
		s += "]";
		return s;		
	}
	// gets the course code
	public String getCode() {
		return this.code;
	}
	// gets the maximum capacity of the course (cap).
	public int getCap() {
		return this.cap;
	}
}
