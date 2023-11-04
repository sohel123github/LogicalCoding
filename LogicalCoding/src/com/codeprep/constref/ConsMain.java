package com.codeprep.constref;

public class ConsMain {
	
	public static void main(String[] args) {
		
		Provider provider = Student::new;
		Student student = provider.getStudent();
		student.display();
		student.displayTwo();
		
	}	
	
}
