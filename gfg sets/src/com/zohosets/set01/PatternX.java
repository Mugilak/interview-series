package com.zohosets.set01;

import java.util.*;

//1. Print the word with odd letters as
//
//P         M
// R      A
//   O  R
//     G
//  O    R
// R       A
//P          M 

public class PatternX {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter String : ");
		String letter = input.nextLine();
		if(letter.length()%2!=0) {
			new PatternX().printPattern(letter.toCharArray());
		}else {
			System.out.println("Invalid input");
		}
	}

	private void printPattern(char[] word) {
		int length = word.length;
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				if(i==j || i+j==length-1) {
					System.out.printf("%2s",word[i]);
				}else {
					System.out.printf("%s"," ");
				}
			}
			System.out.println();
		}
	}

}
