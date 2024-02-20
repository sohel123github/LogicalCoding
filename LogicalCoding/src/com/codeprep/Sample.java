package com.codeprep;

import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class Sample {
public static void main(String[] args) {
//	List<String> l=new ArrayList<>();
//	l.add("Sohel");
//	l.add("Shadab");
//	l.add("Shonu");
	
/*	for(String i:l) {
		System.out.println((i));
	}*/
/*	Iterator itr = l.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}*/
/*	ListIterator itr = l.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}*/
//	Map<Integer,String> al=new HashMap<>();
//	
//		al.put(1, "Sohel");
//		al.put(2, "Abhay");
//		al.put(3, "Raj");
//		
//		System.out.println(al);
		
	//1.Iterate by using - keySet --> 
	
//		al.key
	
	//1.Iterate by using - entrySet -->
	//1.Iterate by using - java8 [foreach & lambda] -->
		

//	1. Type safe
/*	List<Integer> l=new ArrayList<>();
	l.add(1);
	l.add(2);
	l.add(3);
	System.out.println(l.contains(10));
	System.out.println(l.indexOf(3));
	System.out.println(l.isEmpty());
	System.out.println(l.remove(2));*/
//	l.add("Sohel");
//	System.out.println(l);
	/*for (Integer i: l) {
		System.out.println(i);
	}*/
//	2. Un-Type safe
	/*List ll=new ArrayList();
	ll.add(1);
	ll.add("Sohel");
//	System.out.println(ll);
	for (Object i: ll) {
		System.out.println(i);
	}*/
	
	/*Vector v=new Vector();
	
	v.add(12);
	v.add("Sohel");
	v.add("Shadab");
	
	System.out.println(v);
	for (Object i : v) {
		System.out.println(i);
	}*/
	
/*	Stack<String> st=new Stack<>();
	st.push("Sohel");
	st.push("Shadab");
	st.push("Sam");
	System.out.println(st.peek());
	st.pop();
	System.out.println(st.peek());
	System.out.println(st.search("Shadab"));
	System.out.println(st);
	System.out.println(st.isEmpty());
	System.out.println(st.empty());*/
	
	/*List l=new ArrayList<>();
	l.add(12);
	l.add("Sohel");
	l.add("Shonu");
	l.add("Tanzim");
	l.add("Shadab");
	
//	System.out.println(l);
	for (Object i : l) {
		System.out.println(i);
	}*/
	
	/*HashSet hs=new HashSet();
//	Duplicates are not allowed..(X)
//	Insertion order does not follow..(X)
	hs.add(12);
	hs.add("Sohel");
	hs.add(120);
	hs.add(120);
	hs.add(null);
	hs.add(null);
	System.out.println(hs);
	for (Object i : hs) {
		System.out.println(i);
	}*/
//	System.out.println("--------------------------------");
/*	LinkedHashSet lhs=new LinkedHashSet();
//	Duplicates are not allowed..(X)
//	Insertion order follow..
	lhs.add(12);
	lhs.add(12);
	lhs.add(120);
	lhs.add("Sohel");
	lhs.add("Pune");
	System.out.println(lhs);
	for (Object i : lhs) {
		System.out.println(i);
	}*/
	
	SortedSet ss=new TreeSet();
//	Sorting order follow..
//	Duplicates are not allowed..(X)
//	Diffrerent data type not take..(X)
/*	ss.add(1);
	ss.add(12);
	ss.add(12);
	ss.add(1220);
	ss.add(123456);
	ss.add(123456789);
	ss.add(122);*/
/*	ss.add("Amol");
	ss.add("Amol");
	ss.add("Dog");
	ss.add("Cat");
	ss.add("Boss");*/
	
//	System.out.println(ss);
	
	TreeSet ts=new TreeSet();
//	Duplicates are not allowed..(X)
//	Insertion order not follow..(X)
//	Diffrerent data type not take..(X)
	ts.add(12);
	ts.add(120);
	ts.add(120);
	ts.add(45);
	ts.add(56);
//	ts.add("Sohel");
//	ts.add("Abhay");
	
	System.out.println(ts);
	
	/*HashMap<Integer, String> hm=new HashMap<>();
	hm.put(1, "Physics");
	hm.put(2, "Maths");
	hm.put(3, "Science");
	System.out.println(hm);
	
	for(Map.Entry<Integer, String> entry: hm.entrySet()) {
		System.out.println("Key: "+entry.getKey()+ " Value: "+entry.getValue());
	}*/
	
	/*LinkedHashMap< Integer, String> lhm=new LinkedHashMap<>();
	lhm.put(1, "Sohel");
	lhm.put(2, "Abhay");
	lhm.put(3, "Raj");
	
//	System.out.println(lhm);
	for(Map.Entry<Integer, String> entry: lhm.entrySet()) {
		System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
	}*/
	
/*	ArrayList<String> al=new ArrayList();
	al.add("Amol");
	al.add("Karan");
	al.add("Raj");
	al.add("Vijay");*/
//	(Print object in one Line..)-->
//	By using sysout statement..
/*	System.out.println(al);
	System.out.println("-------------------------------");*/
	
//	(Print object in one by one..)-->
//	By using for each loop..
	/*for (String i : al) {
		System.out.println(i);
	}
	System.out.println("-------------------------------");*/
	
//	By using iterator..
/*	Iterator<String> itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("-------------------------------");*/
	
//	By using ListIterator..
/*	ListIterator<String> itr=al.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("-------------------------------");*/

	
/*	HashMap<Integer, String> hm=new HashMap<>();
	hm.put(1, "Physics");
	hm.put(2, "Chemistry");
	hm.put(3, "Maths");
//	By using sysout statement..
	System.out.println(hm);
	
	System.out.println("---------------------------");*/
	
//	By using sysout statement..
	/*for(Map.Entry<Integer, String> entry: hm.entrySet()) {
		System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
	}
	System.out.println("---------------------------");*/
}
}
