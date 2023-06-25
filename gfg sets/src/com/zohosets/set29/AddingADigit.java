package com.zohosets.set29;

import java.util.Scanner;

// adding a digit to all the digits of a number eg digit=4, number = 2875, o/p= 612119.

public class AddingADigit {

	public static void main(String[] args) {
		new AddingADigit().getInput();
	}

	private void getInput() {
		int number = 2875;
//		number = reverse(number);
		int digit = 4;
		addByDigit(number, digit);
	}

	private void addByDigit(int number, int digit) {
		int value, i = 1, answer = 0, temp, newDigit;
		while (number > 0) {
			value = (number % 10) + digit;
			if (((i + "").length() < ((value + "" + answer).length())) || i != 1) {
				temp = value;
				while (temp > 0) {
					newDigit = temp % 10;
					answer = (newDigit * i) + answer;
					i *= 10;
					temp /= 10;
				}
			} else {
				answer = (value * i) + answer;
				i *= 10;
			}
			number /= 10;
		}
		System.out.print(answer);
	}

	private int reverse(int number) {
		int reverse = 0, digit = 0;
		while (number > 0) {
			digit = number % 10;
			reverse = (reverse * 10) + digit;
			number /= 10;
		}
		return reverse;
	}

}
