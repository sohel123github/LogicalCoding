package com.demo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age - ");
		int age = sc.nextInt();
		switch (age) {
		case 18:
			System.out.println("Adult");
			break;
		case 23:
			System.out.println("Job");
			break;
		case 58:
			System.out.println("Retire");
			break;
		default:
			System.out.println("Enjoy..");
		}

	}
}
