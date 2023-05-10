package com.zohosets.set12;

import java.util.Scanner;

//i/p {5,8,10,13,6,2};threshold = 3;
//o/p  count = 17
//explanation:
//Number	parts	            counts
//5	            {3,2}                 2
//8                      {3,3,2}              3
//10                    {3,3,3,1}           4
//13                    {3,3,3,3,1}        5
//6                      {3,3}                 2
//2                      {2}                    1

public class FindingOutputForThreshold {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new FindingOutputForThreshold().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt();
		System.out.println("Enter elements : ");
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Enter threshold : ");
		int k = input.nextInt();
		findCounts(n, array, k);
	}

	private void findCounts(int n, int[] array, int k) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			count += getUsedCounts(array[i], k);
		}
		System.out.println(count);
	}

	private int getUsedCounts(int number, int k) {
		int count = 0;
		while (number > 0) {
			if (number < k) {
				number = 0;
			} else {
				number -= k;
			}
			count++;
		}
		return count;
	}
}
