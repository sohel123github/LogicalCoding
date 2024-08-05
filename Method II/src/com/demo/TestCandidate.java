package com.demo;

public class TestCandidate {

	public static Candidate addCandidate() {
		Candidate cand = new Candidate(1001, "Hemant", "Islampur");
		return cand;
	}

	public static void main(String[] args) {
		Candidate cand = addCandidate();
		System.out.println(cand.id);
		System.out.println(cand.name);
		System.out.println(cand.city);
	}

}
