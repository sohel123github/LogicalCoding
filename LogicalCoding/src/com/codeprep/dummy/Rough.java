package com.codeprep.dummy;

public class Rough {
	
	public static void printNum(int num) {
		if(num <= 10) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}

	public static void printNum(int StNum, int enNum) {
		if(StNum <= enNum) {
			System.out.println(StNum);
			StNum++;
			printNum(StNum, enNum);
		}
	}
	
	public static void main(String[] args) {

//		printNum(1);
		
		printNum(1, 100);
		
		
}
}
