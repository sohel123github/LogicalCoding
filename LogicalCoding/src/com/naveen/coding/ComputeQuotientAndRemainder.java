package com.naveen.coding;

public class ComputeQuotientAndRemainder {
	public static void main(String[] args) {
		
		int dividend = 30;
		int divisor = 4;
		
		int quotient = dividend / divisor;  //30/4 --> 7
		int reminder = dividend % divisor;  //30%4 --> 2
		
		System.out.println(quotient);
		System.out.println(reminder);
		
	}
}
