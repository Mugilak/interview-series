package com.interview.crm;

import java.util.Scanner;

public class NextLargestNumber {
	private Scanner input = new Scanner(System.in);
	private char array[];

	public static void main(String[] args) {
		new NextLargestNumber().getInput();
	}

	private void getInput() {
		try {
			System.out.println("Enter input string : ");
			String string = input.nextLine();
			array = string.toCharArray();
			nextLargest(array);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input");
		}
	}

	public void nextLargest(char[] nums) {
		int i = nums.length - 2;
		while (i >= 0 && nums[i + 1] - '0' <= nums[i] - '0') {
			i--;
		}
		if (i >= 0) {
			int j = nums.length - 1;
			while (nums[j] - '0' <= nums[i] - '0') {
				j--;
			}
			swap(nums, i, j);
		}
		if (i < 0) {
			System.out.println("NOT POSSIBLE");
			return;
		} else {
			reverse(nums, i + 1);
			print(nums);
		}
	}

	private void print(char[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (i == nums.length - 1)
				System.out.print(nums[i] + " ");
			else
				System.out.print(nums[i] + "");
		}
	}

	private void reverse(char[] nums, int start) {
		int i = start, j = nums.length - 1;
		while (i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}
	}

	private void swap(char[] nums, int i, int j) {
		char temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private void sort(int j, int i, char[] array) {
		for (int k = j; k <= i; k++) {
			for (int l = k + 1; l <= i; l++) {
				if (array[l] < array[k]) {
					char temp = array[l];
					array[l] = array[k];
					array[k] = temp;
				}
			}
		}
	}

	private long toValue(char[] array) {
		long value = 10, ans = 0;
		for (int i = 0; i < array.length; i++) {
			ans = value * ans + (long) (array[i] - '0');
		}
		return ans;
	}

}
