package com.interview.flow;

import java.util.Scanner;

//1.next greater in given Array
//Input  : [16 17 4 3 5 2]
//Output : [17,5,2].

public class NextGreaterElement {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new NextGreaterElement().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int size = input.nextInt();
		System.out.println("Enter array elements: ");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
			if (i != 0 && array[i] > array[i - 1]) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
