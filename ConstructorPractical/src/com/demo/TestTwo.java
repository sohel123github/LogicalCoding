package com.demo;

public class TestTwo {

	int id;
	String name;
	String address;

	TestTwo(int Id, String Name, String Address) {
		id = Id;
		name = Name;
		address = Address;
	}

	public static void main(String[] args) {

		TestTwo tt = new TestTwo(101, "Sohel", "Islampur");

		System.out.println(tt.id);
		System.out.println(tt.name);
		System.out.println(tt.address);

	}
}
