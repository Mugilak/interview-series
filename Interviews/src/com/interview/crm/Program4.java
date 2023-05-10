package com.interview.crm;

import java.util.Scanner;

public class Program4 {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Program4().getInput();
	}

	private void getInput() {
		System.out.println("Enter n:");
		int n = input.nextInt();
		int[] array = new int[n];
		int[] array2 = new int[n];
		System.out.println("Enter array 1 elements : ");
		int min = Integer.MAX_VALUE, min2, index = 0;
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
			if (array[i] < min) {
				min = array[i];
				index = i;
			}
		}
		min2 = Integer.MAX_VALUE;
		System.out.println("Enter array 2 elements : ");
		for (int j = 0; j < n; j++) {
			array2[j] = input.nextInt();
			if (j != index && array2[j] < min2) {
				min2 = array2[j];
			}
		}
		System.out.println(min + " " + min2);
	}

}
