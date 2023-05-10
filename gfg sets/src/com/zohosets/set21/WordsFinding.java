package com.zohosets.set21;

import java.util.Scanner;

public class WordsFinding {
	private Scanner input = new Scanner(System.in);
	private String route;
	private char matrix[][] = { { 'P', 'W', 'K', 'C', 'T' }, { 'B', 'O', 'F', 'A', 'L' }, { 'O', 'O', 'E', 'R', 'M' },
			{ 'X', 'L', 'A', 'T', 'E' }, { 'A', 'C', 'O', 'T', 'N' } };

	public static void main(String[] args) {
		new WordsFinding().getInput();
	}

	private void getInput() {
		String[] words = new String[5];
		System.out.println("Enter words: ");
		for (int i = 0; i < words.length; i++) {
			words[i] = input.nextLine();
		}
		isWordsFound(words, words.length);
	}

	private void isWordsFound(String[] words, int length) {
		for (int i = 0; i < length; i++) {
			route = "";
			for (int j = 0; j < matrix.length; j++) {
				for (int k = 0; k < matrix[j].length; k++) {
					if (matrix[j][k] == words[i].charAt(0)) {
						findPath(words[i], j, k, 1, words[i].charAt(0) + "(" + j + "," + k + ") ");
					}
				}
			}
			if (route != "") {
				System.out.println(route);
			} else
				System.out.println("NOT FOUND");
		}
	}

	private void findPath(String word, int r, int c, int index, String path) {
		int[][] chances = { { 0, 1 }, { 1, 0 }, { 1, 1 } };
		int row, column;
		String currentPath = "";
		for (int i = 0; i < 3; i++) {
			row = r + chances[i][0];
			column = c + chances[i][1];
			if (row >= 0 && column >= 0 && row < matrix.length && column < matrix[0].length) {
				if (matrix[row][column] == word.charAt(index)) {
					if (index == word.length() - 1) {
						route = path + word.charAt(index) + "(" + row + "," + column + ") ";
						return;
					}
					currentPath = path + word.charAt(index) + "(" + row + "," + column + ") ";
					findPath(word, row, column, index + 1, currentPath);
				}
			}
		}
	}

}
