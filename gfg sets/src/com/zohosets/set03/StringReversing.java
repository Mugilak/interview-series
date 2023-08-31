package com.zohosets.set03;

//Using Recursion reverse the string such as
//Eg 1: Input: one two three
//      Output: three two one
//Eg 2: Input: I love india
//      Output: india love I

public class StringReversing {

	public static void main(String[] args) {
		String string = "one two three";
		new StringReversing().reverseByrecursion(string.toCharArray(), "", string.length() - 1);
	}

	private void reverseByrecursion(char[] array, String word, int index) {
		if (index < 0) {
			System.out.print(word + " ");
			return;
		}
		if (array[index] == ' ') {
			System.out.print(word + " ");
			word = "";
			index--;
		}
		word = array[index] + word;
		reverseByrecursion(array, word, index - 1);
	}

}
