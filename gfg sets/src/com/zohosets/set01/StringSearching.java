package com.zohosets.set01;

import java.util.Scanner;

//3. Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like
//“too” in the two dimensional string both from left to right and from top to bottom.
//
//w	e	L	C	O
//M	E	T	O	Z
//O	H	O	C	O
//R	P	O	R	A
//T	I	O	n	  
//And print the start and ending index as
//
//Start index : <1,2>
//
//End index: <3, 2>

public class StringSearching {
	private Scanner input = new Scanner(System.in);
	String indexes = "";

	public static void main(String[] args) {
		new StringSearching().getInput();
	}

	private void getInput() {
		System.out.println("Enter string: ");
		String string = input.nextLine();
		System.out.println("Enter substring to search : ");
		String substring = input.nextLine();
		int len = (int) Math.round(Math.sqrt(string.length()));
		char[][] array = new char[len][len];
		saveInArray(array, string.toLowerCase().toCharArray());
		findSubstring(array, substring.toLowerCase().toCharArray());
	}

	private void findSubstring(char[][] array, char[] substring) {
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == ' ') {
					continue;
				}
				if (array[i][j] == substring[index]) {
					indexes = "start index : <" + i + "," + j + ">";
					if (isSubstring(array, substring, i, j, index + 1)) {
						System.out.println(indexes);
						return;
					} else {
						index = 0;
						indexes = "";
					}
				}
			}
		}
		System.out.println("Not found!");
	}

	private boolean isSubstring(char[][] array, char[] substring, int row, int col, int index) {
		int[][] direction = { { 0, 1 }, { 1, 0 } };
		int r, c;
		for (int dir = 0; dir < 2; dir++) {
			r = row + direction[dir][0];
			c = col + direction[dir][1];
			if (r >= 0 && r < array.length && c >= 0 && c < array.length && array[r][c] == substring[index]) {
				if (index == substring.length - 1) {
					indexes += "\nend index : <" + r + "," + c + ">";
					return true;
				}
				array[r][c] = ' ';
				if (isSubstring(array, substring, r, c, index + 1))
					return true;
				array[r][c] = substring[index];
			}
		}
		return false;
	}

	private void saveInArray(char[][] array, char[] string) {
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (index >= string.length) {
					array[i][j] = ' ';
				} else
					array[i][j] = string[index++];
			}
		}
	}

}
