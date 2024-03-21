package com.codeprep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Practice_2 {
	public static void main(String[] args) {
		
//		1. Palindrome String - 
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter name here - ");
//		String name = sc.next();
//		int l = name.length();
//		String rev = "";
//		for(int i=l-1; i>=0; i--) {
//			rev = rev + name.charAt(i);
//		}
//		System.out.println("Reverse String --> "+rev);
//		if(name.equals(rev)) {
//			System.out.println("Palindrome String..");
//		}else {
//			System.out.println("Not Palindrome String..");
//		}
		
//		2. Compare two HashMap - 
		
		/*	HashMap<Integer, String> map1 = new HashMap<>();
			
			map1.put(1, "A");
			map1.put(2, "B");
			map1.put(3, "C");
			
			HashMap<Integer, String> map2 = new HashMap<>();
			
			map2.put(2, "B");
			map2.put(3, "C");
			map2.put(1, "A");
			
			HashMap<Integer, String> map3 = new HashMap<>();
			
			map3.put(1, "B");
			map3.put(3, "C");
			map3.put(2, "A");
			map3.put(2, "D");
		
			System.out.println(map1.equals(map2));
			System.out.println(map1.equals(map3));
			
			System.out.println(map1.keySet().equals(map2.keySet()));
			System.out.println(map1.keySet().equals(map3.keySet()));
		
			//Find Extra key from hashmap - 
			
			HashMap<Integer, String> map4 = new HashMap<>();
			
			map4.put(1, "A");
			map4.put(3, "M");
			map4.put(2, "K");
			map4.put(4, "L");
			
			HashSet<Integer> combineKeys = new HashSet<>(map1.keySet());
			
			combineKeys.addAll(map4.keySet()); 		 //[1,2,3  +  1,2,3,4]
			combineKeys.removeAll(map1.keySet());	 //[1,2,3  -  1,2,3,4]
			System.out.println(combineKeys);		 //[4]  	*/
			
			
//		3.	Iterate Hashmap - 
		
//			i]
			HashMap<String, Integer> map = new HashMap<>();
			
			map.put("Science", 60);
			map.put("Maths", 65);
			map.put("English", 80);
			
			Iterator<String> itr = map.keySet().iterator();
			while(itr.hasNext()) {
				String key = itr.next();
				Integer value = map.get(key);
				System.out.println("Key --> "+key+" | Value --> "+value);
			}
			
			Iterator<Map.Entry<String, Integer>> itr1 = map.entrySet().iterator();
			while(itr1.hasNext()) {
				itr1.next();
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
