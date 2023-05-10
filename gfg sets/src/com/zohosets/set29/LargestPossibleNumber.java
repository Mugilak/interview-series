package com.zohosets.set29;

import java.util.Arrays;
import java.util.Scanner;

//Input: 
//N = 5
//Arr[] = {3, 30, 34, 5, 9}
//Output: 9534330
//Explanation: Given numbers are {3, 30, 34,
//5, 9}, the arrangement 9534330 gives the
//largest value.

public class LargestPossibleNumber {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new LargestPossibleNumber().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int size = input.nextInt();
		System.out.println("Enter array elements: ");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		Largest(size, array);
		printArray(array);
	}

	private void printArray(int[] array) {
		for (int value : array) {
			System.out.print(value);
		}
	}

	private void Largest(int size, int[] array) {
		String v1 = "", v2 = "";
		int temp;
		for (int i = 1; i < size; i++) {
			for (int j = i; j > 0; j--) {
				v1 = array[j - 1] + "" + array[j];
				v2 = array[j] + "" + array[j - 1];
				if (compare(v1, v2) < 0) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}

	private int compare(String v1, String v2) {
		int n1 = getNumber(v1.toCharArray());
		int n2 = getNumber(v2.toCharArray());
		if (n1 < n2) {
			return -1;
		}
		if (n1 > n2) {
			return 1;
		}
		return 0;
	}

	private int getNumber(char[] number) {
		int num = 0;
		for (int i = 0; i < number.length; i++) {
			num = (num * 10) + (number[i] - '0');
		}
		return num;
	}

}
