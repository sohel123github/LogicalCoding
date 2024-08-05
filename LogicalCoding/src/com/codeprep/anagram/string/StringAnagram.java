package com.codeprep.anagram.string;

import java.util.Arrays;

public class StringAnagram {
	// s(l)(lcse)
	public static boolean isAnagram(String s1, String s2) {
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s2.replaceAll("\\s", "");

		if (str1.length() != str2.length()) {
			return false;
		} else {
			char[] c1 = str1.toLowerCase().toCharArray();
			char[] c2 = str2.toLowerCase().toCharArray();

			Arrays.sort(c1);
			Arrays.sort(c2);

			return Arrays.equals(c1, c2);
		}
	}

	public static void main(String[] args) {
//		isAnagram("listen", "silent");
//		System.out.println(isAnagram("silent", "listen"));
		System.out.println(isAnagram("cat", "mat"));
//		System.out.println(isAnagram("Dam", "Mad"));
		System.out.println(isAnagram("cat", "mat"));

	}
}
