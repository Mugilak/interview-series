package com.zohosets.set27;

//Find the extra element and its index
//
//Input : [ 10, 20, 30, 12, 5 ]
//    [ 10, 5, 30, 20 ]
//Output : 12 is the extra element in array 1 at index 4
//
//Input : [ -1, 0, 3, 2 ]
//    [ 3, 4, 0, -1, 2 ]
//Output : 4 is the extra element in array 3 at index 5

public class ExtraElement {

	public static void main(String[] args) {
		new ExtraElement().getInput();
	}

	private void getInput() {
		int n = 5, m = 4;
		int a[] = { 10, 20, 30, 12, 5 }, b[] = { 10, 5, 30, 20 };
//		int n = 4, m = 5, a[] = { -1, 0, 3, 2 }, b[] = { 3, 4, 0, -1, 2 };
//		sortArray(a, n);
//		sortArray(b, m);
		findExtraElement(n, m, a, b);
	}

	private void findExtraElement(int n, int m, int[] a, int[] b) {
		int maxLen = (n < m) ? m : n, sum1 = 0, sum2 = 0;
		for (int i = 0; i < maxLen; i++) {
			if (i < n)
				sum1 += a[i];
			if (i < m)
				sum2 += b[i];
		}
		if (((sum1 > 0) ? sum1 : -1 * sum1) > ((sum2 > 0) ? sum2 : -1 * sum2)) {
			System.out.println(sum1 - sum2 + " is the extra element in array 1 at index " + search(a, n, sum1 - sum2));
		} else {
			System.out.println(sum2 - sum1 + " is the extra element in array 2 at index " + search(b, m, sum2 - sum1));
		}
	}

	private int search(int[] array, int length, int searchElement) {
		for (int i = 0; i < length; i++) {
			if (array[i] == searchElement) {
				return i+1;
			}
		}
		return -1;
	}

	private void findExtraElementWithSort(int n, int m, int[] a, int[] b) {
		int sum1 = 0, sum2 = 0, index = n - 1, maxLen = (n < m) ? m : n;
		boolean found = true;
		for (int i = 0; i < maxLen; i++) {
			if (i < n)
				sum1 += a[i];
			if (i < m)
				sum2 += b[i];
			if (found && sum1 != sum2) {
				index = i;
			}
		}
		if (sum1 - sum2 > 0) {
			System.out.println(sum1 - sum2 + " is the extra element in array 1 at index " + index);
		} else
			System.out.println(-1 * (sum1 - sum2) + " is the extra element in array 2 at index " + index);
	}

	private void sortArray(int[] array, int len) {
		int min = 0, temp;
		for (int i = 0; i < len; i++) {
			min = i;
			for (int j = 0; j < len; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			if (min != i) {
				temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}
		}
	}

}
