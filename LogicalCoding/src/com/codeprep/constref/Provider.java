package com.codeprep.constref;

@FunctionalInterface
public interface Provider {
	
	// FLOW --> [Provider -> Student -> ConsMain]
	
	public Student getStudent();
	
	
}
