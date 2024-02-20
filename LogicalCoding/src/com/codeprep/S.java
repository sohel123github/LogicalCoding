package com.codeprep;

public class S {
	
	int id;
	String name;
	String city;
	
/*	@Override
	public String toString() {
		return "S [id=" + id + ", name=" + name + ", city=" + city + "]";
	}*/

	public S (int id, String name, String city) {
		this.id=id;
		this.name=name;
		this.city=city;
	}

	public static void main(String[] args) {
	S s = new S(1,"Sohel","Islampur");
	System.out.println("Id is --> "+s.id);
	System.out.println("Id is --> "+s.name);
	System.out.println("Id is --> "+s.city);
}
}
