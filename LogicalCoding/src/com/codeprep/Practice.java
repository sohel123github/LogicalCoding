package com.codeprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {
		
		//1. reverse string - 
		
//			String name = "mam";
//			int l = name.length();
//			String rev = "";
//			for(int i=l-1; i>=0; i--) {
//				rev = rev + name.charAt(i);
//			}
//			System.out.println(rev);
//			if(name.equals(rev)) {
//				System.out.println("Palindrome String");
//			}else {
//				System.out.println("Not Palindrome String");
//			}
		
		//2. Palindrome no
		
//			int no = 121;
//			int temp = no;
//			int rev = 0, rem;
//			while(temp != 0) {
//				rem = temp % 10;
//				rev = rev * 10 + rem;
//				temp = temp / 10;
//			}
//			System.out.println(rev);
//			if(no == rev) {
//				System.out.println("Palindrome No");
//			}else {
//				System.out.println("Not Palindrome No");
//			}
		
//		--> By using Scanner class - 
		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter no here - ");
//			int no = sc.nextInt();
//			int temp = no;
//			int rev = 0, rem;
//			while(temp != 0) {
//				rem = temp % 10;
//				rev = rev * 10 + rem;
//				temp = temp / 10;
//			}
//			System.out.println(rev);
//			if(no == rev) {
//				System.out.println(no+" Palindrome No");
//			}else {
//				System.out.println(no+" Not Palindrome No");
//			}
		
		//3. Unary operator - 
		
//			int x = 10;
//			System.out.println(x++);	//10
//			System.out.println(++x);	//12
//			System.out.println(x--);	//12
//			System.out.println(--x);	//10
		
		//4. Percentage program - 
		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter sub1 marks here - ");
//			int sub1 = sc.nextInt();
//			System.out.println("Enter sub2 marks here - ");
//			int sub2 = sc.nextInt();
//			System.out.println("Enter sub3 marks here - ");
//			int sub3 = sc.nextInt();
//			System.out.println("Enter sub4 marks here - ");
//			int sub4 = sc.nextInt();
//			System.out.println("Enter sub5 marks here - ");
//			int sub5 = sc.nextInt();
//			
//			int sum = sub1 + sub2 + sub3 + sub4 + sub5;
//			double total = 500.00;
//			
//			double percentage = ((sum/500.00) * 100);
//			
//			System.out.println("Percentage is --> "+percentage);
			
		//5. check character is alphabet, digit or special character - 
		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter char here - ");
//			char c = sc.next().charAt(0);
//			
//			if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
//				System.out.println(c+" is Alphabet");
//			}else if (c>='0' && c<= 9) {
//				System.out.println(c+" is Digit");
//			}else {
//				System.out.println(c+" is Special character");
//			}
		
		//6. chack two string anagram or not - 
		
		//7. Use date date type - 
		
//			LocalDate currentDate = LocalDate.now();
//			System.out.println("Current Date --> "+currentDate);
//			
//			LocalDate customDate = LocalDate.of(2024, 10, 20);
//			System.out.println("Custom Date is --> "+customDate);
//			
//			LocalDate futureDate = customDate.plusDays(5);
//			System.out.println("Future Date is --> "+futureDate);
			
		//8. Swap two no -
		
//			int a = 10;
//			int b = 20;
//			int t;
//			System.out.println("Before Swapping - ");
//			System.out.println("a "+a);
//			System.out.println("b "+b);
//			
//			t=a;
//			a=b;
//			b=t;
//			
//			System.out.println("After Swapping");
//			System.out.println("a "+a); 
//			System.out.println("b "+b); 
			
		//9. Swap two numbers without using third variable - 
		
//			int a = 100;
//			int b = 200;
//			
//			System.out.println("Before Swapping");
//			System.out.println("a "+a);
//			System.out.println("b "+b);
//			
//			a = a+b;
//			b = a-b;
//			a = a-b;
//			
//			System.out.println("After Swapping");
//			System.out.println("a "+a);
//			System.out.println("b "+b);
		
		//10. Find maximum & minimum value in an array ?
		
//			int[] a = {4,3,1,2,10};
//			
//			int max = a[0];
//			for(int i=1; i<a.length; i++) {
//				if(a[i] > max) {
//					max = a[i];
//					System.out.println("Maximum value is --> "+max);
//				}
//			}
		
//			int[] a = {9,10,21,35,40,5};
//			
//			int min = a[0];
//			for(int i=1; i<a.length; i++) {
//				if(a[i] < min) {
//					min = a[i];
//					System.out.println("Minimum value is --> "+min);
//				}
//			}
		
		//11. Find second largest & smallest value in an array - 
		
//			int[] a = {4,2,9,4,5,6,7};
//			int temp;
//			for(int i=0; i<a.length; i++) {
//				for(int j=i+1; j<a.length; j++) {
//					if(a[i] < a[j]) {
//						temp = a[i];
//						a[i] = a[j];
//						a[j] = temp;
//					}
//				}
//			}
			//for printing list in java following are the ways - 
			//1st way - 
//			for(int i=0; i<a.length; i++) {
//				System.out.print(a[i]+" ");
//			}
			
			//2nd way - 
//			for(int i:a) {
//				System.out.print(i+" ");
//			}
//			
//			System.out.println("Second largest value in an array is --> "+a[1]);
			
		//12. Find second smallest value in an array ?
		
//			int[] a = {2,6,8,4,9,25,1,6,3};
//			int temp;
//			for(int i=0; i<a.length; i++) {
//				for(int j=i+1; j<a.length; j++) {
//					if(a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//					}
//				}
//			}
			//Print value in an array - 
			//--> 1st way -
//			for(int i=0; i<a.length; i++) {
//				System.out.print(a[i]+" ");
//				}
			
			//2nd way - 
//			for(int i:a) {
//				System.out.print(i+" ");
//			}
			
//			System.out.println("Second smallest value in an array is --> "+a[1]);
			
		//13. Find kth largest and smallest value in an array - 
		
//			int[] a = {4,2,6,8,9,14,27};
//			int temp;
//			int k = 3;
//			for(int i=0; i<a.length; i++) {
//				for(int j=i+1; j<a.length; j++) {
//					if(a[i] < a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//					}
//				}
//				if(i == k) {
//					System.out.println("Kth largest value in an array is --> "+a[i]);
//				}
//			}
//			for(int i:a) {
//				System.out.print(i+" ");
//			}

//			int[] a = {6,8,9,7,1,21,33};
//			int k = 3;
//			int temp;
//			for(int i=0; i<a.length; i++) {
//				for(int j=i+1; j<a.length; j++) {
//					if(a[i] > a[j]) {
//						temp = a[i];
//						a[i] = a[j];
//						a[j] = temp;
//					}
//				}
//				if(i == k) {
//					System.out.println("Kth smallest value in an array is --> "+a[i]);
//				}
//			}
//			//Print array
//			for(int i:a) {
//				System.out.print(i+" ");
//			}
			
			//14. Find duplicate element in an array - 
		
//			int[] a = {4,3,6,9,7,10,6,7};
//			
//			Set<Integer> s = new HashSet<>();
//			System.out.print("Diplicate no in an array is --> ");
//			for(int no:a) {
//				if(s.add(no) == false) {
//					System.out.print(no+" ");
//				}
//			}
			
			//15. Find first duplicate element in an array ?
		
//			int[] a = {2,9,6,4,3,12,22,4,31,7};
//			
//			int temp = -1;
//			HashSet<Integer> hs = new HashSet<>();
//		
//			for(int i=a.length-1; i>=0; i--) {
//				if(hs.contains(a[i])) {
//					temp = a[i];
//				}else {
//					hs.add(a[i]);
//				}
//			}
//			if(temp != -1) {
//				System.out.println("First Duplicate element in an array is --> "+temp);
//			}else {
//				System.out.println("No duplicate element found..");
//			}
		
//			16. Find element that appears once in an array - 
		
//			int[] a = {5,6,2,3,5,2,6};
//			
//			int res = a[0];
//			for(int i=1; i<a.length; i++) {
//				res = res ^ a[i];
//			}
//			System.out.println("element that appears once in an array --> "+res);
		
			//17.Bubble sort java program - 
		
//			int[] a = {4,2,6,8,1,2,9,7,3};
//			
//			int temp;
//			System.out.println(Arrays.toString(a));
//			
//			for(int i=0; i<a.length; i++) {
//				for(int j=0; j<a.length-1; j++) {
//					if(a[j] > a[j+1]) {
//						temp = a[j];
//						a[j] = a[j+1];
//						a[j+1] = temp;
//					}
//				}
//			}
//			for(int i=0; i<a.length; i++) {
//				System.out.print(a[i]+" ");
//			}

		 	//18. Count no of digit in an no - 
		
//			int no = 123456;
//			int count = 0;
//			while(no > 0) {
//				no = no / 10;
//				count++;
//			}
//			System.out.println("Number of digit in an number is  --> "+count);

			//19. Count even and odd no in an array ? 
		
//			int no = 123456;
//			int even_count = 0;
//			int odd_count = 0;
//			int rem;
//			while(no > 0) {
//				rem = no % 10;
//				if(rem % 2 == 0) {
//					even_count++;
//				}else {
//					odd_count++;
//				}
//				no = no /10;
//			}
//			System.out.println("Number of even count is --> "+even_count);
//			System.out.println("Number of odd count is --> "+odd_count);
		
//			20. Sum of digit in an number -
		
//			int no = 1234;
//			int sum = 0;
//			while(no > 0) {
//				sum = sum + no % 10;
//				no = no / 10;
//			}
//			System.out.println("Sum of an digit in an number is --> "+sum);
		
			//21.Largest among three - 
		
//			int x = 200;
//			int y = 100;
//			int z = 300;
//			
//			if(x>y && x>z) {
//				System.out.println("X is greater");
//			}else if(y > z) {
//				System.out.println("Y is greater");
//			}else {
//				System.out.println("Z is greater");
//			}
		
			//22. Generate fibonacci series - 
		
//			int n1 = 0, n2 = 1, sum = 0;
//			System.out.print(n1+" "+n2);
//			for(int i=2; i<10; i++) {
//				sum = n1 + n2;
//				System.out.print(" "+sum);
//				n1 = n2;
//				n2 = sum;
//			}
		
			//23. Prime no or not -
		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter any no - ");
//			int num = sc.nextInt();
//			int count = 0;
//			if(num > 1) {
//				for(int i=1; i<=num; i++) {
//					if(num%i == 0)
//						count++;
//				}
//				if(count == 2) {
//					System.out.println(num+" Prime no");
//				}else {
//					System.out.println(num+" Not Prime no");
//				}
//			}else {
//				System.out.println(num+" Not Prime no");
//			}
		
			//24. generate random no & String - 
//			[RAndom class, math class, Appache commons-lang Api]
//			1.RAndom class - 
		//	Random ran = new Random();
		/*	int ran_no = ran.nextInt(10);
			System.out.println(ran_no);*/
			
		/*	Double ran_double = ran.nextDouble();
			System.out.println(ran_double);*/
			
//			2. math class - 
		//	System.out.println(Math.random());
			
//			3. Appache commonsLang - Api - 
			
		/*	String ran_string = RandomStringUtils.randomNumeric(6);
			System.out.println(ran_string);*/
			
		/*	String randstring = RandomStringUtils.randomAlphabetic(10);
			System.out.println(randstring);*/
			
			//25. Generate factorial of a number - 
		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter num which you want - ");
//			int num = sc.nextInt();
//			int factorial = 1;
//			for(int i=1; i<=num; i++) {
//				factorial = factorial * i;
//			}
//			System.out.println("Factorial of "+num+" is "+factorial);
			
//			26. Sum of array - ?
		
//				int[] a = {1,2,3,4};
//				
//				int sum = 0;
//				for(int i=0; i<a.length; i++) {
//					sum = sum + a[i];
//				}
//				System.out.println("Sum of Array is --> "+sum);
		
//			27. Print even and odd number in an array - 
		
//				int[] a = {1,2,3,4};
//				System.out.print("Even no in an array is --> ");
//				for(int i=0; i<a.length; i++) {
//					if(a[i] % 2 == 0) {
//						System.out.print(" "+a[i]);
//					}
//				}
//				System.out.println();
//				System.out.print("odd no in an array is --> ");
//				for(int i=0; i<a.length; i++) {
//					if(a[i] % 2 != 0) {
//						System.out.print(" "+a[i]);
//					}
//				}

			//28. Print even and odd no in an array ?
		
//				int[] a = {1,2,3,4};
//				System.out.print("Even no in an array is --> ");
//				for(int i:a) {
//					if(i%2 == 0) 
//						System.out.print(" "+i);
//				}
//				System.out.println();
//				System.out.print("Odd no in an array is --> ");
//				for(int i:a) {
//					if(i%2 != 0) {
//						System.out.print(" "+i);
//					}
//				}
		
			//29.Check two array are equal or not - 
		
//			int[] a1 = {1,2,3,4};
//			int[] a2 = {1,2,3,4};
//			
//			boolean status = Arrays.equals(a1, a2);
//			
//			if(status == true) {
//				System.out.println("Array are equal");
//			}else {
//				System.out.println("Array are not equal");
//			}
		
			//30. Missing no in an array ?
		
//			int[] a = {1,2,4,5};
//			int sum1 = 0;
//			for(int i=0; i<a.length; i++) {
//				sum1 = sum1 + a[i];
//			}
//			System.out.println("Sum of array is --> "+sum1);
//			
//			int sum2 = 0;
//			for(int i=1; i<=5; i++) {
//				sum2 = sum2 + i;
//			}
//			System.out.println("Sum of range is --> "+sum2);
//			
//			System.out.println("Missing no. in an array is --> "+(sum2 - sum1));
			
			//31. Linear Search - 
		
//			int[] a = {10,20,40,50,30};
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter no. which you want to search - ");
//			int search_ele = sc.nextInt();
//			boolean flag = false;
//			
//			for(int i=0; i<a.length; i++) {
//				if(search_ele == a[i]) {
//					System.out.println("element found at "+i);
//					flag = true;
//					break;
//				}
//			}
//			if(flag == false) {
//				System.out.println("Element not found!");
//			}
		
			//32. How to remove junk or special character in an array - 
		
//			String s = "!@#$^%*& Latin String 0123456789";
//			s = s.replaceAll("[^a-zA-Z0-9]", "");
//			System.out.println(s);
		
			//33.How to remove white space in an string ?
		
//			String s = "Sohel    Patvekar     Java    Software    Engineer";
//			System.out.println("Before removing white spaces "+s);
//			s = s.replaceAll("\\s", "");
//			System.out.println("After removing white spaces "+s);
			
			//34.Count occurance of character in an String - 
		
//			String s = "Java Programing Language";
//			int total_Length = s.length();
//			int total_length_after_remove = s.replaceAll("a", "").length();
//			int count = total_Length - total_length_after_remove;
//			System.out.println("Count occurance of character in an string is --> "+count);
		
			//35.How to count words in a string ?
			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter String here - ");
//			String s = sc.nextLine();
//			int count = 1;
//			for(int i=0; i<s.length(); i++) {
//				if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
//					count++;
//				}
//			}
//			System.out.println("Count of words in an string are --> "+count);
		
			//36. Final, finally & finalise - 
		
//			Final --> It's a keyword used for variable, class & method - 
//			--> 1. Final variable - when you declared a variable as final then it is immutable you cannot chaange it..
//		    --> 2. Final class - When you declared a class as final then it is non-inheritable you cannot extend that class..
//			--> 3. Final method - when you declared a method as final then you cannot override that method..
//			Finally --> It is used with try & catch block to print cleanup code whether exception occour or not..
//			Finalise --> It is a method invoked by garbage collector before object is being garbage collected..
			
			//37. write logic for armstrong number or not ? 
		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter number here - ");
//			int num = sc.nextInt();
//			int cube = 0;
//			int t = num;
//			int r;
//			
//			while(num > 0) {
//				r = num % 10;
//				num = num / 10;
//				cube = cube + (r*r*r);
//			}
//			System.out.println("Cube - "+cube);
//			if(t == cube) {
//				System.out.println("This is armstrong number..");
//			}else {
//				System.out.println("This is not armstrong number..");
//			}
		
			//38. can we override static method in java ?
		
//			You cannot override static method in java because; static method belongs to class 
//			itself and cannot associated with individual class.. That why we cannot override static
//			method like instance method..
		
			//39. write Java program to count number duplicate word in given string -

//			String input = "java is java best language is java";
//			String[] words = input.split(" ");
//			
//			Map<String, Integer> wordcount = new HashMap<>();
//			
//			for(String word:words) {
//				if(wordcount.containsKey(word)) {
//					wordcount.put(word, wordcount.get(word)+1);
//				}else {
//					wordcount.put(word, 1);
//				}
//			}
//		
//			for(String word:wordcount.keySet()) {
//				if(wordcount.get(word) > 1) {
//					System.out.println(word+" : "+wordcount.get(word));
//				}
//			}
				
			//40. Print 1 to 100 without using any number in your code ?
		
//			int one = 'A'/'A';
//			String s1 = "..........";
//			
//			for(int i=one; i<=(s1.length() * s1.length()); i++) {
//				System.out.println(i);
//			}
		
			//41. Print Hello World without using Semicolon (;) - 
		
////			1. By using printf - 
//			if(System.out.printf("Hello World"+"\n")==null) {
//				
//			}
//		
////			2. By using append - 
//			if(System.out.append("Hello World"+"\n")==null) {
//				
//			}
//		
////			3. By using append - 
//			if(System.out.append("Hello World"+"\n").equals(null)) {
//				
//			}
//		
////			4. By using forloop - 
//			for(int i=0; i<1; System.out.println("Hello world")) {
//				i++;
//			}
		
//			42. Compare two Integer number integer caching in java - 
		
//			Integer num1 = 100;
//			Integer num2 = 100;
//			
//			if(num1 == num2) {
//				System.out.println("Both are equal");
//			}else {
//				System.out.println("Both are not equal");
//			}
			
			//--> Here; in this case both are equal because; it is in range..
		
//			Integer num1 = 180;
//			Integer num2 = 180;
//		
//			if(num1 == num2) {
//				System.out.println("Both are equal");
//			}else {
//				System.out.println("Both are not equal");
//			}
		
			//--> Here; in this case both are not equal because; it is not in range..
		
//			43. print 1 to 10 number with loop - 
		
//			for(int i=1; i<=10; i++) {
//				System.out.println(i);
//			}
		
//			44. Print your name 1000 times without using any loop in java ?
		
//			String name = "Sohel";
//			String s = "i";
//			
//			s = s.replaceAll("i", "iiiiiiiiii");
//			s = s.replaceAll("i", "iiiiiiiiii");
//			s = s.replaceAll("i", "iiiiiiiiii");
//		
//			s = s.replaceAll("i", name + "\n");
//			System.out.println(s);
		
//			45. Leap year or not - 
		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter any year - ");
//			int year = sc.nextInt();
//			if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
//				System.out.println("Leap Year");
//			}else {
//				System.out.println("Not Leap Year");
//			}
		
//			46. Java Streams - Print sum of all numbers - 
		
//			List<Integer> list = Arrays.asList(1,2,3,4);
//			
//			Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
//			
//			System.out.println("Sum of all numbers --> "+sum.get());
			
//			47. Java Streams - Average of all numbers ?
		
//			List<Integer> list = Arrays.asList(1,2,3,4,5);
//			double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
//			System.out.println("Average is --> "+avg);
			
//			48. java streams - Square, filter and average of numbers ?
		
//			List<Integer> list = Arrays.asList(1,10,20,30,15);
//			
//			double avg = list.stream()
//					.map(e -> e*e)
//						.filter(e -> e>100)	
//							.mapToInt(e -> e)	
//								.average()	
//									.getAsDouble();
//		
//			System.out.println("Average --> "+avg);
		
//		 	49. java streams - Print even and odd number in an array ?
		
//			List<Integer> list = Arrays.asList(1,2,3,4);
			
//			List<Integer> evenNum = list
//										.stream()
//											.filter(e -> e%2 == 0)
//												.collect(Collectors.toList());
//											
//			System.out.println("Even number --> "+evenNum);
		
//			List<Integer> oddNum = list.stream()
//					.filter(e -> e%2 != 0)
//						.collect(Collectors.toList());
//		
//			System.out.println("Odd Number --> "+oddNum);
		
//			50. java streams - Print Num start with 2 ?
		
//			List<Integer> list = Arrays.asList(2,289,23,241,222,22,20);
//			List<Integer> startwithtwo = list.stream()
//											 	.map(e -> String.valueOf(e))
//											 	 	.filter(e -> e.startsWith("2"))
//											 	 	 	.map(Integer::valueOf)
//											 	 	 		.collect(Collectors.toList());
//			System.out.println(startwithtwo);
		
//			51. Java streams - Find duplicate element in an list ?
		
//			List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,2,4,6);
//			Set<Integer> dup = list.stream()
//										.filter(e -> Collections.frequency(list, e) > 1)
//											.collect(Collectors.toSet());
//			System.out.println("Duplicate element are --> "+dup);
		
//			52. java streams - Find min & max value in an array using stream API - 
		
//			List<Integer> list = Arrays.asList(1,2,3,4,5,67,8,9);
//			int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
//			System.out.println("Maximum value --> "+max);
			
//			int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
//			System.out.println("Minimum value --> "+min);
		
//			53. java stream - Sort list in [Asc/Des] using stream API - 
		
//			List<Integer> list = Arrays.asList(63,100,3,78,14,50,9);
			
			//Different ways of printing list - 
			
	//		1. By using iterator - 
			
	//		Iterator itr = list.iterator();
	//		while(itr.hasNext()) {
	//			itr.next();
	//		}
			
	//		2.By using listIterator - 
			
	//		ListIterator listitr = list.listIterator();
	//		while(listitr.hasNext()) {
	//			System.out.print(" "+listitr.next());
	//		}
			
	//		3.By using For each loop - 
			
	//		for(int i:list) {
	//			System.out.print(i+" ");
	//		}
			
	//		4.By using Java Stream for each loop - 
			
	//		list.forEach(e -> System.out.print(e+" "));
			
			//Ascending order -
		/*	List<Integer> sortedList = list.stream()
												.sorted()
													.collect(Collectors.toList());
			System.out.println("Sorted list is --> "+sortedList);*/
			
			//Decending order - 
//			List<Integer> sortedDesc = list.stream()
//												.sorted(Collections.reverseOrder())
//													.collect(Collectors.toList());
//			System.out.println("\n"+"Sorted list in decending order --> "+sortedDesc);
			
//			54. Get & ignore first 5 numbers using limit and skip method in stream [glis] - 
				
				//List -
//				List<Integer> list = Arrays.asList(1,6,8,4,3,18,12,79,34);
				
				//Get [limit] -
//				List<Integer> getlist = list.stream().limit(3).collect(Collectors.toList());
//				getlist.forEach(e -> System.out.print(e+" "));
				
				//ignore [skip] - 
//				List<Integer> ignorelist = list.stream().skip(3).collect(Collectors.toList());
//				ignorelist.forEach(e -> System.out.print(e+" "));
				
				//Get first 3 numbers sum - 
//				int sum = list.stream().limit(3).reduce((a,b) -> a + b).get();
//				System.out.println("Sum is --> "+sum);
		
				//Get sum ignoring first 3 numbers in streams - 
//				int sum2 = list.stream().skip(3).reduce((a, b) -> a+b).get();		
//				System.out.println("Sum of ignoring first 3 no. is --> "+sum2);
		
//			55. Find second highest and lowest in an list ?
		
//				List<Integer> list = Arrays.asList(6,21,14,36,44,68,54,99,74,85);
				
				//Second highest element - 
				
//				int secH = list.stream()
//										.sorted(Collections.reverseOrder())
//												.distinct()
//													.limit(2)
//														.skip(1)
//															.findFirst()
//																.get();
//				System.out.println("Second highest numbers is --> "+secH);
		
				//Second lowest element - 
				
//				int secL = list.stream()
//									.sorted()
//										.distinct()
//											.limit(2)
//												.skip(1)
//													.findFirst()
//														.get();
//				System.out.println("Second lowest element is --> "+secL);
				
//			56.	Array manipulation in java - 
		
//				String[] input = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
//				String[] output = new String[input.length];
//				
//				for(int i=0; i<input.length; i++) {
//					output[i] = input[i].substring(0,3);
//				}
//		
//				for(String day:output) {
//					System.out.print(day+" ");
//				}
		
//		57. Array manipulation in java - 
		
//		String[] input = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday" ,"Friday", "Saturday"};
//
//		String[] output = new String[input.length];
//		
//		for(int i=0; i<input.length; i++) {
//			output[i] = input[i].substring(0, 3);
//		}
//		
//		for(String day:output) {
//			System.out.print(day+" ");
//		}
		
//		58. Convert ArrayList to string array - 
		
//			ArrayList<String> al = new ArrayList<>();
//			
//			al.add("Hello");
//			al.add("hi");
//			al.add("How are you");
//			
//			String[] arr = new String[al.size()];
//			
//			for(int i=0; i<al.size(); i++) {
//				arr[i] = al.get(i);
//			}
//		
//			for(String j:arr) {
//				System.out.println(j);
//			}
		
//		59. Copy elements of one array to another array - 
		
//			int[] arr1 = {1,2,3,4,5};
//			
//			int[] arr2 = new int[arr1.length];
//			
//			for(int i=0; i<arr1.length; i++) {
//				arr2[i] = arr1[i];
//			}
			
			//Print by meth 1 -
			
//			for(int p:arr2) {
//				System.out.print(p+" ");
//			}
			
			//Print by meth 2 - 
			
//			for(int i=0; i<arr2.length; i++) {
//				System.out.print(arr2[i]+" ");
//			}
			
//		60. Convert String array to string - 
		
//			String[] st = {"S","O","H","E","L"};
//			
//			//1st way - 
//			
//			String join = String.join("", st);
//			
//			System.out.println(join);
//			
//			//2nd way - 
//			
//			String join1 = String.join("|", st);
//			
//			System.out.println(join1);
//			
//			//3rd way - 
//			String join2 = String .join(":", st);
//			System.out.println(join2);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
				
				
				
				
				
		
	}
}
