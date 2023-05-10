package com.zohosets.set35;

import java.util.Scanner;

public class RepeatedElements {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new RepeatedElements().getInput();
	}

	private void getInput() {
//		System.out.println("Enter size : ");
//		int size = input.nextInt();
//		System.out.println("Enter array elements : ");
//		int[] array = new int[size];
//		for (int i = 0; i < size; i++) {
//			array[i] = input.nextInt();
//		}
		int []array = {1, 2, 45, 67, 1, 88};
		findRepeatedElements(array.length, array);
	}

	private void findRepeatedElements(int size, int[] array) {
		int count = 0;
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			count = 1;
			if (array[i] != Integer.MAX_VALUE) {
				for (int j = i + 1; j < size; j++) {
					if (array[i] == array[j]) {
						count++;
						array[j] = Integer.MAX_VALUE;
					}
				}
				list.insertAtLast(count);
			}
		}
		printArray(array, list);
	}

	private void printArray(int[] array, LinkedList<Integer> list) {
		int i = 0;
		for (int value : array) {
			if (value != Integer.MAX_VALUE) {
				System.out.println(value + " - " + list.get(i++));
			}
		}
	}

}
