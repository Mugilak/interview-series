package com.interview.crm;

import java.util.Scanner;

public class Program1 {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Program1().getInput();
	}

	private void getInput() {
		System.out.println("Enter n:");
		int n = input.nextInt();
		int[] array = new int[n];
		boolean found = false;
		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		findRepeating(n, array);
	}

	private void findRepeating(int n, int[] array) {
//		int count = 0;
//		int visit[] = new int[n];
//		for (int i = 0; i < n; i++) {
//			count = 0;
//			if (array[i] != Integer.MAX_VALUE) {
//				for (int j = i + 1; j < n; j++) {
//					if (array[i] == array[j]) {
//						count++;
//						array[j] = Integer.MAX_VALUE;
//					}
//				}
//			}
//			if (count > 0) {
//				System.out.print(array[i] + " ");
//			}
//		}
		int j = 0;
		for (int i = 1; i < n; i++) {
			if (array[i] != array[j]) {
				j++;
				array[j] = array[i];
			}
		}
		for (int i = j + 1; i < n; i++) {
			System.out.print(array[i] + " ");
		}

//		int i = 0;
//		for (int j = i + 1; i < n && j < n; j++) {
//			if (array[i] == array[j]) {
//				array[i] = Integer.MAX_VALUE;
//				visit[j] = -1;
//				i++;
//				j = i;
//			}
//			if (visit[i] != -1 && j == n - 1) {
//				array[i] = Integer.MAX_VALUE;
//				i++;
//				j = i + 1;
//			}
//		}
//		for (int k = 0; k < n; k++) {
//			if (array[k] != Integer.MAX_VALUE) {
//				System.out.print(array[k] + " ");
//			}
//		}
	}
}
