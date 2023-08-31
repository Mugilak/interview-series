package com.zohosets.set04;

import java.util.*;

//To find the number of groups and output the groups:
//Explanation: To find the sum of the elements in the groups and that sum should be divisible by input X 
//and the groups should be limited to range with X numbers.
//If X is 3, then the group should have only 2 elements and 3 elements from the array whose sum is divisible by 3.
//Input:
//Array: 3, 9, 7, 4, 6, 8
//X: 3
//Output:
//3, 9
//3, 6
//9, 6
//3, 9, 6
//No of groups: 4

public class SubsequenceSum {
	Set<List<Integer>> set = new LinkedHashSet<>();

	public static void main(String[] args) {
		new SubsequenceSum().getInput();
	}

	private void getInput() {
		int array[] = { 7, 1, 5, 6, 3, 2 };
//		int array[] = { 3, 9, 7, 4, 6, 8 };
		int x = 3;
		findGroups(array, x);
	}

	private void findGroups(int[] array, int x) {
		for (int range = 2; range <array.length; range++) {
			for (int i = 0; i < array.length; i++) {
				List<Integer> list = new ArrayList<>();
				list.add(array[i]);
				findSum(array, range, x, 1, i + 1, list);
			}
		}
		printGroups();
	}

	private void printGroups() {
		System.out.println("No of groups : " + set.size());
		for (List<Integer> l : set) {
			System.out.println(l);
		}
	}

	private void findSum(int[] array, int range, int divisor, int count, int index, List<Integer> list) {
		if (count == range) {
			if (isDivisibleSum(list, divisor)) {
				set.add(new ArrayList<>(list));
				return;
			} else {
				return;
			}
		} else if (index == array.length) {
			return;
		} else {
			for (int i = index; i < array.length; i++) {
				list.add(array[i]);
				findSum(array, range, divisor, count + 1, i + 1, list);
				list.remove(list.size() - 1);
			}
		}
	}

	private boolean isDivisibleSum(List<Integer> list, int divisor) {
		int sum = 0;
		for (int v : list) {
			sum += v;
		}
		return (sum % divisor == 0) ? true : false;
	}

}
