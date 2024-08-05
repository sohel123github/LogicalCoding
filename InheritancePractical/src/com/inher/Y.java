package com.inher;

public class Y extends X {

	int y = 40;
	int z = 50;

	void meth2() {
		System.out.println("This is Class Y Meth 2..");
	}

	void meth3() {
		System.out.println("This is Class Y Meth 3");
	}

	public static void main(String[] args) {
//		X x = new X();
//
//		System.out.println(x.x);
//		System.out.println(x.y);
//
//		x.meth1();
//		x.meth2();

//		------------------------------------------

//		Y y = new Y();
//
//		System.out.println(y.x);
//		System.out.println(y.y);
//		System.out.println(y.z);
//
//		y.meth1();
//		y.meth2();
//		y.meth3();

//		--------------------------------------------

		X x = new Y();

		System.out.println(x.x);
		System.out.println(x.y);

		x.meth1();
		x.meth2();

	}
}
