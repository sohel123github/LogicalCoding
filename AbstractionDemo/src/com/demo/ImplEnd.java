package com.demo;

public class ImplEnd implements End {

	@Override
	public void displayOff() {
		System.out.println("Off Display..");
	}

	public static void main(String[] args) {
		ImplEnd ie = new ImplEnd();

//		ie.data = 100;   --> You cannot modify variables in iterfaces as they are final..
		
		
		System.out.println(ie.data);
		
		ie.displayOff();

	}
}
