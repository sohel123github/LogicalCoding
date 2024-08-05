package com.demo;

public class StudentTwo {

	int id = 101;
	String name = "Sohel";
	int salary = 1000;

	public static StudentTwo addStudent() {
		StudentTwo stu = new StudentTwo();
		System.out.println(stu);
		return stu;
	}

	@Override
	public String toString() {
		return "StudentTwo [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		addStudent();
	}
}
