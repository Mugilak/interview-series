package com.zohosets.set03;

//Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.
//Eg 1:Input:
//        String 1: test123string
//         String 2: 123
//        Output: 4
//Eg 2: Input:
//        String 1: testing12
//        String 2: 1234 
//        Output: -1

public class SubstringFinding {

	public static void main(String[] args) {
		new SubstringFinding().getInput();
	}

	private void getInput() {
		String s1 = "test123string123", s2 = "123";
		System.out.println(findSubstring(s1.toCharArray(), s2));
	}

	private int findSubstring(char[] s1, String s2) {
		int startIndex = 0, count = 0;
		int length1 = s1.length, length2 = s2.length();
		String value = "";
		if (length1 < length2) {
			return startIndex;
		}
		for (int i = 0; i < length1; i++) {
			value += s1[i];
			count++;
			if (length2 == count) {
				if (value.equals(s2)) {
					return startIndex;
				}
				value = (value.replace(s1[startIndex++], ' ')).strip();
				count--;
			}
		}
		return -1;
	}

}
