package com.codeprep;

import java.util.HashSet;
import java.util.Set;

public class Practice_2 {
	public static void main(String[] args) {
		
//		1. Palindrome String or not ?
		
//		String name = "madam";
//		int l = name.length();
//		String rev = "";
//		for(int i=l-1; i>=0; i--) {
//			rev = rev + name.charAt(i);
//		}
//		System.out.println(rev);
//		if(name.equals(rev)) {
//			System.out.println("Palindrome String");
//		}else {
//			System.out.println("Not Palindrome String");
//		}
		
//		2. Palindrome number or not ? 
		
//		int no = 121;
//		int temp = no;
//		int rev = 0, rem;
//		while(temp != 0) {
//			rem = temp % 10;
//			rev = rev * 10 + rem;
//			temp = temp / 10;
//		}
//		System.out.println(rev);
//		if(no==rev) {
//			System.out.println("Palindrome No");
//		}else {
//			System.out.println("Not Palindrome No");
//		}
		
//		By using scanner class - 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any no- ");
//		int no = sc.nextInt();
//		int temp = no;
//		int rev = 0, rem;
//		while(temp != 0) {
//			rem = temp % 10;
//			rev = rev * 10 + rem;
//			temp = temp / 10;
//		}
//		System.out.println(rev);
//		if(no == rev) {
//			System.out.println("Palindrome Number");
//		}else {
//			System.out.println("Not Palindrome Number");
//		}
		
//		3. Find percentage of 5 subjects ?
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter sub1 marks - ");
//		int sub1 =sc.nextInt();
//		System.out.println("Enter sub2 marks - ");
//		int sub2 =sc.nextInt();		
//		System.out.println("Enter sub3 marks - ");
//		int sub3 =sc.nextInt();
//		System.out.println("Enter sub4 marks - ");
//		int sub4 =sc.nextInt();
//		System.out.println("Enter sub5 marks - ");
//		int sub5 =sc.nextInt();
//		
//		int sum = sub1 + sub2 + sub3 + sub4 +sub5;
//		double total = 500.00;
//		
//		double percentage = ((sum/total)*100);
//		
//		System.out.println("Percentage is --> "+percentage);
	
//		4. Char is alphabet, digit or special character - 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any char here - ");
//		char c = sc.next().charAt(0);
//		if(c >='A' && c <= 'Z' || c >='a' && c <='z') {
//			System.out.println("Char is Alphabet");
//		}else if(c >='0' && c <='9') {
//			System.out.println("Char is Digit");
//		}else {
//			System.out.println("Char is Special character");
//		}
		
//		5. Find current date ,Custom date , future date ?
		
//			LocalDate currentDate = LocalDate.now();
//			System.out.println("Current Date is --> "+currentDate);
//			
//			LocalDate customDate = LocalDate.of(1999, 06, 28);
//			System.out.println("Custom Date is --> "+customDate);
//			
//			LocalDate futureDate = customDate.plusDays(2);
//			System.out.println("Future Date is --> "+futureDate);
		
//		6. SWap two numbers 
		
//			i] using third varialbe - 
		
//			int a = 10;
//			int b = 20;
//			int t ;
//			
//			System.out.println("Before Swapping two numbers - ");
//			System.out.println("a "+a);
//			System.out.println("b "+b);
//
//			t = a;
//			a = b;
//			b = t;
//			
//			System.out.println("After Swapping two numbers - ");
//			System.out.println("a "+a);
//			System.out.println("b "+b);
		
//			i]without using third varialbe - 
			
//			int y = 100;
//			int z = 200;
//			
//			
//			System.out.println("Before Swapping two numbers - ");
//			System.out.println("y "+y);
//			System.out.println("z "+z);
//
//			y = y+z;
//			z = y-z;
//			y = y-z;
//			
//			System.out.println("After Swapping two numbers - ");
//			System.out.println("y "+y);
//			System.out.println("z "+z);
		
//		7. 	Find maximum and minimum numbers in an array ?
			
			//Maximum - 
//			int[] a = {12,3,5,47,6};
//			int max = a[0];
//			for(int i=0; i<=a.length-1; i++) {
//				if(max < a[i]) {
//					max = a[i];
//					System.out.println("Maximum value is --> "+max);
//				}
//			}
			 
//			//Minimum - 
//			int[] a = {48,58,66,99,100,4};
//			int min = a[0];
//			for(int i=0; i<=a.length-1; i++) {
//				if(min > a[i]) {
//					min = a[i];
//					System.out.println("Minimum value is --> "+min);
//				}
//			}
			
//		8. Find Second largest element in an array ? 
		
//			int[] a = {10,100,60,400,20};
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
//			//Iterate by using for loop- 
//			
//			for(int i=0; i<a.length; i++) {
//				System.out.print(a[i]+" ");
//			}
//			System.out.println();
			
			//Iterate by using for each loop-
			
//			for(int i:a) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
			
			//Iterate by using for each loop [Stream]-
			
			
//			System.out.println("Second largest element in an array is --> "+a[1]);	
				
				
//		9. Find second smallest element in an array ?
		
//			int[] a = {100,200,300,400,50,10};
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
//			iterate by using for loop - 
//			for(int i=0; i<a.length; i++) {
//				System.out.print(a[i]+" ");
//			}
			
//			iterate by using for each loop - 
//			for(int i:a) {
//				System.out.print(i+" ");
//			}
	
//			System.out.println("Second smallest element in an array is --> "+a[1]);	
				
//		10. Find kth largest elment in an array ?
		
//			int[] a = {10,20,30,40,50};
//			int k = 3;
//			int temp;
//			for(int i=0; i<a.length; i++) {
//				for(int j=i+1; j<a.length; j++) {
//					if(a[i] < a[j]) {
//						temp = a[i];
//						a[i] = a[j];
//						a[j] = temp;
//					}
//				}
//				if(i == k) {
//					System.out.println("Kth largest lement is --> "+a[i]);
//				}
//			}
		
//		11. Kth smallest element in an array is ?
		
//			int[] a = {100,200,300,400};
//			int k = 2;
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
//					System.out.println("Kth smallest element in an array is --> "+a[i]);
//				}
//			}
			
//		12. Find duplicate element in an array ? 
		
//			int[] a = {10,20,200,301,100,301,20,17,10};
//			
//			Set<Integer> s = new HashSet<>();
//			
//			for(int no:a) {
//				if(s.add(no) == false) {
//					System.out.print(no+" ");
//				}
//			}
		 
//		13.	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
