package com.pack.one;

public class Demo {

	private int data = 10;

	private void message() {
		System.out.println("Hello Message..");
	}
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		
		System.out.println(d.data);
		
		d.message();
	}
	
}
