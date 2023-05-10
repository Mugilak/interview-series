package com.zohosets.set13;

import java.util.Scanner;

//You’re given a number n. If write all the numbers from 1 to n in a paper, we have to find the number of characters written on the paper.
//For example if n=13, the output should be 18 if n = 101, the output should be 195

public class CountingCharacters {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new CountingCharacters().getInput();
	}

	private void getInput() {
		System.out.println("Enter number :");
		int number = input.nextInt();
		countTotalNumbers(number);
	}

	private void countTotalNumbers(int number) {
		int count = 0, i = 1, divide = 9;
		while (number > divide) {
			number -= divide;
			count += i * divide;
			divide *= 10;
			i++;
		}
		count += i * number;
		System.out.println(count);
	}

}
