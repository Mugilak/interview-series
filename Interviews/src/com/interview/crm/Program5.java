package com.interview.crm;

import java.util.Scanner;

public class Program5 {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Program5().getInput();
	}

	private void getInput() {
		System.out.println("Enter n:");
		String n = input.nextLine();
		char[] arr = n.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0') {
				arr[i] = '1';
			} else if (arr[i] == '1') {
				arr[i] = '0';
			}
		}
		int sum = 0, num = 1, k = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			sum += ((arr[i] - '0') * num);
			num = 2 * k;
			k++;
		}
		System.out.print(sum+" ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
}
