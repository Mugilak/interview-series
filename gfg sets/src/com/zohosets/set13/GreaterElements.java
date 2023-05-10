package com.zohosets.set13;

import java.util.Scanner;

//You’re given an array. Print the elements of the array which are greater than its previous elements in the array.
//Input : 2 -3 -4 5 9 7 8    Output: 2 5 9

public class GreaterElements {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new GreaterElements().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt(), max = 0, value = 0;
		System.out.println("Enter elements : ");
		for (int i = 0; i < n; i++) {
			value = input.nextInt();
			if (max < value) {
				max = value;
				System.out.print(max + " ");
			}
		}
	}

}
