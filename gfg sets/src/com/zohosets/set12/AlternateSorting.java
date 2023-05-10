package com.zohosets.set12;

import java.util.Scanner;

//2.Alternately sort an unsorted array..
//
//eg) i/p {5,2,8,7,4,3,9}
//      o/p {9,2,8,3,7,4,5}

public class AlternateSorting {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new AlternateSorting().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt();
		System.out.println("Enter elements : ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		sortAlternatively(n, array);
		printArray(array);
	}

	private void printArray(int[] array) {
		for (int value : array) {
			System.out.print(value + " ");
		}
	}

	private void sortAlternatively(int n, int[] array) {
		int min = Integer.MAX_VALUE, max = 0, temp = 0;
		for (int i = 0; i < n; i++) {
			max = i;
			min = i;
			for (int j = i + 2; j < n; j += 2) {
				if (i % 2 == 0) {
					if (array[max] < array[j]) {
						max = j;
					}
				} else {
					if (array[j] < array[min]) {
						min = j;
					}
				}
			}
			if (i % 2 == 0) {
				temp = array[max];
				array[max] = array[i];
				array[i] = temp;
			} else {
				temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}
		}
	}

}
