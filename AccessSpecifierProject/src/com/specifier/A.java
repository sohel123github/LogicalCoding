package com.specifier;

public class A {

	public void print() {
		System.out.println("Public Specifier..");
	}

	protected void print1() {
		System.out.println("Protected Specifier..");
	}

	void print2() {
		System.out.println("Default Specifier..");
	}

	private void print3() {
		System.out.println("Private Specifier..");
	}

	public static void main(String[] args) {
		A a = new A();

		// public specifier..
		a.print();

		// Protected specifier..
		a.print1();

		// Default specifier..
		a.print2();

		// Private specifier..
		a.print3();
	}
}
