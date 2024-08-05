package com.demo;

public class Mobile {

	private String name = "realme";

	private String colour = "grey";

	private void calling() {
		System.out.println(name + " Calling.. and colour is --> " + colour);
	}

	private void messaging() {
		System.out.println("Messaging..");
	}

	public static void main(String[] args) {

		Mobile mob = new Mobile();

		mob.calling();
		mob.messaging();

	}

}
