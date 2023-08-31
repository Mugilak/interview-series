package com.zohosets.set04;

//Given a positive integer N, return its corresponding column title as it would appear in an Excel sheet.
//For N =1 we have column A, for 27 we have AA and so on.
//Input:
//N = 51
//Output: AY

public class AlphabetSequence {

	public static void main(String[] args) {
		System.out.println(new AlphabetSequence().numberToSequence(51));
	}

	private String numberToSequence(int n) {
		String answer = "";
		while (n != 0) {
			answer = (char) (((n - 1) % 26) + 65) + answer;
			n = (n - 1) / 26;
		}
		return answer == "" ? "invalid" : answer;
	}

}
