package com.zohosets.set10;

import java.util.ArrayList;
import java.util.List;

//Given a sliding window of size k print the maximum of the numbers under the sliding window.
//Example: Consider a sliding window of size k equals 3. Let the array be [3,2,7,6,5,1,2,3,4] 
//		the output should print 7 as the first output as first window contains {3,2,7} and 
//		second window contains {2,7,6} and so on and the final output is {7,7,7,6,5,3,4}

public class MaximumInSlideWindow {

	public static void main(String[] args) {
		new MaximumInSlideWindow().getInput();
	}

	private void getInput() {
		int[] array = { 3, 2, 7, 6, 5, 1, 2, 3, 4 };
		int k = 3;
		List<Integer> max = findMaximums(array, k);
		max.forEach(x -> System.out.println(x));
	}

	private List<Integer> findMaximums(int[] array, int k) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= array.length - k; i++) {
			int j = i + 1, max = array[i];
			while (j < i + k) {
				if (max < array[j]) {
					max = array[j];
				}
				j++;
			}
			list.add(max);
		}
		return list;
	}

}
