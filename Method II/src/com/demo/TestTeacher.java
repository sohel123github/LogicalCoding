package com.demo;

public class TestTeacher {

	public static Teacher addTeacher() {
		int id = 1;
		return new Teacher(id);
	}

	public static void main(String[] args) {
		Teacher t = addTeacher();
		System.out.println(t.id);
	}

}
