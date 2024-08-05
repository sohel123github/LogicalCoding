package com.web;

import java.util.Optional;

public class OptionalPractical {

	public static Optional<String> getName() {
		String name = null;
		return Optional.ofNullable(name);
	}

	public static void main(String[] args) {

//		String str = "Java is language";
		/*
		 * String str = null; // // if (str == null) { //
		 * System.out.println("This is Null Object.."); // } else { //
		 * System.out.println("This is not Null.."); // }
		 * 
		 * Optional<String> nameOptional = Optional.ofNullable(str);
		 * 
		 * System.out.println(nameOptional.isPresent());
		 * System.out.println(nameOptional.get());
		 * System.out.println(nameOptional.orElse("This Is Not Null.."));
		 */
//-----------------------------------------------------------------------------

		Optional<String> nameOptional = getName();
		System.out.println(nameOptional.isPresent());
		System.out.println(nameOptional.get());
		System.out.println(nameOptional.orElse("This is Null Object"));
	}

}
