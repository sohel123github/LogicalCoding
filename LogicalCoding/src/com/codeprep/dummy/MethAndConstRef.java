package com.codeprep.dummy;

public class MethAndConstRef {
	
		
	public static void main(String[] args) {
//		System.out.println("Main method is running...");
		
		WorkInter workInter = ImplMeth::doStuff;
		workInter.doTask();
		
	}
}
