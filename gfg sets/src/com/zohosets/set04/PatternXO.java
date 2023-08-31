package com.zohosets.set04;

public class PatternXO {

	public static void main(String[] args) {
		new PatternXO().printPattern(6, 5);
	}

	private void printPattern(int rows, int columns) {
		int startRow = 0, startCol = 0, lastRow = rows - 1, lastCol = columns - 1;
		char array[][] = new char[rows][columns];
		char cur = 'X';
		while (startRow <= lastRow) {
			for (int i = startRow; i <= lastCol; i++) {
				array[startRow][i] = cur;
			}
			startRow++;
			for (int i = startRow; i <= lastRow; i++) {
				array[i][lastCol] = cur;
			}
			lastCol--;
			for (int i = lastCol; i >= startCol; i--) {
				array[lastRow][i] = cur;
			}
			lastRow--;
			for (int i = lastRow; i >= startRow; i--) {
				array[i][startCol] = cur;
			}
			startCol++;
			if (cur == 'X') {
				cur = 'O';
			} else {
				cur = 'X';
			}
		}
		printArray(array);
	}

	private void printArray(char[][] array) {
		for(char[] ar : array) {
			for(char c : ar) {
				System.out.printf("%2s",c);
			}
			System.out.println();
		}
	}

}
