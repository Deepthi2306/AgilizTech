package com.at.examples.arrays;

class Student{
	int sid;
	String sname;
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public void display() {
		System.out.println("Student ID: "+sid+ "  "+"Student Name: "+sname);
	}
}

public class ArrayofObjects {

	public static void main(String[] args) {
		Student[] student_array = new Student[3];
		student_array[0] = new Student(1,"Nihal");
		student_array[1] = new Student(2,"Vinay");
		student_array[2] = new Student(3,"Bhargavi");
		student_array[0].display();
		student_array[1].display();
		student_array[2].display();
	}

}
