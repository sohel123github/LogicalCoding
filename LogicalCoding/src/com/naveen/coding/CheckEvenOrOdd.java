package com.naveen.coding;

import java.util.Scanner;

public class CheckEvenOrOdd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no here - ");
		int no = sc.nextInt();
		
		if(no % 2 == 0) {
			System.out.println("Even no");
		}else {
			System.out.println("Odd no");
		}
		
	}
}
