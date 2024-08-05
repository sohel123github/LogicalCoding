package com.codeprep.optional;

import java.util.Optional;

public class OptionalExample {

//		Example 2 - 

	public static Optional<String> getName() {
		String name = null;
		return Optional.ofNullable(name);
	}

	public static void main(String[] args) {

		// Optional class methods are --> [i,g,o] --> [isPresent(), get(), orElse()]

		/*
		 * Example 1 - --> In this example if we not provide [if else] condition then it
		 * will give [Null Pointer exception]
		 */

//		String str = "Java is language";
//		String str = null;
//		if(str == null) {
//			System.out.println("This is null object");
//		}else {
//			System.out.println(str.length());							//16
//		}

		/*
		 * --> so, for this solution is [Optional class]...
		 */

//		String str = "Java is language";
//		String str = null;
//		Optional<String> optional = Optional.ofNullable(str);

		// If value is present [NotNull]-
//		System.out.println(optional.isPresent()); // --> true
//		System.out.println(optional.get()); // --> Java is language
//		System.out.println(optional.orElse("This is an empty object")); // --> Java is language

		// If value is not present [null] -
//		System.out.println(optional.isPresent()); // --> false
//		System.out.println(optional.get()); // --> java.util.NoSuchElementException

		// If value is [null] then we can't able to provide value by [orElse]
//		System.out.println(optional.orElse("This is an empty object")); // for excution this you have to be
		// comment out optional.get() --> so,
		// it will not throw no such element exception

		// -------------=============++++++++++++++--------------+++++++++++++================//

//		Example 2 - 

		Optional<String> nameOptional = getName();

		// Client can able to perform operations on this like -->
		System.out.println(nameOptional.isPresent());
		System.out.println(nameOptional.get());
		System.out.println(nameOptional.orElse("This is null object"));

	}
}
