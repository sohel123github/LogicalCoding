package com.pol;

public class ClassTwo extends ClassOne {

	@Override
	public void meth1(int x, int y) {
		System.out.println("This is ClassTwo Meth1 overrided..");
	}

	public static void main(String[] args) {
		ClassOne ct = new ClassTwo();

		ct.meth1(20, 30);
	}

}
