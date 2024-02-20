package com.codeprep.dummy;

public class Rough {
	
//	public static Optional<String> getName(){
//		String name = "Sohel";
//		return Optional.ofNullable(name);
//	}
	
public static void main(String[] args) {
	
//		WAP to print kth largest element in an array -
		
//		int[] a = {1,2,3,4,5,6,7,8,9,10};
//		int temp;
//		int k = 4;
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
		
//		WAP to print kth smallest value in an arrray - 
	
//		int[] a = {1,2,3,4,5,6,7,8,9,10};
//		int temp;
//		int k = 4;
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				if(a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//			if(i == k) {
//				System.out.println("Second smallest value in an array is --> "+a[i]);
//			}
//		}
//		
		
//		WAP to print duplicate value in an array - 
	
	/*	int[] a = {1,2,3,4,5,6,7,8,9,10,2,4,6,8};
		
		Set<Integer> s = new HashSet<>();
		
		for(int no:a) {
			if(s.add(no) == false) {
				System.out.println(no);
			}
		}*/
	
//		Find first duplicate element in an array - 
	
//		int[] a = {1,2,3,4,5,6,7,8,9,10};
//		int temp = -1;
//		HashSet<Integer> hs = new HashSet<>();
//		for(int i=a.length-1; i>=0; i--) {
//			if(hs.contains(a[i])) {
//				temp = a[i];
//			}else {
//				hs.add(a[i]);
//			}
//		}
//		if(temp != -1) {
//			System.out.println("First duplicate element in an array is --> "+temp);
//		}else {
//			System.out.println("Duplicate element not found");
//		}
		
//		Find element that appears once in an array -
	
	/*	int[] a = {5,4,3,10,3,4,5};
		int res = a[0];
		for(int i=1; i<a.length; i++) {
			res = res ^ a[i];
		}
		System.out.println("Once appeared element in an array is --> "+res);*/
		
//	without bubble - 
/*	int[] a = {1,2,3,4,5,6};
	int temp;
	for(int i=0; i<a.length; i++) {
		for(int j=i+1; j<a.length; j++) {
			if(a[i] > a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
//	for(int i=0; i<a.length; i++) {
//		System.out.println(a[i]);
//	}
	
//	for(int i:a) {
//		System.out.println(i);
//	}
*/
//	with bubble sort - 

//	int[] a = {1,2,3,4,5,6}; 
//	int temp;
//	System.out.println("Arrays Before sorting --> "+Arrays.toString(a));
//	for(int i=0; i<a.length; i++) {
//		for(int j=0; j<a.length-1; j++) {
//			if(a[j] <  a[j+1]) {
//				temp = a[j];
//				a[j] = a[j+1];
//				a[j+1] = temp;
//			}
//		}
//	}
//	for(int i=0; i<a.length; i++) {
//		System.out.print(a[i]+" ");
//	}
		
//		WAP to sort array by using without bubble and with bubble sort - 
	
//		without bubble sort - 
	
	/*	int[] a = {1,2,3,4,5,6};
		int temp;
		int k = 4;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if(i == k) {
				System.out.println("Element at kth index --> "+a[i]);
			}
		}
		//For loop - 
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		//for each loop - 
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		System.out.println("Element at 2nd index --> "+a[2]);*/
		
		//with bubble sort - 
		
//		int[] a = {1,2,3,4,5,6,3,1};
//		int temp;
//		int k = 2;
		
		//Find duplicate element in an array -
//		Set<Integer> s = new HashSet<>();
//		for(int no:a) {
//			if(s.add(no)==false) {
//				System.out.println("Duplicate element is --> "+no);
//			}
//		}
		

		
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a.length-1; j++) {
//				if(a[j] > a[j+1]) {
//					temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//			if(i == k) {
//				System.out.println("Element at kth index --> "+a[i]);
//			}
//		}
//		//for loop - 
//		for(int i=0; i<a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println("\n");
//		//For each loop - 
//		for(int i:a) {
//			System.out.print(i+" ");
//		}
		
		
		//WAP Once appeared element in an array - 
	
//		int[] a = {1,2,3,1,2,3,8};
//		int res = a[0];
//		for(int i = 1; i<a.length; i++) {
//			res = res ^ a[i];
//		}
//		System.out.println("Once appeard element in an array is --> "+res);
		
		
		//Count even and odd number in an digit - 
	
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
//			no = no / 10;
//		}
//		System.out.println("Even count of number is --> "+even_count);
//		System.out.println("Odd count of number is --> "+odd_count);
	
		//Sum of digit in a number -
	
	/*	int no = 1234;
		int sum = 0;
		while(no > 0) {
			sum = sum + no % 10;
			no = no / 10;
			}
		System.out.println("Sum of digit in a number is --> "+sum);*/
	
		//Find largest of three numbers - 
		//1st way - 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first number - ");
//		int num1 = sc.nextInt();
//		System.out.println("Enter second number - ");
//		int num2 = sc.nextInt();
//		System.out.println("Enter third number - ");
//		int num3 = sc.nextInt();
//		if(num1 >= num2 && num1 >= num3) {
//			System.out.println(num1+" is greater");
//		}else if(num2 >= num1 && num2 >= num3) {
//			System.out.println(num2+" is greater");
//		}else {
//			System.out.println(num3+" is greater");
//		}
	
		//2nd way - 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first number -");
//		int x = sc.nextInt();
//		System.out.println("Enter second number -");
//		int y = sc.nextInt();
//		System.out.println("Enter third number -");
//		int z = sc.nextInt();
//		if(x>y && x>z) {
//			System.out.println("X is greater");
//		}else if(y>z) {
//			System.out.println("Y is greater");
//		}else {
//			System.out.println("Z is greater");
//		}
		
//		Generate fibonacci series - 
	
//		[A series of numbers in which each number is the sum of preceding two numbers]
//		[0 1 1 2 3 5 8 13 21 34]
		
//		int n1 = 0, n2 = 1, sum = 0;
//		System.out.print(n1+" "+n2);
//		for(int i=2; i<10; i++) {
//			sum = n1 + n2;
//			System.out.print(" "+sum);
//			n1 = n2;
//			n2 = sum;
//		}
	
		//WAP a code for prime no or not ?
	
//		prime > 1 and only two factors --> 1 & itsself..
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Any no -");
//		int no = sc.nextInt();
//		int count = 0;
//		if(no > 1) {
//			for(int i=1; i<=no; i++) {
//				if(no % i == 0) {
//					count++;
//				}
//			}
//			if(count == 2) {
//				System.out.println("Prime no");
//			}else {
//				System.out.println("Not Prime no");
//			}
//		}else {
//			System.out.println("Not Prime No");
//		}
		
		//Generate random numbers - 
	
//		Random ran = new Random();
//		int ran_no = ran.nextInt(10);
//		System.out.println(ran_no);
		
//		Double ran_double = ran.nextDouble();
//		System.out.println(ran_double);
		
//		System.out.println(Math.random());
		
		//Generate factorial of a number - 
	
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter any no - ");
		int no = sc.nextInt();
		int factorial = 1;
		for(int i=1; i<=no; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of a "+no+" is --> "+factorial);*/
	
		//find sum of array - 
	
	/*	int[] a = {4,3,2,1};
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
			}
		System.out.println("Sum of array is --> "+sum);*/
	
		//find even and odd number in an array - 
	
//		int[] a = {1,2,3,4};
//		
//		System.out.println("Even number in an array is -");
//		for(int i=0; i<a.length; i++) {
//			if(a[i] % 2 == 0) {
//				System.out.println(a[i]+" ");
//			}
//		}
//	
//		System.out.println("Odd number in an array is -");
//		for(int i=0; i<a.length; i++) {
//			if(a[i] % 2 != 0) {
//				System.out.println(a[i]+" ");
//			}
//		}
		
		//check two array is equal or not - 
	
//		int[] a1 = {1,2,3,4,5};s
//		int[] a2 = {1,2,3,4};
//		
//		boolean status = Arrays.equals(a1, a2);
//		
//		if(status == true) {
//			System.out.println("Array are equal");
//		}else {
//			System.out.println("Array are not equal");
//		}
	
		//find missing no in an array - 
	
//		int[] a = {1,2,4,5};
//		int sum1 = 0;
//		for(int i=0; i<a.length; i++) {
//			sum1 = sum1 + a[i];
//		}
//		System.out.println("Sum of array is --> "+sum1);
//	
//		int sum2 = 0;
//		for(int i=1; i<=5; i++) {
//			sum2 = sum2 + i;
//		}
//		System.out.println("Sum of range is --> "+sum2);
//	
//		System.out.println("Missing no. in an array is --> "+(sum2 - sum1));
	
		
		//search no. in an array - 
	
//		int[] a = {10,20,30,50,40};
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter search number here - ");
//		int search_ele = sc.nextInt();
//		boolean flag = false;
//		
//		for(int i=0; i<a.length; i++) {
//			if(search_ele == a[i]) {
//				System.out.println("Element found at --> "+i);
//				flag = true;
//				break;
//			}
//		}
//		if(flag == false) {
//			System.out.println("Element not found");
//		}
		
		//remove junk or secial character in an array - 
	
	/*	String s = "!@#$%^&* Latin String 0123456789";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);*/
	
		//How to remove white spaces in an string - 
	
	/*	String str = "Sohel    Patvekar    Java     Software          Developer";
		System.out.println("Before removing white spaces "+str);
		str = str.replaceAll("\\s", "");
		System.out.println("After removing white spaces "+str);*/
	
		//Count occurance of character in an string - 
	
	/*	String s = "Java is Java";
		int total_length = s.length();
		int total_lengthafterremove = s.replaceAll("a", "").length();
		int count = total_length - total_lengthafterremove;
		System.out.println("Occurance of character is --> "+count);*/
		

		//WAP prog. to iterate HashMap - 
	
//			HashMap<String, Integer> map = new HashMap<>();
//			map.put("Science", 40);
//			map.put("Physics", 80);
//			map.put("Chemistry", 90);
			
//			1. By using keyset - 
			
//			Iterator<String> itr = map.keySet().iterator();
//			while(itr.hasNext()) {
//				String key = itr.next();
//				Integer value = map.get(key);
//				System.out.println("Key - "+key+" Value - "+value);
//			}
			
//			2. By using entrySet - 
			
//			Iterator<Map.Entry<String, Integer>> itr1 = map.entrySet().iterator();
//			while(itr1.hasNext()) {
//				Map.Entry<String, Integer> entry = itr1.next();
//				System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
//			}
			
//			3. By using java8 - for each and lambda features - 
			
//			map.forEach((k,v) -> System.out.println("Key - "+k+" Value - "+v));
			
//				Map<Integer,String> al=new HashMap<>();
//				
//				al.put(1, "Sohel");
//				al.put(2, "Abhay");
//				al.put(3, "Raj");
			
//				System.out.println(al);
			
				//1. By using - keyset -->
				
//				Iterator<Integer> itr = al.keySet().iterator();
//				while(itr.hasNext()) {
//					Integer key = itr.next();
//					String value = al.get(key);
//					System.out.println("Key - "+key+" Value - "+value);
//				}
				
				//2. By suing - entryset --> 
				
//				Iterator<Map.Entry<Integer, String>> itr1 = al.entrySet().iterator();
//				while(itr1.hasNext()) {
//					Map.Entry<Integer, String> entry = itr1.next();
//					System.out.println("Key = "+entry.getKey()+" Value = "+entry.getValue());
//				}
				
				//3. by using - java8 forEach & lambda -->
				
//				al.forEach((k,v) -> System.out.println("Key - "+k+" Value - "+v));
	
//		Map<Integer,String> map = new HashMap<>();
//		map.put(1, "Sohel");
//		map.put(2, "Abhay");
//		map.put(3, "Raj");
//		System.out.println(map);
		
//		1. iterate by using - keySet -->
		
//		Iterator<Integer> itr = map.keySet().iterator();
//		while(itr.hasNext()) {
//			Integer key = itr.next();
//			String value = map.get(key);
//			System.out.println("Key - "+key+" Value - "+value);
//		}
		
		
//		2. iterate by using - entrySet -->
		
//		Iterator<Map.Entry<Integer, String>> itr1 = map.entrySet().iterator();
//		while(itr1.hasNext()) {
//			Map.Entry<Integer, String> entry = itr1.next();
//			System.out.println("Key - "+entry.getKey()+" Value - "+entry.getValue());
//		}
		
//		3. iterate by using - java8 [foreach & lambda features] -->
		
//		map.forEach((k,v) -> System.out.println("Key - "+k+" Value - "+v));
		
		//count words in a string - 
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter string here - ");
//		String s = sc.nextLine();
//		int count = 1;
//		for(int i=0; i<s.length(); i++) {
//			if((s.charAt(i) == ' ')&& s.charAt(i+1) != ' ') {
//				count++;
//			}
//		}
//		System.out.println("Count of words in a string - "+count);
	
		//write logic for armstrong number or not - 
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number here - ");
//		int num = sc.nextInt();
//		int cube = 0;
//		int t = num;
//		int r;
//		while(num > 0) {
//			r = num % 10;
//			num = num / 10;
//			cube = cube+(r*r*r);
//		}
//		if(cube == t) {
//			System.out.println("This is an armstrong number");
//		}else {
//			System.out.println("This is not an armstrong number");
//		}
	
		//print 1 to 100 numbers without using numbers in your code - 
	
	/*	int one = 'A'/'A';
		String s1 = "..........";
		
		for(int i=one; i<=(s1.length()*s1.length()); i++) {
			System.out.println(i);
		}*/
	
		//print 1 to 100 numbers without using numbers in your code - 
		
		/*	int one = 'A'/'A';
			String s1 = "..........";
			
			for(int i=one; i<=(s1.length()); i++) {
				System.out.println(i);
			}*/
	
		//print hello world without using semicolon in your code - 
	
		//1. printf==null -
//		if(System.out.printf("Hello World"+"\n")==null) {
//			
//		}
	
		//2. append == null
//		if(System.out.append("Hello World"+"\n")== null) {
//			
//		}
	
		//3. append.equals(null)
//		if(System.out.append("Hello World"+"\n").equals(null)){
//			
//		}
	
		//4. for loop - 
//		for(int i=0; i<1; System.out.println("Hello world")) {
//			i++;
//		}
		
		//print your name 1000 times without using loop & recursion in java - 
	
	/*	String name = "Sohel";
		String s = "i";
		
		s = s.replaceAll("i", "iiiiiiiiii");
		s = s.replaceAll("i", "iiiiiiiiii");
		s = s.replaceAll("i", "iiiiiiiiii");
		
		s = s.replaceAll("i", name+"\n");
		System.out.println(s);*/
		
//		WAP for leap year or not - 
	
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter year here - ");
		int year = sc.nextInt();
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("Leap Year");
		}else {
			System.out.println("Not Leap Year");
		}*/
	
		//
//		Optional<String> nameOptional = getName();
		
		//
//		System.out.println(nameOptional.isPresent());
//		System.out.println(nameOptional.get());
//		System.out.println(nameOptional.orElse("This is null object"));
		
		
		
		
}
}
