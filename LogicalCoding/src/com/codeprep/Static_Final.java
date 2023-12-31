package com.codeprep;

public class Static_Final {

	public static void main(String[] args) {
		System.out.println(Main.x);
	}

}
 
class Main{
//	public static final int x = 100; //--> [If you declare a variable as final then it will not 
										//	executed with static block]
										// Output --> 100
	
	public static int x = 100; //--> [If you declare a variable without final then it will 
								//	executed with static block]
								// Output --> main -- class static block
								//        --> 100
	static {
		System.out.println("main -- class static block");
	}
}