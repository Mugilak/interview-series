package com.interview.crm;

import java.util.Scanner;

public class Program3 {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Program3().getInput();
	}

	private void getInput() {
		System.out.println("Enter n:");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements : ");
		int max = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
			if (max < array[i]) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(max - min);
	}
}
