package com.interview.books;

import java.util.*;

public class FibonaciSequenceSum {

	// Function to find the subsequences
	// with given sum
	public static void subSequenceSum(Set<ArrayList<Integer>> ans, int a[], ArrayList<Integer> temp, int k, int start) {
		if (start > a.length || k < 0)
			return;
		if (k == 0) {
			ans.add(new ArrayList<Integer>(temp));
			return;
		} else {
			for (int i = start; i < a.length; i++) {
				temp.add(a[i]);
				subSequenceSum(ans, a, temp, k - a[i], i + 1);
				temp.remove(temp.size() - 1);
			}
		}
	}

	public static void main(String args[]) {
		int arr[] = { 5, 12, 2, 3, 17, 1, 18, 15, 3, 17 };
		int k = 20;
		Set<ArrayList<Integer>> ans;
		ans = new HashSet<ArrayList<Integer>>();
		subSequenceSum(ans, arr, new ArrayList<Integer>(), k, 0);

		// Loop to print the subsequences
		if (ans.size() == 0) {
			System.out.println("Not found!");
			return;
		}
		for (ArrayList<Integer> a : ans) {
			for (Integer v : a) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
	}
}

//public class FibonaciSequenceSum {
//	public static void main(String[] args) {
//		System.out.println(Math.round(Math.pow(1.618033988749895, 7) / (Math.sqrt(5))));
//		int targetSum = 10;
//		int[] fibonacciNumbers = findLongestFibonacciSumSequence(targetSum);
//
//		if (fibonacciNumbers != null) {
//			System.out.print("Longest Fibonacci sequence that sums to " + targetSum + ": ");
//			for (int num : fibonacciNumbers) {
//				System.out.print(num + " ");
//			}
//		} else {
//			System.out.println("No Fibonacci sequence found for the given sum.");
//		}
//	}
//
//	public static int[] findLongestFibonacciSumSequence(int targetSum) {
//		int[] longestSequence = {};
//		int longestLength = 0;
//
//		int a = 0, b = 1;
//		int sum = a + b;
//
//		while (sum <= targetSum) {
//			int c = a + b;
//			if (sum + c == targetSum) {
//				int[] sequence = findFibonacciSumSequence(targetSum, c);
//				if (sequence.length > longestLength) {
//					longestLength = sequence.length;
//					longestSequence = sequence;
//				}
//
//			}
//			a = b;
//			b = c;
//			sum += c;
//		}
//
//		return longestSequence.length > 0 ? longestSequence : null;
//	}
//
//	public static int[] findFibonacciSumSequence(int targetSum, int start) {
//		List<Integer> sequence = new ArrayList<>();
//		int a = 0, b = start;
//		int sum = start;
//		sequence.add(b);
//
//		while (sum <= targetSum) {
//			int c = a + b;
//			if (sum + c <= targetSum) {
//				sequence.add(c);
//				a = b;
//				b = c;
//				sum += c;
//			} else {
//				break;
//			}
//		}
//
//		return sequence.stream().mapToInt(Integer::intValue).toArray();
//	}
//}
