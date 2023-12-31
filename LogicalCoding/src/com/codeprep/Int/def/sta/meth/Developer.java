package com.codeprep.Int.def.sta.meth;

public interface Developer {
	
	//Flow --> [Developer -> AndroidDeveloper -> WebDeveloper -> IosDeveloper -> Test]
	
	void develop();
	
	void test();
	
	default void init() {
		System.out.println("This is default method of interface for all classes ");
	}
	
	public static void destroy () {
		System.out.println("This is static method...");
	}
	
}
