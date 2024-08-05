package com.cons;

public class ConstTwo extends ConstOne {

	int x, y;

	public ConstTwo() {
		System.out.println("NoArgument ConstTwo..");
	}

	public ConstTwo(int x, int y) {
		super(5);
		System.out.println("X & Y value is --> " + x + " " + y);
	}

}
