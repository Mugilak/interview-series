package com.interview.flow;

import java.util.Scanner;

//2.Print Frequency of characters
//i. Input  : AABBCAABBB
//   Output : A2B2C1A2B3
//ii.Input  : ABBcccd
//   Output : A1B2c3d1

public class CharactersWithFrequency {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new CharactersWithFrequency().getInput();
	}

	private void getInput() {
		System.out.println("Enter String : ");
		String string = input.nextLine();
		System.out.println(getFrequencies(string.toCharArray()));
	}

	private String getFrequencies(char[] array) {
		int i = 0, length = array.length, count = 0;
		String answer = "";
		char each;
		for (i = 0; i < length;) {
			each = array[i];
			count = 0;
			while (i < length && array[i] == each) {
				i++;
				count++;
			}
			answer += each + "" + count;
		}
		return answer;
	}

}
