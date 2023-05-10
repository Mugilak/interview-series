package com.zohosets.set12;

import java.util.Scanner;

//1.Given two numbers a and b both < 200 we have to find the square numbers which lie between a and b(inclusive)
//
//eg) i/p a = 20;b = 100;
//      o/p 25,36,49,64,81,100

public class FindingSquareNumbers {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new FindingSquareNumbers().getInput();
	}

	private void getInput() {
		System.out.print("a = ");
		int a = input.nextInt();
		System.out.print("b = ");
		int b = input.nextInt();
		findSquareNumbersInRange(a, b);
	}

	private void findSquareNumbersInRange(int start, int end) {
		for (int number = start; number <= end; number++) {
			if (isPerfectSquare(number)) {
				System.out.print(number + " ");
			}
		}
	}

	private boolean isPerfectSquare(int number) {
		for (int i = 1; i < number / 2; i++) {
			if (number % i == 0) {
				if (number / i == i) {
					return true;
				}
			}
		}
		return false;
	}

}
