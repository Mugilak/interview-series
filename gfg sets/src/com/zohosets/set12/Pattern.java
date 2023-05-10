package com.zohosets.set12;

import java.util.Scanner;

//for n = 6
//1	7	12	16	19	21
//2	8	13	17	20
//3	9	14	18	
//4	10	15
//5	11	
//6

public class Pattern {
	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Pattern().getInput();
	}

	private void getInput() {
		System.out.println("Enter N : ");
		int n = input.nextInt();
		printPattern(n);
	}

	private void printPattern(int n) {
		int value = 1, k = 0, col = n + 1, temp, column = col;
		for (int i = 0; i < n; i++) {
			k = value;
			temp = n;
			for (int j = 0; j < column - i; j++) {
				if (i == 0 && j == 0 || i == 1 && j == 0) {
					System.out.print("   ");
					continue;
				}
				System.out.print(k + "  ");
				k += temp;
				temp--;
			}
			if (i == 1) {
				column--;
			}
			System.out.println();
			value++;
		}
	}

}
