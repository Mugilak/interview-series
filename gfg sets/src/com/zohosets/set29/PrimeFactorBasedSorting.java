package com.zohosets.set29;

import java.util.Scanner;

//prime factor – sort the array based on the minimum factor they have.

public class PrimeFactorBasedSorting {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new PrimeFactorBasedSorting().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int size = input.nextInt();
		System.out.println("Enter array elements: ");
		int[] array = new int[size];
		int[] primeFactors = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
			primeFactors[i] = findPrimeFactorsCount(array[i]);
		}
		sortBasedOnPrimeFactors(primeFactors, array, size);
		printArray(array, primeFactors);
	}

	private void printArray(int[] array, int[] primeFactors) {
		for (int value : array) {
			System.out.print(value + " ");
		}
		System.out.println("\nprimeFactors : ");
		for (int value : primeFactors) {
			System.out.print(value + " ");
		}
	}

	private void sortBasedOnPrimeFactors(int[] primeFactors, int[] array, int size) {
		int min = 0, temp;
		for (int i = 0; i < size; i++) {
			min = i;
			for (int j = i + 1; j < size; j++) {
				if (primeFactors[j] < primeFactors[min]) {
					min = j;
				}
			}
			temp = primeFactors[i];
			primeFactors[i] = primeFactors[min];
			primeFactors[min] = temp;
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
	}

	private int findPrimeFactorsCount(int number) {
		int primeFactors = 0;
//		while (number % 2 == 0) {
//			primeFactors++;
//			number /= 2;
//		}
		for (int i = 2; i <= number; i += 1) {
			while (number % i == 0) {
				System.out.print(i + " ");
				primeFactors++;
				number /= i;
			}
		}
		System.out.println("\n" + primeFactors);
		return primeFactors;
	}

}
