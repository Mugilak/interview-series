package com.interview.crm;

import java.util.Scanner;

public class Program2 {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Program2().getInput();
	}

	private void getInput() {
		System.out.println("Enter String:");
		String n = input.nextLine();
		char[] array = n.toCharArray();
		findRepeating(array.length, array);
	}

	private void findRepeating(int n, char[] array) {
//		for (int i = 0; i < n; i++) {
//			if (array[i] != '*') {
//				for (int j = i + 1; j < n; j++) {
//					if (array[i] == array[j]) {
//						array[j] = '*';
//					}
//				}
//
//				System.out.print(array[i]);
//			}
//		}
		int i = 0;
		for (int j = i + 1; i < n && j < n; j++) {
			if (array[i] != '*') {
				if (array[i] == array[j]) {
					array[j] = '*';
					i++;
					j = i;
				}
			}
			if (array[i] != '*' && j == n - 1) {
				i++;
				j = i + 1;
			}
		}
		for (int k = 0; k < n; k++) {
			if (array[k] != '*') {
				System.out.print(array[k]);
			}
		}
	}

}
