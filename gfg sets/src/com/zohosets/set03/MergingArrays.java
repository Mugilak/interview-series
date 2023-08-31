package com.zohosets.set03;

//Given two sorted arrays, merge them such that the elements are not repeated
//Eg 1: Input:
//        Array 1: 2,4,5,6,7,9,10,13
//        Array 2: 2,3,4,5,6,7,8,9,11,15
//       Output:
//       Merged array: 2,3,4,5,6,7,8,9,10,11,13,15

public class MergingArrays {

	public static void main(String[] args) {
		new MergingArrays().getInput();
	}

	private void getInput() {
		int array1[] = { 2, 4, 5, 6, 7, 9, 10, 13 }, array2[] = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };
		mergeArrays(array1, array2);
	}

	private void mergeArrays(int[] array1, int[] array2) {
		int i = 0, j = 0;
		while (i < array1.length && j < array2.length) {
			if (array1[i] < array2[j]) {
				System.out.print(array1[i++]+" ");
			} else if (array2[j] < array1[i]) {
				System.out.print(array2[j++]+" ");
			} else {
				j++;
			}
		}
		while (i < array1.length) {
			System.out.print(array1[i++]+" ");
		}
		while (j < array2.length) {
			System.out.print(array2[j++]+" ");
		}
	}

}
