package com.zohosets.set10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MergingArrays {

	public static void main(String[] args) {
		new MergingArrays().start();
	}

	private void start() {
		int a1[] = { 1, 8 };
		int[] a2 = { 9, 16 };
		int n = a1.length, m = a2.length;
		int answer[] = new int[6];
		int k = mergeNsort(a1, a2, n, m);
		boolean check = true;
		int len = 0;
		for (int i = 0; len < k; i++) {
			if (i == n) {
				i = 0;
				check = false;
			}
			if (check && i < n) {
				len++;
				System.out.print(a1[i] + " ");
			} else if (i < m) {
				len++;
				System.out.print(a2[i] + " ");
			}
		}
	}

	public int mergeNsort(int a[], int b[], int n, int m) {
		Set<Integer> set = new TreeSet<>();
		for (int v : a) {
			set.add(v);
		}
		for (int v : b) {
			set.add(v);
		}
		boolean check = true;
		int i = 0, len = 0;
		for (int v : set) {
			if (i == n) {
				len = n;
				i = 0;
				check = false;
			}
			if (check && i < n) {
				a[i] = v;
			} else if (i < m) {
				b[i] = v;
			}
			i++;
		}
		return len + i;
	}

}
