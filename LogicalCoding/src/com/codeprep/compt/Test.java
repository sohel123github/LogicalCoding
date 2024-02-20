package com.codeprep.compt;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(new Student(106, "Sohel", 12000));
		al.add(new Student(101, "Abhay", 8000));
		al.add(new Student(110, "Raj", 3000));
		
		Collections.sort(al, new NameComparator());
		for(Student i:al) {
			System.out.println(i);
		}
		
	}
}
