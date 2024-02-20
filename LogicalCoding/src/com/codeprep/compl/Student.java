package com.codeprep.compl;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
	
	int id;
	String name;
	int salary;
	
	public Student(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student(14, "Sohel", 15000));
		al.add(new Student(10, "Abhay", 3000));
		al.add(new Student(6, "Amol", 5000));
		
		Collections.sort(al);
//		System.out.println(al);
		for(Student i:al) {
			System.out.println(i);
		}
		
	}

	@Override
	public int compareTo(Student s) {
		if(this.salary > s.salary) {
			return 1;
		}else if(this.salary < s.salary) {
			return -1;
		}else {
			return 0;
		}
		
		
	}
}
