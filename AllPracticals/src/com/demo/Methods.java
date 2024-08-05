package com.demo;

public class Methods {
	// static method -
	public static void data(String A, String B) {
		System.out.println("Hello..");
	}

	// Non-static method -
	public void add(int x, int y) {
		System.out.println("Addition of two numbers is --> " + (x + y));
	}

	public static void main(String[] args) {

//		Static method calling -->[C-O-M]
//		1.
		Methods.data("Kem", "Cho..");
//		2.
		Methods meth = new Methods();
		meth.data("Kaise", "Ho..");
//		3.
		data("How Are", "you..");

//		-----------------------------------------------------------------------------

//		Non-static method calling -->[O]
//		1.
		Methods m = new Methods();
		m.add(20, 20);
	}
}
