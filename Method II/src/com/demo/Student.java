package com.demo;

public class Student {

	int id = 101;
	String name = "Sohel";
	int salary = 1000;

	public static Student addStudent() {
		Student stu = new Student();
		System.out.println(stu);
		return stu;
	}

	public static void main(String[] args) {
		addStudent();
	}

}
