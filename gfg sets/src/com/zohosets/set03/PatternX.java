package com.zohosets.set03;

//Input: 12345
//Output:
//1       5
//  2   4
//    3
//  2   4
//1       5

public class PatternX {

	public static void main(String[] args) {
		new PatternX().print("geeks".toCharArray());
	}

	private void print(char[] array) {
		int length = array.length;
		if (length % 2 == 0) {
			System.out.println("invalid  !");
			return;
		}
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (i == j) {
					System.out.printf("%3s", array[i]);
				} else if (i + j == length - 1) {
					System.out.printf("%3s", array[j]);
				} else {
					System.out.printf("%3s", " ");
				}
			}
			System.out.println();
		}
	}

}
