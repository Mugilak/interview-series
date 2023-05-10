package com.zohosets.set14;

import java.util.Scanner;

public class RomanToNumeral {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new RomanToNumeral().getInput();
	}

	private void getInput() {
		System.out.println("Enter Roman Letter : ");
		String roman = input.nextLine();
		romanToNumber(roman.toCharArray());
	}

	private void romanToNumber(char[] roman) {
		int number = 0, value = 0, secondValue = 0, length = roman.length;
		for (int i = 0; i < length; i++) {
			value = getValue(roman[i]);
			secondValue = (i + 1 < length) ? getValue(roman[i + 1]) : 0;
			if (value < secondValue) {
				value = secondValue - value;
				i++;
			}
			number += value;
		}
		System.out.println(number);
	}

	private int getValue(char character) {
		switch (character) {
		case 'M':
			return 1000;
		case 'D':
			return 500;
		case 'C':
			return 100;
		case 'L':
			return 50;
		case 'X':
			return 10;
		case 'V':
			return 5;
		case 'I':
			return 1;
		}
		return 0;
	}

}
