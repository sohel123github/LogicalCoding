package com.codeprep;

import java.util.Arrays;

public class Code {
	public static void main(String[] args) {
		
		
//		1. (Reverse string + Palindrome or not)	
		/*	String name="sohel";
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
			//System.out.println(rev);
			if(no==rev) {
				System.out.println(no+ " Palindrome No");
			}else {
				System.out.println(no+ " Not a Palindrome No");
			}	*/
			
			
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
			
			
//		3. unary operator [--> here refer Incremental operator seperate package - ]
			/*
			int x=10;
			System.out.println(x++);		//10
			System.out.println(++x);		//12
			System.out.println(x--);		//12
			System.out.println(--x);		//10
			*/
			
//		4. Ternary operator [--> here refer Incremental operator seperate package - ]
			/*	
			  int x = 10;
			  int y = 20;
			  System.out.println((x>y)? "X is greater":"Y is greater");*/
			
//		5. Shift operator 
			
//			(Right shift)
		/*	int x=20;
			System.out.println(x>>2);*/
			
//			x=20 --> 20/4 = --> 5
			
			
//			Left Shift
		/*	int x=20;
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
		
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter Character-");
//			char c = sc.next().charAt(0);
//			
//			if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
//				System.out.println(c+" is Alphabet");
//			}else if(c>='0' && c<='9') {
//				System.out.println(c+" is Digit");
//			}else {
//				System.out.println(c+" is special Character");
//			}		
			
			
			
//		8.  Check two strings are anagram or not -
			//s(l)(lcse)
//			[Note --> this code is available in seperate package]
			
//		9.	How to use date data type in java-
//			[ccf - nop]
			
			 // Creating a LocalDate object for the current date
	  /*    LocalDate currentDate = LocalDate.now();
	        System.out.println("Current Date: " + currentDate);

	        // Creating a specific date
	        LocalDate customDate = LocalDate.of(2023, 10, 5);
	        System.out.println("Custom Date: " + customDate);

	        // Manipulating dates
	        LocalDate futureDate = customDate.plusDays(7);
	        System.out.println("Future Date: " + futureDate);*/
			
			
		
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
			System.out.println(al1);*/	

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
//			Maximum Value-(Note*-->Here after oth index don't take maximum value more than one)
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
		
//		13.	Find second largest value in array -
		
//			[For finding largest & smallest value in an array don't go for bubble sort just use 
//			another sorting double for loop]
		
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
			
			//to print sorted array - [for loop & for each loop]
			
//			for(int i=0; i<a.length; i++) {
//				System.out.print(a[i]+" ");
//			}
			
//			for(int i:a) {
//				System.out.print(i+" ");
//			}
			
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
			int temp;
			for(int i=0; i<a.length; i++) {
				for(int j=i+1; j<a.length; j++) {
					if(a[i] < a[j]) {	//Now list sort in decending order
						temp = a[i];
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
			int temp;
			for(int i=0; i<a.length; i++) {
				for(int j=i+1; j<a.length; j++) {
					if(a[i] > a[j]) {	//Now list sort in assending order
						temp = a[i];
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
			}*/
			
//		18.	Find element that appears once in an array 
//			where every other element appears twice in java
//			[See concept of XOR on Screenshot]
		
		/*	int[] a = {5,3,4,5,2,3,4};		//5^5=0, 3^3=0, 4^4=0, -->2
			int res = a[0];
			for(int i=1; i<a.length; i++) {
				res = res ^ a[i];
			}
			System.out.println("Once appeared element - "+res);	*/
			
//		19. Bubble sort java program for String and Array-(trick --> 0,0,length-1)
			
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
			
			//Array apun aise bhi sort kar saktay..
			
		
//			int[] a = {36,19,29,12,5};
//				System.out.println("Before sorting "+Arrays.toString(a));
//			int temp;
//			for(int i=0; i<a.length; i++) {
//				for(int j=i+1; j<a.length; j++) {
//					if(a[i] > a[j]) {
//						temp = a[i];
//						a[i] = a[j];
//						a[j] = temp;
//					}
//				}
//			}
//			System.out.println("After sorting "+Arrays.toString(a));
			
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
			System.out.println("Number of Odd no- "+odd_count);	*/
		
//		22.	Sum of digit in a number-
	/*		int no = 1234;
			int sum = 0;
			while(no > 0) {
				sum = sum + no % 10;
				no = no / 10;
			}
			System.out.println("Sum of digit in a number is- "+sum);	*/
		
//		23. Find largest of 3 Numbers-
		
		//  1st way - 
		/*	Scanner sc = new Scanner(System.in);
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
		
	    //  2nd way - 
//			[package com.naveen.coding; public class LargestAmongThreeNo]
			
		
//		24. Generate Fibonacci series-
//			[A series of numbers in which each number is the sum of the two 
//			preceding numbers]
//			0 1 1 2 3 5 8 13 21 34
		
//			int n1 = 0, n2 = 1, sum = 0;
//			System.out.print(n1+" "+n2);
//			for(int i=2; i<10; i++) {
//				sum = n1 + n2;
//				System.out.print(" "+sum);
//				n1 = n2;
//				n2 = sum;
//			}	

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

//		i] for generate random no.(Apporoch 1) --> Random class
//			Random ran = new Random();
		/*	int ran_no = ran.nextInt(1000);
			System.out.println(ran_no);	*/
			
		/*	Double ranNo = ran.nextDouble();
			System.out.println(ranNo);  	*/
		
//		   for generate random no.(Apporoch 2) --> Math class
//			System.out.println(Math.random());
			
//		   for generate random no.(Apporoch 3) --> Appache Commons-lang APi-[will have to see later..]
		/*	String randNum = RandomStringUtils.randomNumeric(5);
			System.out.println(randNum);	*/
			
//		ii] for generate random string. (Apporoch 3)
		/*	String ranStr = RandomStringUtils.randomAlphabetic(10);
			System.out.println(ranStr);	*/
			
//		27. Generate Factorial of a number -
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
			System.out.println("Factorial of a "+no+" is "+factorial);*/	
			
//		28. Find sum of Array-
		/*	int[] a = {4,3,2,1};
			
			int sum = 0;
			
			for(int i=0; i<a.length; i++) {
				sum = sum + a[i];
			}
			System.out.println("Sum of array is- "+sum); */	
			
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
			
		/*	Scanner sc = new Scanner(System.in);
			System.out.println("Enter search no. here -->");
			
			int[] a = {10,20,40,50,30};
			
			int search_ele = sc.nextInt();
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
			
			int total_length = s.length();
			int totel_length_afterremove= s.replaceAll("P", "").length();
			int count = total_length - totel_length_afterremove;
			System.out.println("Count occurance of character in String- "+count);	*/
			
//		36. How to count words in a string-
			
		/*	Scanner sc = new Scanner(System.in);
			System.out.println("Enter String here-");
			String s = sc.nextLine();
			int count = 1;
			for(int i=0; i<s.length(); i++) {
				if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) {
					count++;
				}
			}
			System.out.println(count);	*/
 
//		37. final vs finally vs finalize in java -
			
//		i]	final --> it's a keyword used for variable, class, method
//			final variable --> when applied to variable it makes the vaiable immutable
//			final class --> when applied to class it makes the class non-inheritable so 
//							it cannot be extended
//			final method --> when applied to method then you cannot override 
			
//		ii] finally --> it is used with try & catch block to print claenup code weather exception 
//						occur or not
			
//		iii] finalize --> it is a method invoked by garbage collector before object is being 
//							garbage collected
			
//		38. Write logic for armstrong number or not-
//			153 --> 1*1*1 --> 1
//					5*5*5 --> 125
//					3*3*3 --> 27
//		    1 + 125 + 27 = 153 so this is a Armstrong number
//			some other armstrong number are --> 1,2,3,4,5,6,7,8,9,153,370,371,407,1634,8208,9474
//			trick to remember logic --> [ctr - rmc]
			
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter num here-");
//			int num = sc.nextInt();
//			int cube = 0;
//			int t = num;
//			int r;
//			
//			while(num > 0) {
//				r = num % 10;
//				num = num/10;
//				cube = cube + (r*r*r);
//				}
//			if(t==cube) {
//				System.out.println("This is an armstrong number");
//			}else {
//				System.out.println("This is not an armstrong number");
//			}	
			
//		39. Can we override static method or not ?
			
//			No you cannot override a static method in java. Static methods are belongs to class 
//			itself and are not associated with individual instances of class. therefore they cannot
//			be overriden in the sense, like instance method can be overriden.
			
//		40. Java program to count number of duplicate words in given string* -
			
	/*	String input = "java is java best language is java";
		String[] words = input.split(" ");
		
		Map<String, Integer> wordCount = new HashMap<>();
		
		for(String word:words) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			}else {
				wordCount.put(word, 1);
			}
		}
		
		for(String word:wordCount.keySet()) {
			if(wordCount.get(word) > 1) {
				System.out.println(word+" : "+wordCount.get(word));
			}
		}*/
		
			
//		41. How to verify if the string contains only digits* - [Skip these code...]
		
		
//			public static boolean isEmpty(CharSequence cs) {
//				return cs == null || cs.length() == 0;
//			}
//					
//			public static boolean isNumeric(CharSequence cs) {
//				if(isEmpty(cs)) {
//					return false;
//				}
//				
//				int len = cs.length();
//				for(int i=0; i<len; i++) {
//					if(! Character.isDigit(cs.charAt(i))) {
//						return false;
//					}
//				}
//				return true;	
//			}
			
//		42. Print 1 to 100 without using any numbers in your code - 
			
		/*	int one = 'A'/'A';				//1
			String s1 = ".........."; 		//here length is --> 10
			
			for(int i=one; i<=(s1.length() * s1.length()); i++) {
				System.out.println(i);
			}	*/
			
			
//		43. Print "Hello World" without using semi colon (;) in java - 
//		four ways [paaf]--> i]printf==null ii]append==null iii]append.equals(null) iv]for loop(sysout)
			
//			i]Printf
//			if(System.out.printf("Hello World"+"\n")==null) {
//				
//			}
		
//			ii] append==null
//			if(System.out.append("Hello World"+"\n")==null) {
//				
//			}
		
//			iii] append.equals(null)
//			if(System.out.append("Hello World" + "\n").equals(null)) {
//				
//			}
			
//			iv] for loop -
//			for(int i =0; i<1; System.out.println("Hello World")) {
//				i++;
//			}	
			
//		44. Pass null argument with method overloading of string* and object types - 
			
//			[Note --> this code is available in Seperate Class ]
			
//		45. Compare two integer numbers (Integer caching) in java - 
			
		/*	Integer num1 = 100;
			Integer num2 = 100;
			
			if(num1 == num2) {
				System.out.println("Both are equal");
			}else {
				System.out.println("Both are not equal");
			}	*/
			
//			Output --> Both are equal [Because--> it is in integer range (-127 to 128)]
			
		/*	Integer num1 = 190;
			Integer num2 = 190;
			
			if(num1 == num2) {
				System.out.println("Both are equal");
			}else {
				System.out.println("Both are not equal");
			}	*/	
			
//			Output --> Both are not equal [Because--> it is not in integer range (-127 to 128)]
			
//		46. what will be the output when you divide a number by zero ?
			
//			Number = Integer, Double, Float
//			if you divide Integer by 0 it will give output as --> Arithmetic Exception
//			& if you divide integer by 0.0 it will give output as --> Infinity
//			& if you divide float & double by 0 & 0.0 it will give output as --> Infinity
//			& if you divide 0.0 by 0.0 it will give output as --> NaN (Not a Number)

	/*		
//			System.out.println(9/0);
			System.out.println(9.0/0);				//Infinity
			System.out.println(12.33f/0);			//Infinity
			System.out.println(10/0.0);				//Infinity
			System.out.println(19.99999d/0);		//Infinity
//			System.out.println(0/0);				//Arithmetic exception
			System.out.println(0.0/0);				//NaN
			System.out.println(0.0/0.0);			//NaN
			System.out.println(12.33/0.0);			//Infinity	*/
			
//		47. will static block be executed with final variable ?
			
//			[Note --> this code is available in seperate class]
			
//		48. Print 1 to 10 number without loop - public static void printNum{(If block)}	
			
//		[Note --> this code is available in seperate class]
		
//		49. Print 1 to 100 without using loop & recursion* -
			
//			i] Array fill - 
			
			/*Object[] num = new Object[100];
			
			Arrays.fill(num, new Object() {
					int count = 0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
			});
			System.out.println(Arrays.toString(num));*/
			
//			ii] BitSet:
		
		/*	String set = new BitSet() {{set(1,101);}}.toString();
			System.out.append(set, 1, set.length());*/
			
//		50. Print your name 1000 times without using any loop in java - 
		
		/*	String name = "sohel";
			String s = "i";
			
			s = s.replaceAll("i", "iiiiiiiiii");	//1 * 10 --> 10
			s = s.replaceAll("i", "iiiiiiiiii");	//10 * 10 --> 100
			s = s.replaceAll("i", "iiiiiiiiii");	//100 * 10 --> 1000
			
			s = s.replaceAll("i", name + "\n");
			System.out.println(s);	*/
			
//		51. Leap year or not -
		/*
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter year here- ");
			int year = sc.nextInt();
			if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
				System.out.println("Leap year");
			}else {
				System.out.println("Not Leap year");
			}	*/
			
//		52. Java streams - Print sum* of all numbers -
			
		/*	List<Integer> list = Arrays.asList(1,2,3,4);
			
			Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);  //sr
			
			System.out.println("Sum of numbers: "+sum.get());*/
		 
//		53. Java Streams - Print average* of all numbers - 
		
		/*	List<Integer> list = Arrays.asList(1,2,3,4,5);
			
			double avg = list.stream().mapToInt(e -> e).average().getAsDouble();  //smag
			
			System.out.println("Avg is: "+avg);  */
		
//		54. Java Streams - Square, filter & average of numbers - 
		
		/*	List<Integer> list = Arrays.asList(1,10,20,30,15);
			
			double avg = list.stream()
								.map(e -> e*e)
									.filter(e -> e>100)
										.mapToInt(e -> e)
											.average()
												.getAsDouble();		//smfmag
			System.out.println(avg);*/
		
//		54. Java streams - Print even and odd numbers in a list
		
		/*	List<Integer> list = Arrays.asList(1,2,3,4,5,6);
			//Even numbers - 
			List<Integer> evenList = list.stream()
											.filter(e -> e%2 == 0)
												.collect(Collectors.toList());	//sfc
			System.out.println("Even no: "+evenList);
		
			//Odd numbers - 
			List<Integer> oddList = list.stream()
											.filter(e -> e%2 != 0)
												.collect(Collectors.toList());	//sfc
			System.out.println("Odd No: "+oddList);*/

//		55. Java streams - Print No. start with 2
		
		/*	List<Integer> list = Arrays.asList(2, 222, 234, 567, 890,432,236,211,22);
			List<Integer> numwith2 = list.stream()
											.map(e -> String.valueOf(e))
												.filter(e -> e.startsWith("2"))
													.map(Integer::valueOf)
														.collect(Collectors.toList()); //smfmc
			System.out.println(numwith2);*/
			
			
//		56. Java streams - Print duplicate nos. in a list - 
		
		/*	List<Integer> list = Arrays.asList(1,3,10,20,15,1,13,1,2,2,10,30,19,3);
			Set<Integer> dup = list.stream()
									.filter(e -> Collections.frequency(list, e)>1)
									.collect(Collectors.toSet());	//sfc
			System.out.println(dup);*/
		
//		57. Java Streams - Find max & min numbers using Streams - 
			
			//Maximum value ?
		//	List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,40,19,3);
//			int max = list.stream().max(Comparator.comparing(Integer::valueOf)).get(); //smg
//			System.out.println("Maximum value is --> "+max);
			
			//Minimum value ?
//			int min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
//			System.out.println("Minimum value is --> "+min);
		
//		58. Java Streams - Sort numbers [ASC/DESC] using streams - 
			
//			In Ascending order -->
	/*		List<Integer> list = Arrays.asList(0,3,10,20,30,15,1,13,1,2,2,10,40,19,3,40);
			List<Integer> sortedSet = list.stream()
											.sorted()	
												.collect(Collectors.toList());	//ssc
			System.out.println("Sorted list is --> "+sortedSet);	*/
		
//			In Decending order - 
			
		/*	List<Integer> sortedDescSet = list.stream()
												.sorted(Collections.reverseOrder())	
													.collect(Collectors.toList());  //ssc
			System.out.println("Descending sorted set is --> "+sortedDescSet);*/
		
//		59. Get/ignore first 5 numbers using Limit & skip in streams -
//			[Get --> Limit]					//G-L
//			[Ignore --> skip]				//I-S
		
//			[Get --> Limit]					//G-L
		//	List<Integer> list = Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
	/*		List<Integer> l = list.stream().limit(5).collect(Collectors.toList());
			System.out.println(l);*/
		
//			[Ignore --> skip]				//I-S
		
		/*	List<Integer> ls = list.stream().skip(5).collect(Collectors.toList());
			System.out.println(ls);*/
		
//			if i want only first 5 numbers sum then in that what we have to do is -
		
		/*	int sum = list.stream().limit(5).reduce((a, b) ->a+b).get();
			System.out.println(sum);*/
		
//			if i want excepting first 5 numbers sum then in that what we have to do is -

		/*	int sum = list.stream().skip(5).reduce((a, b) -> a+b).get();
			System.out.println(sum);*/
			
//		60. Get second highest/lowest number using streams - 
			
		//	highest number using streams -
		
		//	List<Integer> list = Arrays.asList(0,3,10,20,30,15,1,13,1,2,2,10,40,19,3,40);
//			int secH = list.stream()
//								.sorted(Collections.reverseOrder())
//									.distinct()
//										.limit(2)
//											.skip(1)
//												.findFirst()
//													.get();			//ssdlsfg
//			System.out.println("Second Highest --> "+secH);
		
//			lowest number using streams -
		
//			int secL = list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
//			System.out.println("Second Lowest --> "+secL);
		
//		61. Here refer "[package com.naveen.coding;]" classes for further practice -  
		
//			[AFTER COMPLETING "[package com.naveen.coding;]" ALL classes THEN MOVE FORWARD]
		
//		62. Array Manipulation in java ?
		
	/*		String[] input = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//			output = {"Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
			String[] output = new String[input.length];
			
			for(int i=0; i<input.length; i++) {
				output[i] = input[i].substring(0, 3);
			}
		
			for(String day:output) {
				System.out.print(day+" ");
			}*/
		
//		63. WAP to convert ArrayList to String array - 
		
		/*	ArrayList<String> al = new ArrayList<>();
			
			al.add("Banglore");
			al.add("Pune");
			al.add("Mumbai");
			
			String[] arr = new String[al.size()];
			
			for(int i=0; i<al.size(); i++) {
				arr[i] = al.get(i);
			}
		
			for(String j:arr) {
				System.out.println(j);
			}*/
		
//		64. WAP to copy all elements of one array into another array - 
		
	/*		int[] arr1 = {1, 2, 3};
			
			int[] arr2 = new int[arr1.length];
			
			for(int i=0; i<arr1.length; i++) {
				arr2[i] = arr1[i];
			}
			
			System.out.println("Displaying elements of an array 2 - ");
	 	//  for loop -
			for(int i=0; i<arr2.length; i++) {
				System.out.print(arr2[i]+" ");
			}
			System.out.println("\n");
		//  foreach loop -
			for(int i:arr2) {
				System.out.print(i+" ");
			}*/
		
//		65. WAP to find square root of a number without sqrt method - 
		
			//By using sqrt method -
		
		/*	double sq = Math.sqrt(25);
			System.out.println("Square root of 25 is "+sq);*/
		
			///Without using sqrt method - [nts - tst]
		
		/*	int num = 9;
			double temp ;
			double sr = num/2;	//9/2 --> 4
			
			do {
				temp = sr;	//4, 3
				sr = (temp+(num/temp))/2;	//(4+(9/4)/2 = (4+2)/2 = 3
			}while((temp-sr)!= 0);			//(3+(9/3)/2 = (3+3)/2 = 3
 			
			System.out.println("Square root of a number is "+sr);*/
			
//		66.	Array conversion - [String array to String] 
		
		//	1st way - 
		/*	String[] arr = {"t", "r", "v"};  //--> trv or t;r;v or t|r|v
			String join = String.join("|", arr);
			System.out.println(join);	*/
			
		//  2nd way - 
		/*	String join1 = Arrays.asList("t", "r", "y", "i", "n", "g")
							.stream()
							.collect(Collectors.joining("|"));			//sc
			System.out.println(join1);*/
		
//		67. what will be the output ?
		
		/*	String x = "abc";
			String y = "abc";
			x.concat(y);			//Output --> abc
			x = x.concat(y);		//Output --> abcabc
			System.out.println(x);*/
		
//		68. Method overloading tricky question - 
		
//			[Seperate class for this question --> solution]
		
//		69. Labels in java - 
		
		/*	System.out.println("Hello");
			naveen:  // --> this is nothing but labels...
			System.out.println("OK! Bye");	*/
		
		/*	task:	//	--> this is nothing but labels...
				for(int i=1; i<=10; i++) {
					System.out.println(i);
					if(i == 5) {
						break task;
					}
				}*/
		
		/*	outerLoop:
				for(int i=0; i<5; i++) {
					innerLoop:
						for(int j=0; j<5; j++) {
							if(i != j) {
								System.out.println("If block values "+i);
								break outerLoop;
							}else {
								System.out.println("Else block values "+i);
								break innerLoop;
							}
						}
				}	*/
		
//		70. String joiner interview questions - 
		
			/*
			*Input = Hello How are you
			*Output = [Hello-How-are-you]
			*/
		//	1st way -
		
		/*	String input = "Hello How are you";						//input
			String[] inputArray = input.split(" ");					//split & convert to string array
			StringJoiner joiner = new StringJoiner("-", "[", "]");	//use stringjoiner class
			for(String inputArr:inputArray) {						//foreach
				joiner.add(inputArr);								//joiner class add method use
			}
			System.out.println(joiner.toString());	*/				//use toString
		
		//	2nd way -
		
	/*		List<String> inputList = Arrays.asList("Hello" , "How" , "are" , "you");
			
			String output = inputList.stream()
										.collect(Collectors.joining("-"));		//sc
			System.out.println(output); */
		
//		71. Optional class - 
		
		/*
		 *  THIS PRACTICAL IS PRESENT IN - LogicalCoding*        - [PROJECT]
		 *	    						- com.codeprep.optional - [PACKAGE]
		 *								- OptionalExample       - [CLASS]
	     */
		 
//		72. Method & Constructor reference - 
		
		//	for method reference plz refer [package com.codeprep.methref;]
		//  for constructor reference plz refer [package com.codeprep.constref;]
		
//		73. Java Stream Api - 
		
		// --> We can create List by 3 ways - 
		
		//1. 
//		List<Integer> list1 = List.of(22,12,33,22);  //This [List.Of] method is available 
													//in [java 9] not in [java 8]
//		System.out.println(list1);
		
		//2. 
//		List<Integer> list2 = new ArrayList<>();
//		list2.add(11);
//		list2.add(12);
//		list2.add(13);
//		list2.add(14);
//		System.out.println(list2);
		
		//There are following ways to print list in [java streams] -->
		
		//1.
//		Stream<Integer> list2Stream = list2.stream();
//		list2Stream.forEach(e -> 
//		System.out.println(e)
//				);
		
		//2.
//		list2.stream().forEach(e -> System.out.println(e));

		
		// --> This is old way to filter list -
		
//		List<Integer> evenList = new ArrayList<>();
//		List<Integer> oddList = new ArrayList<>();
//		for(int i:list2) {
//			if(i % 2 == 0) {
//				evenList.add(i);
//			}else {
//				oddList.add(i);
//			}
//		}
//		System.out.println("Even list --> "+evenList);
//		System.out.println("Odd list --> "+oddList);
		
		// --> This is new way to filter list -
		
//		List<Integer> evenList = list2.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
//		System.out.println("Even list --> "+evenList);
//		
//		List<Integer> oddList = list2.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
//		System.out.println("Odd List --> "+oddList);
//		
//		List<Integer> squareList = list2.stream().map(e -> e*e).collect(Collectors.toList());
//		System.out.println(list2+" Square of each element is --> "+squareList);
//		
//		List<Integer> greaterTen = list2.stream().filter(e -> e>12).collect(Collectors.toList());
//		System.out.println("Greater then 10 is --> "+greaterTen);
		
		//3. 
//		List<Integer> list3 = Arrays.asList(23,12,56,28,96,62);
//		System.out.println(list3);
//		list3.stream().forEach(e -> System.out.println(e));
		
	// --> We can also perform [stream operations] on [array] By following way -->
		
	//	String[] names = {"Sohel", "Aman", "Karan", "Amol", "Raj"};
		
		//1. Filtering:
	/*	Stream<String> filteredNames = Arrays.stream(names)
		      									 .filter(e -> e.startsWith("A"));
		filteredNames.forEach(System.out::println);*/
		
	//	Arrays.stream(names).filter(e -> e.startsWith("A")).forEach(System.out::println);

		//2. Mapping: 
	/*	Stream<String> uppercaseNames = Arrays.stream(names)
		        								.map(String::toUpperCase);
		uppercaseNames.forEach(System.out::println);*/
		
	//	Arrays.stream(names).map(e -> e.toUpperCase()).forEach(System.out::println);
		
		//3. Sorting:
	/*	Stream<String> sortedNames = Arrays.stream(names)
											.sorted();
		sortedNames.forEach(System.out::println);*/
		
	//	Arrays.stream(names).sorted().forEach(System.out::println);

		
		//4. Collecting Results: 
	/*	List<String> nameList = Arrays.stream(names)
										.collect(Collectors.toList());
		System.out.println(nameList);*/
		
	//	Arrays.stream(names).forEach(System.out::println);
	
	//There are two IMP methods are available in java stream -->
//		  i]filter (Boolean condition);
//			if condition is true then only it will going to filter otherwise it will not filter..
//			for e.g. --> filter(e -> e>10);
		
//		  ii]map(Perform Operations on each element);
//			if we want to perform operations on each & every element then that time we have to 
//			use map(); method
//			for e.g. [If we want square of each element then]--> map(e -> e*e);	
			
//		74. Interface - Default & static method 
		
		//for Interface - Default & static method plz refer [package com.codeprep.Int.def.sta.meth;]
		
			//Basically there are 3 types of method available in an interface 
//i]   Abstract method --> This method is mandatory to implements by all child classes...
//iii] Default method  --> This method is only implemented by child classes if child classes need it...
//iii] static method   --> This method is not implemented by any child if implemented 
//						   explicitly then it is known as method over Hidding not method overriding...
		
//		75. WAP to find common elements form two arrays - 
		
//			String[] arr1 = {"java", "interview", "questions", "for", "exprienced"};
//			
//			String[] arr2 = {"java", "questions", "freshers", "interview"};
//			
//			Set<String> output = new HashSet<>();
//			
//			for(int i=0; i<arr1.length; i++) {
//				for(int j=0; j<arr2.length; j++) {
//					if(arr1[i] == arr2[j]) {
//						output.add(arr1[i]);
//						break;
//					}
//				}
//			}
//			for(String s:output) {
//				System.out.println(s);
//			}
		
//		76. WAP prog. to iterate HashMap - 
		
//			HashMap<String, Integer> map = new HashMap<>();
//			map.put("Science", 40);
//			map.put("Physics", 80);
//			map.put("Chemistry", 90);
			
	//	1.	iterator : by using keySet() -
		
//			Iterator<String> itr = map.keySet().iterator();
//			while(itr.hasNext()) {
//				String key = itr.next();
//				Integer value = map.get(key);
//				System.out.println("Key = "+key+"  Value = "+value);
//			}
		
	//	2. 	iterator : by using entrySet() - 
			
//			Iterator<Map.Entry<String,Integer>> itr1 = map.entrySet().iterator();
//			while(itr1.hasNext()) {
//				Map.Entry<String, Integer> entry = itr1.next();
//				System.out.println("Key = "+entry.getKey()+" And Value = "+entry.getValue());
//			}
			
	//	3.  Iterate hashMap using java 8 --> for each and lambda - 
			
//			map.forEach((k,v) -> System.out.println("Key = "+k+" | Value = "+v));
		
//		77. How to compare two HashMaps in java ? 
			
		/*	HashMap<Integer, String> map1 = new HashMap<>();
			
			map1.put(1, "A");
			map1.put(2, "B");
			map1.put(3, "C");
			
			HashMap<Integer, String> map2 = new HashMap<>();
			
			map2.put(2, "B");
			map2.put(1, "A");
			map2.put(3, "C");
			
			HashMap<Integer, String> map3 = new HashMap<>();
			
			map3.put(1, "A");
			map3.put(2, "B");
			map3.put(3, "C");
			map3.put(3, "D");
			
	//		1. Compare --> By using [equals] method - 
			System.out.println(map1.equals(map2));		//true
			System.out.println(map1.equals(map3));      //false
			
	//		2. Compare --> By using [equals] KeySet() - 
			System.out.println(map1.keySet().equals(map2.keySet()));	//true
			System.out.println(map1.keySet().equals(map3.keySet()));	//true
			
	//		3. Find out extra keys for both the maps : Using HashSet - 
			HashMap<Integer, String> map4 = new HashMap<>();
			map4.put(1, "A");
			map4.put(2, "B");
			map4.put(3, "C");
			map4.put(4, "D");
			
			HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());	//[1,2,3]
			
			combineKeys.addAll(map4.keySet());		//[4]
			combineKeys.removeAll(map1.keySet());	//[1,2,3 - 4]
			System.out.println(combineKeys);		//[4]*/
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
			
			
//			just for practice-


		
		

		
}		
}
	
			
			
			
					
			
		


	

