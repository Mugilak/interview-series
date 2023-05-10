package com.zohosets.set35;

import java.util.Scanner;

//Two strings of equal length will be given. Print all the adjacent pairs which are not equal.
//
//Input: asdfghij and adsfgijh
//
//Output: sd-ds, hij-ijh

public class UnequalAdjacentPairs {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new UnequalAdjacentPairs().getInput();
	}

	private void getInput() {
		System.out.println("Enter String : ");
		String word = input.nextLine();
		System.out.println("Enter String 2 : ");
		String word2 = input.nextLine();
		findUnEqualPairs(word.toCharArray(), word2.toCharArray());
	}

	private void findUnEqualPairs(char[] word1, char[] word2) {
		String pair = "", pair2 = "";
		int l1 = word1.length, l2 = word2.length, j = 0;
		if (l1 != l2) {
			System.out.println("Not equal");
			return;
		}
		for (int i = 0; i < l1; i++) {
			if (word1[i] != word2[i]) {
				j = i;
				while (j < l1 && word1[j] != word2[j]) {
					pair += word1[j];
					pair2 += word2[j];
					j++;
				}
				pair += "-" + pair2;
				if (j < l1)
					System.out.print(pair + " , ");
				else
					System.out.print(pair);
				pair = "";
				pair2 = "";
				j--;
				i = j;
			}
		}
	}

}
