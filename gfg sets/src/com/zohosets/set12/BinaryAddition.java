package com.zohosets.set12;

import java.util.Scanner;

public class BinaryAddition{
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new BinaryAddition().getInput();
	}

	private void getInput() {
		System.out.println("Enter a : ");
		int a = input.nextInt();
		System.out.println("Enter b : ");
		int b = input.nextInt();
		Add(a, b);
	}

	private void Add(int a, int b) {
		int carry = 0, sum = 0, digit1 = 0, digit2 = 0, answer = 0, i = 1;
		while (a > 0 || b > 0) {
			digit1 = (a > 0) ? a % 10 : 0;
			a /= 10;
			digit2 = (b > 0) ? b % 10 : 0;
			b /= 10;
			sum = digit1 + digit2 + carry;
			carry = sum / 2;
			answer = (sum % 2) * i + answer;
			i *= 10;
		}
		digit2 = (a > 0) ? a % 10 : 0;
		digit2 = (b > 0) ? b % 10 : 0;
		sum = digit1 + digit2 + carry;
		answer = (sum % 2) * i + answer;
		System.out.println(answer);
	}

}
