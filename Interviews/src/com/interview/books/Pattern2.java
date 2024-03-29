package com.interview.books;

public class Pattern2 {
	public static void main(String args[]) {
		int n = 5;
		new Pattern2().print(n);
	}

	public void print(int n) {
		int len = (n + " ").length();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j) < n) {
					System.out.printf("%" + len + "d", (i + j + 1));
				} else {
					System.out.printf("%" + len + "d", ((i + j + 1) % n));
				}
			}
			System.out.println();
		}
	}
}
