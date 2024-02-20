package com.codeprep;

public class Sample2 {
	
	public Sample2 () {
		System.out.println("Hello - I am sample2 constructor of no argument type");
	}
	
	public Sample2 (String s) {
		this();
		System.out.println("Hello - I am sample2 constructor of string type "+s);
	}
	
	public Sample2 (int i) {
		this("Sohel");
		System.out.println("Hello - I am sample2 constructor of int type "+i);
	}
	
	public static void main(String[] args) {
//	Sample2 sam2 = new Sample2();
//	Sample2 sam2 = new Sample2("Sohel");
	Sample2 sam2 = new Sample2(100);
	
	
	
}
}
