package com.codeprep;

public class PrintNumberWithoutLoop {
	//--> 1st way - 
//	public static void printNum(int num) {
//		if(num <= 10) {
//			System.out.println(num);
//			num++;
//			printNum(num);
//		}
//	}
	
	//2nd way -
	public static void printNumber(int stNum, int endNum) {
		if(stNum <= endNum) {
			System.out.println(stNum);
			stNum++;
			printNumber(stNum, endNum);
		}
	}
	
	public static void main(String[] args) {
		
//		printNum(1);
		
		printNumber(1, 100);
		
	}
}
