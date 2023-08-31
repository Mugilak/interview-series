package com.zohosets.set09;

import java.util.Arrays;

//Given an array of integers, replace every element with the next greatest element (greatest element on the right side)
//in the array. Since there is no element next to the last element, replace it with -1. 
//For example, if the array is {16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}. 

public class NextGreatestElementFilling {
	int array[] = { 16, 17, 4, 3, 5, 2 };

	public static void main(String[] args) {
		new NextGreatestElementFilling().getInput();
	}

	private void getInput() {
		fillWithNextGreatest(array);
		System.out.println(Arrays.toString(array));
	}

	private void fillWithNextGreatest(int[] array) {
		int max = -1, temp;
		for (int i = array.length - 1; i >= 0; i--) {
			temp = array[i];
			if (temp < max)
				array[i] = max;
			else
				array[i] = -1;
			if (max < temp)
				max = temp;

		}
	}

}
