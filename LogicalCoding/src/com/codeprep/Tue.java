package com.codeprep;


public class Tue {
	
	int id;
	String name;
	
	Tue(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
//		-----------------------------------------------------------------
//		Tue t1 = new Tue(101,"Sohel");
//		Tue t2 = new Tue(101,"Sohel");
////		Tue t2 = new Tue(102,"Sakib");
//		Tue t3 = new Tue(103,"Akash");
//		Tue t4 = t1;
//		
//		//Object class equals method - 
//		System.out.println(t1==t2);
//		System.out.println(t1==t3);
//		System.out.println(t1==t4);
//		System.out.println();
//		//String class equals method - 
//		
//		System.out.println(t1.equals(t2));
//		System.out.println(t1.equals(t3));
//		System.out.println(t1.equals(t4));
//		-----------------------------------------------------------------

		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = new String("Hi");
		String s4 = new String("How");
		
		//Object class equals method - 
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println();
		//String class equals method - 
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}
}
