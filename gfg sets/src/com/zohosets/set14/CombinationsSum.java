package com.zohosets.set14;

import java.util.Scanner;

public class CombinationsSum {
	private Scanner input = new Scanner(System.in);
	int sum = 0;

	public static void main(String[] args) {
		new CombinationsSum().getInput();
	}

	private void getInput() {
		System.out.println("Enter String :");
		String word = input.nextLine();
		for (int range = 1; range <= word.length(); range++) {
			findCombination(word.toCharArray(), 0, 0, 0, range);
		}
//		System.out.println(sum);
	}

	private void findCombination(char[] array, int num, int start, int index, int range) {
		int n = array.length;
		if (index == range) {
			reverseAndAdd(num);
			add(num);
			return;
		}
		int value = 0;
		for (int i = start; i < n; i++) {
			value = (num * 10) + (int) (array[i] - '0');
			findCombination(array, value, i + 1, index + 1, range);
		}
	}

	private void reverseAndAdd(int num) {
		int count = 0, reverse = 0;
		sum += num;
		while (num > 0) {
			reverse = reverse * 10 + (num % 10);
			num /= 10;
			count++;
		}
		if (count > 1) {
			sum += reverse;
		}
	}

	private void add(int num) {
		sum += num;
	}

}
