package com.codeprep.compt;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student obj1, Student obj2) {
		return obj1.name.compareTo(obj2.name);
	}

//	@Override
//	public String compare(Student obj1, Student obj2) {
//		return obj1.name.equals(obj2.name);
//		
//	}
	
	

}
