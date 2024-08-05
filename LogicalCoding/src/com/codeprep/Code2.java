package com.codeprep;

import java.util.HashMap;
import java.util.Map;

public class Code2 {

	public static void main(String[] args) {

//		1. Reverse String + Palindrome String or not - 

//		String name = "mam";
//		int l = name.length();
//		String rev = "";
//		for (int i = l - 1; i >= 0; i--) {
//			rev = rev + name.charAt(i);
//		}
//		System.out.println(rev);
//		if (name.equals(rev)) {
//			System.out.println("Palindrome String..");
//		} else {
//			System.out.println("Not Palindrome String..");
//		}

//		2. Palindrome number or not - 

//		int no = 12691;
//		int temp = no;
//		int rev = 0, rem;
//		while (temp != 0) {
//			rem = temp % 10;
//			rev = rev * 10 + rem;
//			temp = temp / 10;
//		}
//		System.out.println(rev);
//		if (no == rev) {
//			System.out.println("Palindrome Number..");
//		} else {
//			System.out.println("Not Palindrome Number..");
//		}

//		Palindrome number or not - [By using scanner class]

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any no - ");
//		int no = sc.nextInt();
//		int temp = no;
//		int rev = 0, rem;
//		while (temp != 0) {
//			rem = temp % 10;
//			rev = rev * 10 + rem;
//			temp = temp / 10;
//		}
//		System.out.println(rev);
//		if (no == rev) {
//			System.out.println("Palindrome Number..");
//		} else {
//			System.out.println("Not Palindrome Number..");
//		}

//		3. Check character is alphabet, digit or special character - 

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any - ");
//		char c = sc.next().charAt(0);
//		
//		if(c >= 'A' && c <= 'Z') {
//			System.out.println("Char is alphabet..");
//		}else if(c >= '0' && c <= '9') {
//			System.out.println("Char is Digit..");
//		}else {
//			System.out.println("Char is special character..");
//		}

//		4. How to use Date data type in java - 

//		LocalDate currentDate = LocalDate.now();
//		System.out.println(currentDate);
//
//		LocalDate customDate = LocalDate.of(2024, 5, 1);
//		System.out.println(customDate);
//
//		LocalDate futureDate = customDate.plusDays(10);
//		System.out.println(futureDate);

//		5. Swap two numbers  - [by using third variable]

//		int a = 10, b = 20, t;
//
//		System.out.println("Before swapping - ");
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
//
//		t = a;
//		a = b;
//		b = t;
//
//		System.out.println("After swapping - ");
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);

//		[Without using third variable]

//		int x = 100, y = 200;
//
//		System.out.println("Before Swapping - ");
//		System.out.println("x - " + x);
//		System.out.println("y - " + y);
//
//		x = x + y;
//		y = x - y;
//		x = x - y;
//
//		System.out.println("After Swapping - ");
//		System.out.println("x - " + x);
//		System.out.println("y - " + y);

//		6. Find minimum and maximum value in an array - 

//		int[] a = { 4, 3, 2, 9 };
//		int max = a[0];
//		for (int i = 1; i <= a.length - 1; i++) {
//			if (a[i] > max) {
//				max = a[i];
//				System.out.println("Maximum value is --> " + max);
//			}
//		}

//		int[] a = { 7, 8, 3, 9 };
//		int min = a[0];
//		for (int i = 1; i < a.length; i++) {
//			if (a[i] < min) {
//				min = a[i];
//				System.out.println("Minimum value is --> " + min);
//			}
//		}

//		7. Find second smallest and largest value in an array - 

//		i]second smallest value in an array -

//		int[] a = {2,3,9,4,6,7};
//		int temp;
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//			}
//		//print value by using for loop - 
//		for(int i=0; i<a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		for(int i:a) {
//			System.out.print(i+" ");
//		}
//		
//		System.out.println("Second smallest value in an array is --> "+a[1]);

//		ii]second largest value in an array is --> 

//		int[] a = {2,6,9,7};
//		int temp;
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i] < a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
////		Print array by using for loop - 
//		for(int i = 0; i<a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
////		Print array by using for each loop - 
//		for(int i:a) {
//			System.out.print(i+" ");
//		}
//		
//		System.out.println("Second largest value in an array is --> "+a[1]);

//		8. Find kth largest and smallest element in an array - 

//		i]kth largest element in an array

//		int[] a = {4,2,3,6,9};
//		int k = 2;
//		int temp;
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i] < a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//			if(i == k) {
//				System.out.println("Kth largest element in an array is --> "+a[i]);
//			}
//		}
//		for(int p:a) {
//			System.out.print(p+" ");
//		}

//		ii]kth smallest element in an array

//		int[] a = {7,9,10,2,6};
//		int k = 2;
//		int temp;
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//			if(i == k) {
//				System.out.println("Kth smallest element in an array is --> "+a[i]);
//			}
//		}
////		Print array -
//		for(int p:a) {
//			System.out.print(p+" ");
//		}

//		9. Find duplicate element in an array - 

//		int[] a = {4,2,3,6,4,3};
//	
//		Set<Integer> s = new HashSet<>();
//		
//		for(int no:a) {
//			if(s.add(no) == false) {
//				System.out.print(no+" ");
//			}
//		}

//		10. Find first duplicate element in an array -

//		int[] a = {4,2,6,8,9,6,3,1};
//		int temp = -1;
//		HashSet<Integer> hs = new HashSet<>();
//		for(int i = a.length-1; i>=0; i--) {
//			if(hs.contains(a[i])) {
//				temp = a[i];
//			}else {
//				hs.add(a[i]);
//			}
//		}
//		if(temp != -1) {
//			System.out.println("First Duplicate element in an array is --> "+temp);
//		}else {
//			System.out.println("Duplicate element not found !");
//		}

//		11. Find element that appears once in an array, while every other twice in an array - 

//		int[] a = { 5, 3, 4, 5, 3, 2, 4 };  //5^5 -->0 & 4^4 -->0 & 3^3 -->0 & 2 -->{2}
//		int res = a[0];
//		for (int i = 1; i < a.length; i++) {
//			res = res ^ a[i];
//		}
//		System.out.println("Once appeared element in an array is --> " + res);

//		12. Write Bubble sort java program - {0,0,length - 1}
		
//		int[] a = {5,2,6,7,9,10};
//		
//		System.out.println("Before sorting - "+Arrays.toString(a));
//		int temp;
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a.length-1; j++) {
//				if(a[j] > a[j+1]) {
//					temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//		}
//		
//		for(int p:a) {
//			System.out.print(" "+p);
//		}
		
		// Array apun aise bhi sort kar saktay..
		
//		int[] a = {2,6,9,5,10,3};
//		int temp;
//		System.out.println("Before sorting --> "+Arrays.toString(a));
//		
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		System.out.println("After sorting --> "+Arrays.toString(a));
//
//		for(int p:a) {
//			System.out.print(p+" ");
//		}

//		13. Count number of digit in an array - 
		
//		int no = 123456;
//		int count = 0; 
//		
//		while(no > 0) {
//			no = no / 10;
//			count++;
//		}
//		System.out.println("Count of an Digit is --> "+count);
		
//		14. Count even and odd number in an array - 
		
//		int no = 1234;
//		int even_count = 0;
//		int odd_count = 0;
//		while(no > 0) {
//			int rem = no % 10;
//			if(rem % 2 == 0) {
//				even_count++;
//			}else {
//				odd_count++;
//			}
//		no = no / 10;
//		}
//		System.out.println("Even count is --> "+even_count);
//		System.out.println("Even count is --> "+odd_count);
		
//		15.Find sum of digit in a number - 
		
//		int no = 1234;
//		int sum = 0;
//		while(no > 0) {
//			sum = sum + no % 10;
//			no = no / 10;
//		}
//		System.out.println("Sum of digit in a number is --> "+sum);
		
//		16.Find largest number among three - 
		
//		int x = 200;
//		int y = 300;
//		int z = 100;
//		
//		if(x > y && x > z) {
//			System.out.println("x is greater..");
//		}else if(y > z) {
//			System.out.println("y is greater..");
//		}else {
//			System.out.println("z is greater..");
//		}
		
//		17.Generate fibonacci series - 
		
//		int n1 = 0, n2 = 1, sum = 0;
//		System.out.print(n1+" "+n2);
//		for(int i=2; i<10; i++) {
//			sum = n1+n2;
//			System.out.print(" "+sum);
//			n1 = n2;
//			n2 = sum;
//		}
		
//		18. Prime or not - 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any no - ");
//		int no = sc.nextInt();
//		int count = 0;
//		if(no > 1) {
//			for(int i=1; i<=no; i++) {
//				if(no%i == 0) {
//					count++;
//					}
//			}
//			if(count == 2) {
//				System.out.println("Prime no");
//			}else {
//				System.out.println("Not Prime no");
//			}
//		}else {
//			System.out.println("Not Prime No");
//		}
		
//		19. Generate random number by using random class & math class - 
		
		//random class
//		Random ran = new Random();
//		System.out.println(ran.nextInt());
//		System.out.println(ran.nextDouble());
		
		//math class
//		System.out.println(Math.random());
		
//		20.Find factorial of any no - 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any no - ");
//		int no = sc.nextInt();
//		int factorial = 1;
//		for(int i=1; i<=no; i++) {
//			factorial = factorial * i;
//		}
//		System.out.println("Factorial of a "+no+" is --> "+factorial);
		
//		21.find sum of an array - 
		
//		int[] a = {1,2,3,4};
//		
//		int sum = 0;
//		
//		for(int i=0; i<a.length; i++) {
//			sum = sum + a[i];
//		}
//		System.out.println("Sum of an array is --> "+sum);
		
//		22.Print even and odd number in an array - 
		
//		int[] a = {1,2,3,4};
//		
//		System.out.println("Even number in an array is --> ");
//		for(int i=0; i<a.length; i++) {
//			if(a[i] % 2 == 0) {
//				System.out.println(a[i]+" ");
//		}
//		}
//		System.out.println("Odd number in an array is --> ");
//		for(int i=0; i<a.length; i++) {
//			if(a[i] % 2 != 0) {
//				System.out.println(a[i]+" ");
//			}
//		}
	
//		23. Check two array are equal or not - 
		
//			int[] a1 = {1,2,3,4,5}; 
//			int[] a2 = {1,2,3,4,5,6}; 
//			
//			boolean status = Arrays.equals(a1, a2);
//			
//			if(status == true) {
//				System.out.println("Array are equal");
//			}else {
//				System.out.println("Array are not equal");
//			}
	
//		24.Find missing no in an array -
		
//		int[] a = {1,2,4,5};
//		int sum1 = 0;
//		for(int i=0; i<a.length; i++) {
//			sum1 = sum1 + a[i];
//		}
//		System.out.println("Sum of an array is --> "+sum1);
//	
//		int sum2 = 0; 
//		for(int i=1; i<=5; i++) {
//			sum2 = sum2 + i;
//		}
//		System.out.println("Range is --> "+sum2);
//		System.out.println("Missing number in an array is --> "+(sum2 - sum1));
	
//		25.Search element in an array - 
		
//		int[] a = {10,20,30,40,50};
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter search element here - ");
//		int search_elem = sc.nextInt();
//		boolean flag = false;
//		
//		for(int i=0; i<a.length; i++) {
//			if(search_elem == a[i]) {
//				System.out.println("Element found at -- "+i);
//				flag = true;
//				break;
//			}
//		}
//		if(flag == false) {
//			System.out.println("Element Not Found ! ");
//		}
	
//		26.How to remove junk or special character in an string - 
		
//		String s = "@!%^^#&*^#*&    Latin String 0123456789";
//		s = s.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(s);
	
//		27.How to remove white spaces in a string - 
		
//		String s = "SOHEL      PATVEKAR       JAVA     SOFTWARE          DEVELOPER   ";
//		System.out.println("Before Removing white spaces --> "+s);
//		s = s.replaceAll("\\s", "");
//		System.out.println("After Removing white spaces --> "+s);
	
//		28.Count occurance of character in an string - 
		
//		String s = "Sohel Patvekar";
//		int total_length = s.length();
//		int total_length_after_remove = s.replaceAll("e", "").length();
//		System.out.println("Occurance of character is --> "+(total_length-total_length_after_remove));
	
//		29.How to count words in a string - 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any string here - ");
//		String s = sc.nextLine();
//		int count = 1;
//		for(int i=0; i<s.length(); i++) {
//			if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' ')) {
//				count++;
//			}
//		}
//		System.out.println("Count of words in a string is --> "+count);
	
//		30.Check number is armstrong or not - 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any number - ");
//		int num = sc.nextInt();
//		int cube = 0;
//		int temp = num;
//		int r;
//		
//		while(num > 0) {
//			r = num % 10;
//			cube = cube + (r*r*r);
//			num = num / 10;
//		}
//		if(temp == cube) {
//			System.out.println("This is an armstrong number..");
//		}else {
//			System.out.println("This is not an armstrong number..");
//		}
	
//		31. Count number of duplicate words in given string - 
		
//		String input = "Java is Java Best language is Java";
//		String[] words = input.split(" ");
//		
//		Map<String, Integer> wordCount = new HashMap<>();
//		
//		for(String word:words) {
//			if(wordCount.containsKey(word)) {
//				wordCount.put(word, wordCount.get(word)+1);
//			}else {
//				wordCount.put(word, 1);
//			}
//		}
//		for(String word:wordCount.keySet()) {
//			if(wordCount.get(word) > 1) {
//				System.out.println(word+" : "+wordCount.get(word));
//			}
//		}
	
//		32.Print one to hundread numbers without using any numbers in code - 
		
//		int one = 'A'/'A';
//		String s1 = "..........";
//		
//		for(int i=one; i<=(s1.length() * s1.length()); i++) {
//			System.out.print(i+" ");
//		}
	
//		33.Compare two integer numbers - 
		
		Integer num1 = 100;
		Integer num2 = 100;
		
		if(num1 == num2) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
