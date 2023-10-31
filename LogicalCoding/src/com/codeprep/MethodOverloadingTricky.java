package com.codeprep;

import java.lang.reflect.Method;

public class MethodOverloadingTricky {
	
	//--> i] int, ii] long, iii] Integer, iv] int...
	
//	public void print(Integer i) {
//		System.out.println("Integer");
//	}
	
//	public void print(int i) {
//		System.out.println("int");
//	}
	
//	public void print(int... i) {
//		System.out.println("int...");
//	}
	
	public void print(byte b) {
		System.out.println("byte");
	}
	
	public void print(short s) {
		System.out.println("short");
	}
	
	public void print(long l) {
		System.out.println("long");
	}
	
	public static void main(String[] args) {
		MethodOverloadingTricky mot = new MethodOverloadingTricky();
	//	mot.print(10);		--> if you use this way then it will print method like 
//								in this order --> i] int, ii] long, iii] Integer, iv] int... 
		
		mot.print((byte)10); // --> and for byte,, short you have to be call it explicitly..
		
	}
}
