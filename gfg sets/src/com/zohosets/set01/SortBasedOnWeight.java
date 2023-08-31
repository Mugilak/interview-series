package com.zohosets.set01;

//2. Given a set of numbers like <10, 36, 54,89,12> we want to find sum of weights based on the following conditions
//1. 5 if a perfect square
//2. 4 if multiple of 4 and divisible by 6
//3. 3 if even number
//
//And sort the numbers based on the weight and print it as follows
//<10,its_weight>,<36,its weight><89,its weight>
//
//Should display the numbers based on increasing order.

public class SortBasedOnWeight {

	public static void main(String[] args) {
		new SortBasedOnWeight().getInput();
	}

	private void getInput() {
		int[] array = { 10, 36, 54, 89, 12 };
		int[] weights = new int[array.length];
		if (array.length <= 0) {
			return;
		}
		findWeights(array, weights);
		sortBasedOnWeight(array, weights);
		print(array, weights);
	}

	private void print(int[] array, int[] weights) {
		for (int i = 0; i < weights.length; i++) {
			System.out.print("<" + array[i] + " , " + weights[i] + ">");
			if (i < array.length - 1) {
				System.out.print(",");
			}
			System.out.printf("%2s", "");
		}
	}

	private void sortBasedOnWeight(int[] array, int[] weights) {
		int temp;
		for (int i = 0; i < weights.length; i++) {
			int j = i;
			while (j >= 0 && j - 1 >= 0 && weights[j] > weights[j - 1]) {
				temp = weights[j];
				weights[j] = weights[j - 1];
				weights[j - 1] = temp;
				temp = array[j];
				array[j] = array[j - 1];
				array[j - 1] = temp;
				j--;
			}
		}
	}

	private void findWeights(int[] array, int[] weights) {
		int weight;
		for (int i = 0; i < array.length; i++) {
			weight = 0;
			if (array[i] % 2 == 0) {
				weight += 3;
			}
			if (array[i] % 6 == 0 && array[i] % 4 == 0) {
				weight += 4;
			}
			if (isPerfectSquare(array[i])) {
				weight += 5;
			}
			weights[i] = weight;
		}
	}

	private boolean isPerfectSquare(int number) {
		double value = Math.sqrt(number);
		int val = (int) value;
		if (val * val == number) {
			return true;
		}
		return false;
	}

}
