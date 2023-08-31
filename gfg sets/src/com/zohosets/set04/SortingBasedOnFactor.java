package com.zohosets.set04;

//To find the factors of the numbers given in an array and to sort the numbers in descending order 
//according to the factors present in it.
//Input:
//Given array : 8, 2, 3, 12, 16
//Output:
//12, 16, 8, 2, 3

public class SortingBasedOnFactor {

	public static void main(String[] args) {
		new SortingBasedOnFactor().getInput();
	}

	private void getInput() {
		int[] array = { 8, 2, 3, 12, 16 };
		int[] factors = new int[array.length];
		findFactors(array, factors);
		sortBasedOnFactors(array, factors);
		print(array);
	}

	private void print(int[] array) {
		for(int value: array) {
			System.out.print(value+" ");
		}
	}

	private void sortBasedOnFactors(int[] array, int[] factors) {
		int max = 0, temp;
		for (int i = 0; i < array.length-1; i++) {
			max = i;
			for (int j = i+1; j < array.length; j++) {
				if (factors[max] < factors[j]) {
					max = j;
				}
			}
			if (max != i) {
				temp = array[i];
				array[i] = array[max];
				array[max] = temp;
				temp = factors[i];
				factors[i] = factors[max];
				factors[max] = temp;
			}
		}
	}

	private void findFactors(int[] array, int[] factors) {
		int factor = 0;
		for (int i = 0; i < array.length; i++) {
			factor = 0;
			for (int j = 2; j <= array[i]/2; j++) {
				if (array[i] % j == 0) {
					factor++;
				}
			}
			factors[i] = factor;
		}
	}

}
