package com.codeprep;
import java.time.LocalDate;
public class Code {
	public static void main(String[] args) {
		
		System.out.println("Hello World added");
		
//		1. (Reverse string + Palindrome or not)	
			/*String name="Sohel";
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
			}*/
			
	//  2. (Palindrome number or not)
			/*
			int no = 121;
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
			}*/
			
			
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
			}*/
			
			
//		3. Ternary operator
		/*	
		  int x = 10;
		  int y = 20;
		  System.out.println((x>y)? "X is greater":"Y is greater");*/
			
//		4. unary operator 
			/*
			int x=10;
			System.out.println(x++);
			System.out.println(++x);
			System.out.println(x--);
			System.out.println(--x);
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
			}
			*/
			
			
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

			
			
			
			
			
			
			
			System.out.println("Hello");
			
			
			
			
			
			
//			just for practice-
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}
