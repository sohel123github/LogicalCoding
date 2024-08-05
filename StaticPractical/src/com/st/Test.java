package com.st;

public class Test {

//	int data = 10;

	static int data = 10;
	
	Test() {
		data++;
		System.out.println(data);
	}

	public static void main(String[] args) {
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();


	}
}
