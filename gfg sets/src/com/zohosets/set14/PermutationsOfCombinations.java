package com.zohosets.set14;

import java.util.Scanner;

public class PermutationsOfCombinations {
	private Scanner input = new Scanner(System.in);
	int sum = 0;

	public static void main(String[] args) {
		new PermutationsOfCombinations().getInput();
	}

	private void getInput() {
		System.out.println("Enter String :");
		String word = input.nextLine();
		for (int range = 1; range <= word.length(); range++)
			findCombinations(word.toCharArray(), "", 0, 0, range);
	}

	private void findCombinations(char[] array, String answer, int start, int index, int range) {
		int n = array.length;
		if (index == range) {
			findPermutations(answer.toCharArray(), 0);
		}
		String value = "";
		for (int i = start; i < n; i++) {
			value = answer+array[i];
			findCombinations(array, value, i + 1, index + 1, range);
		}
	}

	private void findPermutations(char[] array, int index) {
		int n = array.length;
		if (index == n) {
			PrintArray(array);
			return;
		}
		for (int i = index; i < n; i++) {
			swap(array, i, index);
			findPermutations(array, index + 1);
			swap(array, i, index);
		}
	}

	private void swap(char[] array, int i, int index) {
		char temp = array[i];
		array[i] = array[index];
		array[index] = temp;
	}

	private void PrintArray(char[] array) {
		for (char value : array) {
			System.out.print(value);
		}
		System.out.println();
	}

}
