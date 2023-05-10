package com.zohosets.set13;

import java.util.Scanner;

//A number is called as binary-decimal if all the digits in the number should be either ‘1’ or ‘0’.
//Any number can be written as a sum of binary-decimals. 
//Our task is to find the minimum number of binary-decimals to represent a number.
//Input : 32 Output : 10 11 11
//Input : 120
//Output : 10 110

public class BinaryDecimal {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new BinaryDecimal().getInput();
	}

	private void getInput() {
		System.out.println("Enter number :");
		int number = input.nextInt();
		int max = findMax(number);
		findBinaries(number, max);
	}

	private int findMax(int number) {
		int max = 0;
		while (number > 0) {
			if (max < number % 10) {
				max = number % 10;
			}
			number /= 10;
		}
		return max;
	}

	private void findBinaries(int number, int max) {
		int digit = 0, n = number, temp = 0, k = 1, answer = 0;
		while (max > 0) {
			temp = 0;
			k = 1;
			answer = 0;
			while (n > 0) {
				digit = n % 10;
				if (digit == 0) {
					answer = digit * k + answer;
				} else if (digit > 0) {
					answer = 1 * k + answer;
					digit -= 1;
				}
				temp = digit * k + temp;
				k *= 10;
				n /= 10;
			}
			n = temp;
			System.out.println(answer);
			max--;
		}
	}
}
