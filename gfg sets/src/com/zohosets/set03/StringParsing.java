package com.zohosets.set03;

//Eg 1: Input: a1b10
//Output: abbbbbbbbbb
//Eg: 2: Input: b3c6d15
//   Output: bbbccccccddddddddddddddd
//The number varies from 1 to 99.

public class StringParsing {

	public static void main(String[] args) {
		new StringParsing().printBasedOnString("b3c6d15".toCharArray());
	}

	private void printBasedOnString(char[] array) {
		int number = 0, k = 1;
		char c = ' ';
		for (int i = 0; i < array.length; i++) {
			number = 0;
			k = 1;
			if (array[i] >= 97 && array[i] <= 122) {
				c = array[i];
			} else if (array[i] >= 48 && array[i] <= 57) {
				number = number * k + (array[i] - 48);
				while (i + 1 < array.length && (array[i + 1] >= 48 && array[i + 1] <= 57)) {
					k *= 10;
					number = number * k + (array[i + 1] - 48);
					i++;
				}
				for (int j = 1; j <= number; j++) {
					System.out.print(c);
				}
			}
		}
	}

}
