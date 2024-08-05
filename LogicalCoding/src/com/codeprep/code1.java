package com.codeprep;

import java.util.Scanner;

public class code1 {
	public static void main(String[] args) {

//		1. Palindrome String or not ?

//		String name = "madam";
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

//		2. Palindrome No Or Not ?

//		int no = 12201;
//		int temp = no;
//		int rev = 0, rem;
//		while (temp != 0) {
//			rem = temp % 10;
//			rev = rev * 10 + rem;
//			temp = temp / 10;
//		}
//		System.out.println(rev);
//		if (no == rev) {
//			System.out.println("Palindrome No..");
//		} else {
//			System.out.println("Not Palindrome No..");
//		}

//		---------------------------------------------------

//		By using Scanner Class - 

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter No here - ");
//		int no = sc.nextInt();
//		int temp = no;
//		int rev = 0, rem;
//		while (temp != 0) {
//			rem = temp % 10;
//			rev = rev * 10 + rem;
//			temp = temp / 10;
//		}
//		System.out.println("Reverse number - " + rev);
//		if (no == rev) {
//			System.out.println("Palindrome Number..");
//		} else {
//			System.out.println("Not Palindrome Number..");
//		}

//		3. Check Character is alphabet / digit / special  character - 

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter here - ");
//		char c = sc.next().charAt(0);
//		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
//			System.out.println("Char is Alphabet..");
//		} else if (c >= '0' && c <= '9') {
//			System.out.println("Char is Digit..");
//		} else {
//			System.out.println("Special Character..");
//		}

//		4. Check String Anagram or not ?

//	public static boolean isAnagram(String s1, String s2) {
//		String str1 = s1.replaceAll("\\s", "");
//		String str2 = s2.replaceAll("\\s", "");
//
//		if (str1.length() != str2.length()) {
//			return false;
//		} else {
//
//			char[] c1 = str1.toLowerCase().toCharArray();
//			char[] c2 = str2.toLowerCase().toCharArray();
//
//			Arrays.sort(c1);
//			Arrays.sort(c2);
//
//			return Arrays.equals(c1, c2);
//		}
//	}
//
//	public static void main(String[] args) {
//		System.out.println(isAnagram("silent", "Listen"));
//		System.out.println(isAnagram("Kill", "Mill"));
//	}

//		5.Current Date, Custom date, Future Date - 

//		LocalDate currentDate = LocalDate.now();
//		System.out.println("currentDate - " + currentDate);
//
//		LocalDate customDate = LocalDate.of(2024, 06, 28);
//		System.out.println("customDate - " + customDate);
//
//		LocalDate futureDate = customDate.plusDays(4);
//		System.out.println("futureDate - " + futureDate);

//		6.Swap two numbers - 

//		i] By using third variable - 

//		int a = 20;
//		int b = 40;
//		int c;
//
//		System.out.println("Before swapping - ");
//		System.out.println("a - " + a);
//		System.out.println("b - " + b);
//
//		c = a;
//		a = b;
//		b = c;
//
//		System.out.println("After Swapping - ");
//		System.out.println("a - " + a);
//		System.out.println("b - " + b);

//		i] By without using third variable -

//		int x = 20;
//		int y = 40;
//
//		System.out.println("Before Swapping - ");
//		System.out.println("x - " + x);
//		System.out.println("y - " + y);
//
//		x = x + y;
//		y = x - y;
//		x = x - y;
//
//		System.out.println("Before Swapping - ");
//		System.out.println("x - " + x);
//		System.out.println("y - " + y);

//		7. Find Maximum and minimum value in an array - 

//		Maximum value in an array -

//		int[] a = { 4, 3, 1, 2, 9 };
//		int max = a[0];
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] > max) {
//				max = a[i];
//				System.out.println("Maximum value - " + max);
//			}
//		}

//		minimum value in an array -

//		int[] x = { 9, 12, 35, 69, 4 };
//		int min = x[0];
//
//		for (int i = 0; i < a.length; i++) {
//			if (x[i] < min) {
//				min = x[i];
//				System.out.println("Minimum value - " + min);
//			}
//		}

//		8. Find second largest and smallest value in an array - 

//		i]Find second largest value in an array - 

//		int[] a = { 9, 12, 20, 16 };
//		int temp;
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] < a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		System.out.println("Second largest value in an array - " + a[1]);

//		ii]Find second smallest value in an array - 

//		int[] a = { 6, 2, 4, 9, 10 };
//		int temp;
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		System.out.println("Second smallest value in an array - " + a[1]);

//		9. Find Kth largest and smallest element in an array - 

//		i] largest element in an array - 

//		int[] a = { 9, 3, 4, 2, 8, 12 };
//		int k = 4;
//		int temp;
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] < a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//			if (i == k) {
//				System.out.println(a[i]);
//			}
//		}

//		ii] smallest element in an array - 

//		int[] a = { 2, 4, 5, 6, 10, 14, 18 };
//		int k = 3;
//		int temp;
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//			if (k == i) {
//				System.out.println(a[i]);
//			}
//		}

//		10. Find out duplicate element in an array - 

//		i] By set interface method - 

//		int[] a = { 4, 1, 6, 8, 12, 2, 1, 8, 4 };
//
//		Set<Integer> s = new HashSet<>();
//
//		for (int no : a) {
//			if (s.add(no) == false) {
//				System.out.println(no + " ");
//			}
//		}

//		11. Find First Duplicate element in an array - 

//		int[] a = { 4, 1, 2, 6, 8, 10, 19, 21, 2, 10 };
//
//		int temp = -1;
//		HashSet<Integer> hs = new HashSet<>();
//		for (int i = a.length - 1; i >= 0; i--) {
//			if (hs.contains(a[i])) {
//				temp = a[i];
//			} else {
//				hs.add(a[i]);
//			}
//		}
//		if (temp != -1) {
//			System.out.println("First Duplicate Element in an array is --> " + temp);
//		} else {
//			System.out.println("Duplicate Element Not Found!");
//		}

//		12. Find Element in an array which occurs once in an array while other twice in an array - 
//			[XOR concept]

//		int[] a = { 5, 4, 3, 2, 5, 4, 3 };
//		int res = a[0];
//		for (int i = 1; i < a.length; i++) {
//			res = res ^ a[i];
//		}
//		System.out.println(res);

//		13. Buble sort java program - [0,0,length-1]

//		int[] a = { 8, 16, 4, 2, 10 };
//		int temp;
//		System.out.println("Arrays Before Sort - " + Arrays.toString(a));
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length - 1; j++) {
//				if (a[j] > a[j + 1]) {
//					temp = a[j];
//					a[j] = a[j + 1];
//					a[j + 1] = temp;
//				}
//			}
//		}
//		System.out.println("Arrays After Sort - " + Arrays.toString(a));
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}

//		14. Count number of digit in an number - 

//		int no = 123456;
//		int count = 0;
//		while (no > 0) {
//			no = no / 10;
//			count++;
//		}
//		System.out.println("Count number of digit in an number - " + count);

//		15. Count even and odd count in an array - 

//		int no = 1234;
//		int evenCount = 0;
//		int oddCount = 0;
//
//		while (no > 0) {
//			int rem = no % 10;
//			if (rem % 2 == 0) {
//				evenCount++;
//			} else {
//				oddCount++;
//			}
//			no = no / 10;
//		}
//		System.out.println("Even Count is --> " + evenCount);
//		System.out.println("Odd Count is --> " + oddCount);

//		16. Sum of Digit in a number - 

//		int no = 1234;
//		
//		int sum = 0; 
//		while(no > 0) {
//			sum = sum + no % 10;
//			no = no / 10;			
//		}
//		System.out.println("Sum of digit in a number is --> "+sum);

//		17. Find largest among three numbers - 

//		int x = 300;
//		int y = 100;
//		int z = 200;
//		if (x > y && x > z) {
//			System.out.println("X is greater..");
//		} else if (y > z) {
//			System.out.println("Y is greater..");
//		} else {
//			System.out.println("Z is greater..");
//		}

//		18. Fibonacci series - 

//		int n1 = 0, n2 = 1, sum = 0;
//		System.out.print(n1 + " " + n2);
//		for (int i = 2; i < 10; i++) {
//			sum = n1 + n2;
//			System.out.print(" " + sum);
//			n1 = n2;
//			n2 = sum;
//		}

//		19. Prime no. or not ?

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Any no - ");
//		int num = sc.nextInt();
//		int count = 0;
//		if (num > 1) {
//			for (int i = 1; i <= num; i++) {
//				if (num % i == 0) {
//					count++;
//				}
//			}
//			if (count == 2) {
//				System.out.println(num + " Prime Number..");
//			} else {
//				System.out.println(num + " Not a prime number..");
//			}
//		} else {
//			System.out.println(num + " Not a prime number..");
//		}

//		20. Generate random numbers by random class and math class - 

//		Random ran = new Random();

//		int num = ran.nextInt();
//		System.out.println(num);

//		Double num2 = ran.nextDouble();
//		System.out.println(num2);

//		System.out.println(Math.random());

//		21. Generate Factorial of a number - 

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any no - ");
//		int num = sc.nextInt();
//		int factorial = 1;
//		for (int i = 1; i <= num; i++) {
//			factorial = factorial * i;
//		}
//		System.out.println(num + " - Factorial is --> " + factorial);

//		22. Find sum of an array - 

//		int[] a = { 4, 3, 2, 1 };
//		int sum = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			sum = sum + a[i];
//		}
//		System.out.println("Sum of an array is --> " + sum);

//		23. Print Even and Odd number in an array - 

//		int[] a = { 1, 2, 3, 4 };
//
//		System.out.print("Even No - ");
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0) {
//				System.out.print(a[i] + " ");
//			}
//		}
//		System.out.println();
//
//		System.out.print("Odd Number - ");
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 != 0) {
//				System.out.print(a[i] + " ");
//			}
//		}

//		24. Check Two Arrays are equal or not ? 

//		int[] a1 = { 1, 2, 3, 4, 5 };
//		int[] a2 = { 1, 2, 3, 4, 5 };
//
//		boolean status = Arrays.equals(a1, a2);
//
//		if (status == true) {
//			System.out.println("Arrays are equal");
//		} else {
//			System.out.println("Arrays are not equal");
//		}

//		25. Missing number in an array - 

//		int[] a = { 1, 2, 4, 5 };
//		int sum1 = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum1 = sum1 + a[i];
//		}
//		System.out.println("Sum of an array is --> " + sum1);
//
//		int sum2 = 0;
//		for (int i = 1; i <= 5; i++) {
//			sum2 = sum2 + i;
//		}
//		System.out.println("Range of an array is --> " + sum2);
//
//		System.out.println("Missing number in an array is --> " + (sum2 - sum1));

//		26. Search element in an array - 

//		int[] a = { 10, 20, 40, 50, 30 };
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any no - ");
//		int search_ele = sc.nextInt();
//		boolean flag = false;
//		for (int i = 0; i < a.length; i++) {
//			if (search_ele == a[i]) {
//				System.out.println("Element Found At - " + i);
//				flag = true;
//				break;
//			}
//		}
//		if (flag == false) {
//			System.out.println("Element Not Found !");
//		}

//		27. How to remove junk or special characters in an string - 

//		String s = "@$%*^%$ Latin String 0123456";
//		s = s.replaceAll("[^a-zA-Z0-9]", "");
//		System.out.println(s);

//		28. How to remove white spaces in an array - 

//		String s = "Sohel     Patvekar      Java      Software      Engineer";
//		System.out.println("Before Sorting - " + s);
//		s = s.replaceAll("\\s", "");
//		System.out.println("After Sorting - " + s);

//		29. Count Occurance of character in an string - 

//		String s = "Java Programming Language";
//		int total_Length = s.length();
//		int total_Length_AfterRemove = s.replaceAll("a", "").length();
//		int count = total_Length - total_Length_AfterRemove;
//		System.out.println("Count occurance of character in an array is --> " + count);

//		30. How to count words in a string - 

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter String here - ");
//		String s = sc.nextLine();
//		int count = 1;
//		for (int i = 0; i < s.length(); i++) {
//			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
//				count++;
//			}
//		}
//		System.out.println("Count of words in an String is --> " + count);

//		31.
	}
}
