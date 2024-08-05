package com.st;

public class Student {

	private int id;

	private String name;

	private static String company = "Islampur";

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	void diaplay() {
		System.out.println("id is --> " + id + " name is --> " + name + " company is --> " + company);
	}

	public static void main(String[] args) {
		Student st1 = new Student(11, "Salman");
		Student st2 = new Student(12, "Shadab");
		Student st3 = new Student(13, "Shahrukh");

		st1.diaplay();
		st2.diaplay();
		st3.diaplay();

	}
}
