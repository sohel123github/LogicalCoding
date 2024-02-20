package com.naveen.coding;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
		//a,e,i,o,u
//		char c = 'a';
		
		//1st way - 
	/*	if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println(c+" is vowel");
		}else {
			System.out.println(c+" is consonant");
		}*/
		
		//2nd way - 
		
	/*	switch(c) {
		case 'a': 
		case 'e': 
		case 'i': 
		case 'o': 
		case 'u': 
			System.out.println(c+" is vowel");
			break;
			default:
				System.out.println(c+" is consonant");
		}
		*/
		
		//----------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any char -");
		char c = sc.next().charAt(0);
		
		//1st way - 
		
//		if(c =='a' || c =='e' || c == 'i' || c == 'o' || c == 'u') {
//			System.out.println(c+" is vowels");
//		}else {
//			System.out.println(c+" is constraint");
//		}
		
		//2nd way - 
		
//		switch(c) {
//		case 'a':
//		case 'e':
//		case 'i':
//		case 'o':
//		case 'u':
//			System.out.println("Vowels");
//			break;
//			default:
//			System.out.println("Constraint");
//			
//		}
		
		
	}

}
