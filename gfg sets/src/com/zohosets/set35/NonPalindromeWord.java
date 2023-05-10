package com.zohosets.set35;

public class NonPalindromeWord {

	public static void main(String[] args) {
		new NonPalindromeWord().getInput();
	}

	private void getInput() {
		String word = "he knows malayalam";
		String[] array = word.split(" ");
		findNonPaindromes(array, array.length);
	}

	private void findNonPaindromes(String[] array, int length) {
		for (int i = 0; i < length; i++) {
			if (!(isPalindrome(array[i].toCharArray()))) {
				System.out.print(array[i] + " ");
			}
		}
	}

	private boolean isPalindrome(char[] array) {
		int start = 0, last = array.length - 1;
		while (start < last) {
			if (array[start] != array[last]) {
				return false;
			}
		}
		return true;
	}

}
