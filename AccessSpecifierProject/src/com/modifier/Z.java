package com.modifier;

import com.specifier.A;

public class Z extends A {

	public static void main(String[] args) {
		A a = new A();
		Z z = new Z();

		// public specifier..
		a.print();

		// protected specifier..
		z.print1();

		// Default Specifier..
//		Not Accessible Deafault specifier method..

		// Private specifier..
//		Not Accessible Deafault specifier method..

	}
}
