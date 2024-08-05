package com.demo;

public class Program {

	public Program() {
		System.out.println("Hi..");
	}

	public Program(int x) {
		System.out.println("whatsapp..");
	}

	public void Hello() {
		System.out.println("Hello..");
	}

	public static void main(String[] args) {

		Program prog = new Program(1000);

		prog.Hello();

	}
}
