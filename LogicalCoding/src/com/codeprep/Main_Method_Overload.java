package com.codeprep;

public class Main_Method_Overload {
	
	public static void main(String[] args) {
		System.out.println("Main method 1");
		main("Testing");
		main(10);
		main(100, 200);
	}
	
	public static void main(String args) {
		System.out.println("Main method 2");
	}
	
	public static void main(int a) {
		System.out.println("Main method 3");
	}

	public static void main(int a, int b) {
		System.out.println("Main method 4");
	}
}
