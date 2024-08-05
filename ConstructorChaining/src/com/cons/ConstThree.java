package com.cons;

public class ConstThree extends ConstTwo{

	int x, y, z;

	public ConstThree() {
		System.out.println("NoArgument ConstThree..");
	}

	public ConstThree(int x, int y, int z) {
		super(50,55);
		System.out.println("X, Y, Z value is --> " + x + " " + y + " " + z);
	}

}
