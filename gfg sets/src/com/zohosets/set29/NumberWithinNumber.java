package com.zohosets.set29;

import java.util.Scanner;

//Check if a number ‘a’ is present in another number ‘b
//Enter first Number : 
//53834
//Enter Second number : 
//383
//true

public class NumberWithinNumber {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new NumberWithinNumber().getInput();
	}

	private void getInput() {
		System.out.println("Enter first Number : ");
		int number = input.nextInt();
		System.out.println("Enter Second number : ");
		int number2 = input.nextInt();
		System.out.println(isNumberPresent(number, number2));
	}

	private boolean isNumberPresent(int number, int number2) {
		int count = 0, size = getSize(number2), answer = 0, digit, j = 1;
		while (number > 0) {
			digit = number % 10;
			answer = (digit * j) + answer;
			j *= 10;
			number /= 10;
			count++;
			if (count == size) {
				break;
			}
		}
		if (answer == number2) {
			return true;
		}
		while (number > 0) {
			digit = number % 10;
			answer = (digit * j) + answer;
			j *= 10;
			answer /= 10;
			if (number2 == answer) {
				return true;
			}
			number /= 10;
		}
		return false;
	}

	private int getSize(int number) {
		if (number == 0) {
			return 1;
		}
		int size = 0;
		while (number > 0) {
			size++;
			number /= 10;
		}
		return size;
	}

}
