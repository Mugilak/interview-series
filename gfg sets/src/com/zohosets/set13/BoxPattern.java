package com.zohosets.set13;

import java.util.Scanner;

public class BoxPattern {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new BoxPattern().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt();
		printPattern(n);
	}

	private void printPattern(int n) {
		int value1 = 0, value2 = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				value1 = (i - n) < 0 ? -1 * (i - n) : i - n;
				value2 = (j - n) < 0 ? -1 * (j - n) : j - n;
				if ((j + i) <= n)
					System.out.print(value1 < value2 ? value2 + 1 + " " : value1 + 1 + " ");
				else {
					value1 = i;
					value2 = j;
					System.out.print(value1 < value2 ? value2 + " " : value1 + " ");
				}
			}
			System.out.println();
		}
	}
}
