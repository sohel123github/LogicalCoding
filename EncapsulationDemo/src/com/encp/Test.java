package com.encp;

import java.util.Scanner;

public class Test {

	public static void userInput() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id here - ");
		int id = sc.nextInt();
		System.out.println("Enter name here - ");
		String name = sc.next();
		System.out.println("Enter address here - ");
		String address = sc.next();
		sc.close();

		Employee emp = new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setAddress(address);

		System.out.println("Id is --> " + emp.getId());
		System.out.println("Name is --> " + emp.getName());
		System.out.println("Address is --> " + emp.getAddress());
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			userInput();
		}
	}
}
