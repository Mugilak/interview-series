package com.zohosets.set29;

import java.util.Scanner;

// adding a digit to all the digits of a number eg digit=4, number = 2875, o/p= 612119.

public class AddingADigit {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new AddingADigit().getInput();
	}

	private void getInput() {
		System.out.println("Enter Number : ");
		int number = input.nextInt();
		number = reverse(number);
		System.out.println("Enter a digit : ");
		int digit = input.nextInt();
		addByDigit(number, digit);
	}

	private void addByDigit(int number, int digit) {
		int eachDigit = 0;
		while (number > 0) {
			eachDigit = number % 10;
			System.out.print(eachDigit + digit);
			number /= 10;
		}
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
