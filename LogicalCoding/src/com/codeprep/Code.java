package com.codeprep;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.lang3.RandomStringUtils;
public class Code {
	public static void main(String[] args) {
		
//		1. (Reverse string + Palindrome or not)	
	/*		String name="sohel";
			int l=name.length();
			String rev="";
			for(int i=l-1; i>=0; i--) {
				rev=rev+name.charAt(i);
			}
			System.out.println(rev);
			if(name.equals(rev)) {
				System.out.println("Palindrome Sring");
			}else {
				System.out.println("Not a Palindrome Sring");
			}	*/
	//  2. (Palindrome number or not)
			
		/*	int no = 121;
			int temp = no;
			int rev = 0, rem;
			while(temp != 0) {
				rem = temp % 10;		//1,  2,  1,
				rev = rev * 10 + rem;   //1,  12, 121,
				temp=temp/10;           //12, 1,  0.1
				}
			if(no==rev) {
				System.out.println(no+ " Palindrome No");
			}else {
				System.out.println(no+ " Not a Palindrome No");
			}	
			*/
			
//			(Palindrome number or not) + (Scanner class)
			
		/*	Scanner sc=new Scanner(System.in);
			System.out.println("Enter any no");
			int no = sc.nextInt();
			int temp =no;
			int rev = 0, rem;
			while(temp != 0) {
				rem = temp % 10;		//1,  2,  1,
				rev = rev * 10 + rem;   //1,  12, 121,
				temp=temp/10;           //12, 1,  0.1
				}
			if(no==rev) {
				System.out.println(no+ " Palindrome No");
			}else {
				System.out.println(no+ " Not a Palindrome No");
			}	*/
			
			
//		3. Ternary operator
		/*	
		  int x = 10;
		  int y = 20;
		  System.out.println((x>y)? "X is greater":"Y is greater");*/
			
//		4. unary operator 
			/*
			int x=10;
			System.out.println(x++);		//10
			System.out.println(++x);		//12
			System.out.println(x--);		//12
			System.out.println(--x);		//10
			*/
			
//		5. Shift operator 
			
//			(Right shift)
			/*int x=20;
			System.out.println(x>>2);*/
			
//			x=20 --> 20/4 = --> 5
			
			
//			Left Shift
			/*int x=20;
			System.out.println(x<<2);*/
			
//			x=20 --> 20*4 = --> 80
			
//		6.	Calculate percentage of 5 subjects
		/*	int sub1=50;
			int sub2=60;
			int sub3=70;
			int sub4=80;
			int sub5=90;
			int sum= sub1+sub2+sub3+sub4+sub5;
			double total=500.00;
			
			double percentage = (sum/total)*100;
			System.out.println(percentage);*/
			
		//	(Calculate percentage of 5 subjects) + (Scanner class)
		/*	Scanner sc=new Scanner(System.in);
			System.out.println("Enter marks of sub 1");
			int sub1=sc.nextInt();
			System.out.println("Enter marks of sub 2");
			int sub2=sc.nextInt();
			System.out.println("Enter marks of sub 3");
			int sub3=sc.nextInt();
			System.out.println("Enter marks of sub 4");
			int sub4=sc.nextInt();
			System.out.println("Enter marks of sub 5");
			int sub5=sc.nextInt();
			int sum= sub1+sub2+sub3+sub4+sub5;
			double total=500.00;
			
			double percentage = (sum/total)*100;
			System.out.println("Percnatge is "+percentage);*/
			
//		7.  (Check character is alphabet, digit & special character) + (Scanner class) -
		/*	Scanner sc=new Scanner(System.in);
			System.out.println("Enter Character-");
			char c = sc.next().charAt(0);
			
			if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
				System.out.println(c+" is Alphabet");
			}else if(c>='0' && c<='9') {
				System.out.println(c+" is Digit");
			}else {
				System.out.println(c+" is special Character");
			}	*/	
			
			
			
//		8.  check two strings are anagram or not-
			
			
			
//		9.	How to use date data type in java-
//			[ccf - nop]
			/*
			 // Creating a LocalDate object for the current date
	        LocalDate currentDate = LocalDate.now();
	        System.out.println("Current Date: " + currentDate);

	        // Creating a specific date
	        LocalDate customDate = LocalDate.of(2023, 10, 5);
	        System.out.println("Custom Date: " + customDate);

	        // Manipulating dates
	        LocalDate futureDate = customDate.plusDays(7);
	        System.out.println("Future Date: " + futureDate);
			*/
			
		
//		10. Array logical program-
			
		/*	ArrayList al =new ArrayList();
			al.add("aaa");
			al.add("bbb");
			al.add("ccc");
			System.out.println(al);
			
			ArrayList al1 = new ArrayList();
			al1.add("bbb");
			al1.add("ccc");
			al1.add("eee");
			System.out.println(al1);
			
			al.removeAll(al1);
			al1.removeAll(al);
			System.out.println(al);
			System.out.println(al1);	*/

//		11.	Swap Two Numbers-
//			(By using third variable-)
			
	/*	int a = 10;
		int b = 20;
		int t;
		System.out.println("Before Swapping");
		System.out.println("a "+a);
		System.out.println("b "+b);
		
		t=a;
		a=b;
		b=t;
		
		System.out.println("After Swapping");
		System.out.println("a "+a);
		System.out.println("b "+b);		*/
		
		
//			(Without using third variable-)
		
	/*	int a = 100;
		int b = 200;
		
		System.out.println("Before swapping");
		System.out.println("a "+a);
		System.out.println("b "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping");
		System.out.println("a "+a);
		System.out.println("b "+b);	*/
			
//		12. find maximum and minimum value in array-
//			Maximum Value-(Note*-->Here after oth index don't take greater value more than one)
		/*	int[] a = {4,1,3,2,9};
			
			int max = a[0];
			for(int i = 1; i<a.length; i++) {
				if(a[i] > max) {
					max = a[i];
					System.out.println("Maximum value- "+max);
				}
			}	*/
		
//			Minimum Value-
		/*	int[] a = {9,14,23,16,2};
			int min  = a[0];
			
			for(int i = 1; i<a.length; i++) {
				if(a[i] < min) {
					min = a[i];
					System.out.println("Minimum Value is "+min);
				}
			}	*/	
		
//		13.	Find second largest value in array-
		
		/*	int[] a= {6,8,2,4,3,1,5,7,9};
			int temp;
			for(int i=0; i<a.length; i++) {
				for(int j=i+1; j<a.length; j++) {
					if(a[i] < a[j]) {		//Now list sort in decending order
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			
			System.out.println("Second largest element is- "+a[1]); */	
		
//		14.	Find second smallest value in array-
		
	/*	int[] a = {6,8,19,3,10,12,4};
		int temp;
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i] > a[j]) {	//Now list sort in assending order
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Second smallest element- "+a[1]); */
		
//		15. Find kth largest and smallest element in an array-
		
//			(kth largest element in array)-
		/*	int[] a= {9,8,15,10,2,61};
			int k = 4;
			for(int i=0; i<a.length; i++) {
				for(int j=i+1; j<a.length; j++) {
					if(a[i] < a[j]) {	//Now list sort in decending order
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
				if(i == k) {
					System.out.println(a[i]);
				}
			}	*/
			
//			(kth smallest element in array)-
		/*	int[] a= {8,9,15,6,10,99,13,17};
			int k = 6;
			
			for(int i=0; i<a.length; i++) {
				for(int j=i+1; j<a.length; j++) {
					if(a[i] > a[j]) {	//Now list sort in assending order
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
				if(i == k) {
					System.out.println("Kth smallest element is-"+a[i]);
				}
			}	*/
		
//		16.	Find Duplicate element in an array-
//			i]  Brute Force Method-
//			ii] Set Interface method- (Best Method)
		/*	int[] a= {8,9,10,61,9,95,51,10,11,8,61};
			
			Set<Integer> s = new HashSet<>();
			
			for(int no:a) {
				if(s.add(no) == false) {
					System.out.print(no+" ");
				}
			}	*/	
		
//			iii]Using HashTable-
			
//		17. Find first duplicate element in an array-
		/*	int[] a = {6,5,3,2,5,1,2,4};
			
			int temp = -1;
			HashSet<Integer> hs = new HashSet<>();
			
			for(int i=a.length-1; i>=0; i--) {
				if(hs.contains(a[i])) {
					temp = a[i];
				}else {
					hs.add(a[i]);
				}
			}
			if(temp != -1) {
				System.out.println("First Duplicate element is- "+temp);
			}else {
				System.out.println("Duplicate element not found");
			}	*/
			
//		18.	Find element that appears once in an array 
//			where every other element appears twice in java
//			[See concept of XOR on Screenshot]
		
		/*	int[] a = {5,3,4,5,2,3,4};		//5^5=0, 3^3=0, 4^4=0, -->2
			int res = a[0];
			for(int i=1; i<a.length; i++) {
				res = res ^ a[i];
			}
			System.out.println("Once appeared element - "+res);	*/
			
//		19. Bubble sort java program for String and Array-
			
		/*	int[] a = {36,19,29,12,5};
			int temp;
			System.out.println("Array Before Sorting- "+Arrays.toString(a));

			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a.length-1; j++) {
					if(a[j] > a[j+1]) {
						temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}
			}
			for(int i=0; i<a.length; i++) {
				System.out.print(a[i]+" ");
			}	*/
			
//		20.	Count Number of Digit in a number-
		/*	int no = 123456;
			int count = 0;
			while(no > 0) {
				no = no/10;
				count++;
			}
			System.out.println("Number of Digit- "+count);	*/
		
//		21.	Count even and odd number-
		/*	int no = 1234;
			int even_count = 0;
			int odd_count = 0;
			while(no > 0) {
				int rem = no % 10;
				if(rem % 2 == 0) {
					even_count++;
				}else {
					odd_count++;
				}
				no = no / 10;
			}
			System.out.println("Number of Even no- "+even_count);
			System.out.println("Number of Even no- "+odd_count);	*/
		
//		22.	Sum of digit in a number-
	/*		int no = 1234;
			int sum = 0;
			while(no > 0) {
				sum = sum + no % 10;
				no = no / 10;
			}
			System.out.println("Sum of digit in a number is- "+sum);	*/
		
//		23. Find largest of 3 Numbers-
	/*	i]	Scanner sc = new Scanner(System.in);
			System.out.println("Enter first no- ");
			int a = sc.nextInt();
			System.out.println("Enter second no- ");
			int b = sc.nextInt();
			System.out.println("Enter third no- ");
			int c = sc.nextInt();
			if(a>b && a>c) {
				System.out.println(a+" is largest no");
			}else if(b>a && b>c) {
				System.out.println(b+" is largest no");
			}else if(c>a && c>b){
				System.out.println(c+" is largest no");
			}	*/
		
	/*	ii]	int x = 20;
			int y = 10;
			System.out.println((x>y)?"X is greater":"Y is greater");	*/
		
//		24. Generate Fibonacci series-
//			[A series of numbers in which each number is the sum of the two 
//			preceding numbers]
//			0 1 1 2 3 5 8 13 21 34
	/*	
			int n1 = 0, n2 = 1, sum = 0;
			System.out.print(n1+" "+n2);
			for(int i=2; i<10; i++) {
				sum = n1 + n2;
				System.out.print(" "+sum);
				n1 = n2;
				n2 = sum;
			}	*/

//		25. Prime No. or not-
//		i]	no. > 1, ii] only two factors 1 & itsself..	
//			suppose; 19 --> 1 & 19 [Prime No.]
//					 28 --> 1,2,4,7,14,28 [Not Prime No.]
	/*		Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your No- ");
			int num = sc.nextInt();  //2
			int count = 0;
			if(num > 1) {
				for(int i=1; i<=num; i++) {
					if(num%i == 0) 
						count++;
				}
				if(count == 2) {
					System.out.println(num+" Prime No");
				}else {
					System.out.println(num+" Not Prime No");
				}
			}else {
				System.out.println("Not Prime No");
			}	*/
			
//		26. How to generate random numbers & strings-
//			Apporoch 1- Random class
//			Apporoch 2- Math class
//			Apporoch 3- Appache Commons-lang APi-

//		i] for generate random no.(Apporoch 1)
			Random ran = new Random();
		/*	int ran_no = ran.nextInt(1000);
			System.out.println(ran_no);	*/
			
		/*	Double ranNo = ran.nextDouble();
			System.out.println(ranNo);  */	
		
//		   for generate random no.(Apporoch 2)
//			System.out.println(Math.random());
			
//		   for generate random no.(Apporoch 3)
		/*	String randNum = RandomStringUtils.randomNumeric(5);
			System.out.println(randNum);	*/
			
//		ii] for generate random string. (Apporoch 3)
		/*	String ranStr = RandomStringUtils.randomAlphabetic(10);
			System.out.println(ranStr);	*/
			
//		27. Generate Factorial of a number-
//			Factorial --> A factorial is a function that multiplies a number 
//			by every numer below it.
//			e.g. --> 5 Factorial is --> 5*4*3*2*1 --> 120
			
		/*	Scanner sc = new Scanner(System.in);
			System.out.println("Enter no. which Factorial you want- ");
			int no = sc.nextInt();
			int factorial = 1;
			for(int i=1; i<=no; i++) {
				factorial = factorial * i;
			}
			System.out.println("Factorial of a "+no+" is "+factorial);	*/
			
//		28. Find sum of Array-
		/*	int[] a = {4,3,2,1};
			
			int sum = 0;
			
			for(int i=0; i<a.length; i++) {
				sum = sum + a[i];
			}
			System.out.println("Sum of array is- "+sum); 	*/
			
//		29. Print Even & odd no. in an Array-
			
		//	int[] a = {1,2,3,4};
			
		/*	System.out.println("Even no. in an Array is-");
			for(int i=0; i<a.length; i++) {
				if(a[i] % 2 == 0) {
					System.out.println(a[i]+" ");
				}
			}
			System.out.println("Odd no, in an Array is-");
			for(int i=0; i<a.length; i++) {
				if(a[i] % 2 != 0) {
					System.out.println(a[i]+" ");
				}
			}	*/
			
//			[By using enhanced loop-] ----> (Enhanced loop = For each loop)
		/*	for(int value:a) {
				if(value%2 == 0)
				System.out.println(value);
			}	*/
			
//		30. Check 2 Arrays are equal or not-
			
		/*	int[] a1 = {1,2,3,4,5};
			int[] a2 = {1,2,3,4,5};
			
			boolean status = Arrays.equals(a1, a2);
			
			if(status==true) {
				System.out.println("Array are Equal");
			}else {
				System.out.println("Array are not Equal");
			}	*/
			
//		31. Misssing No. in an array-
//			--> Array should not have duplicates
//			--> Array no need to be sorted order
//			--> Values should be in range
//			sum1 = 1,2,4,5 --> 12
//			sum2 = 1,2,3,4,5 --> 15
//			Missing no. is --> (sum2 - sum1) --> (15-12) --> (3)
			
		/*	int[] a = {1,2,4,5};
			int sum1 = 0;
			for(int i=0; i<a.length; i++) {
				sum1 = sum1+a[i];
			}
			System.out.println("Sum of array is- "+sum1);
			
			int sum2 = 0;
			for(int i=1; i<=5; i++) {
				sum2 = sum2 + i; 
			}
			System.out.println("Sum of range is- "+sum2);
			
			System.out.println("Missing no is- "+(sum2-sum1));	*/
			
//		32. Searching element in an array-
//			[Linear Search]
			
	/*		int[] a = {10,20,40,50,30};
			
			int search_ele = 50;
			boolean flag = false;
			
			for(int i=0; i<a.length; i++) {
				if(search_ele==a[i]) {
					System.out.println("Element found at "+i);
					flag = true;
					break;
				}
			}
			if(flag==false) {
				System.out.println("Element Not found");
			}	*/
			
//		33. How to remove junk or special characters in an String-
			
		/*	String s = "@#%&*)()&^ Latin String 0123456789";
			s = s.replaceAll("[^a-zA-Z0-9]", "");
			System.out.println(s);	*/
			
//		34. How to remove white spaces in a String-
			
		/*	String str = "Sohel         Patvekar      java     Software      Engineer";
			System.out.println("Before removing white spaces- "+str);
			str = str.replaceAll("\\s", "");
			System.out.println("After removing white spaces- "+str);	*/
			
//		35. Count occurance of character in String-
			
		/*	String s = "Java Programming Java oops";
			
			int totalcount = s.length();
			int totelcount_afterremove = s.replaceAll("P", "").length();
			int count = totalcount - totelcount_afterremove;
			System.out.println("Number occurance of P is- "+count);	*/
			
//		36. How to count words in a string-
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String here-");
			String s = sc.nextLine();
			int count = 1;
			for(int i=0; i<s.length(); i++) {
				if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
					count++;
				}
			}
			System.out.println(count);
 
			
		
		
		
			
			
		
		
		
		
		
			
//			just for practice-

		
		
		
		
		
		
		
			
	}
}
