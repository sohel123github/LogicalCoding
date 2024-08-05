package com.pol;

public class ClassOne {

	public void meth1(int x) {
		System.out.println("This is ClassOne Meth1..");
	}

	public void meth1(int x, int y) {
		System.out.println("This is ClassOne Meth1 overrided..");
	}

	public static void main(String[] args) {

		ClassOne co = new ClassOne();

		co.meth1(10);
		co.meth1(50, 100);

	}

}
