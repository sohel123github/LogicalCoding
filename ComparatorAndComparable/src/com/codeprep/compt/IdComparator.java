package com.codeprep.compt;

import java.util.Comparator;

public class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student obj1, Student obj2) {
		if(obj1.id > obj2.id) {
			return 1;
		}else if(obj1.id < obj2.id) {
			return -1;
		}else {
			return 0;
		}
		
	}

}
