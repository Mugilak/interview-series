package com.zohosets.set34;

//Input: s1=”expErIence”, s2=”En”
//output: s1=”exprIece”

public class RemovingCharacters {

	public static void main(String[] args) {
		new RemovingCharacters().getInput();
	}

	private void getInput() {
		int a = 2, b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("invalid input!");
		}
		finally {
			System.out.println("finally");
		}
		String s1 = "expErIence", s2 = "En";
		removeChars(s1.toCharArray(), s2.toCharArray());
	}

	private void removeChars(char[] s1, char[] s2) {
		if (s2.length <= 0) {
			printString(s1);
		}
		for (int i = 0; i < s2.length; i++) {
			for (int j = 0; j < s1.length; j++) {
				if (s2[i] == s1[j]) {
					s1[j] = ' ';
				}
			}
		}
		printString(s1);
	}

	private void printString(char[] array) {
		for (char value : array) {
			if (value != ' ') {
				System.out.print(value);
			}
		}
	}

}
