package com.zohosets.set09;

import java.util.Arrays;

public class FloodFilling {

	public static void main(String[] args) {
		new FloodFilling().getInput();
	}

	private void getInput() {
		int[][] matrix = { { 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0 }, { 1, 0, 0, 1, 1, 0, 1, 1 },
				{ 1, 2, 2, 2, 2, 0, 1, 0 }, { 1, 1, 1, 2, 2, 0, 1, 0 }, { 1, 1, 1, 2, 2, 2, 2, 0 },
				{ 1, 1, 1, 1, 1, 2, 1, 1 }, { 1, 1, 1, 1, 1, 2, 2, 1 }, };
		int x = 4, y = 4, newColor = 7;
		fill(matrix, x, y, newColor);
	}

	private void fill(int[][] matrix, int x, int y, int newColor) {
		if (!isInBox(matrix, x, y))
			System.out.println("invalid input");
		else if (matrix[x][y] == newColor)
			System.out.println("new Color and previous color are same");
		else {
			helper(matrix, x, y, matrix[x][y], newColor);
			print(matrix);
		}
	}

	private void print(int[][] matrix) {
		for (int[] o : matrix) {
			for (int v : o) {
				System.out.printf("%-4d", v);
			}
			System.out.println();
		}
	}

	private void helper(int[][] matrix, int x, int y, int oldColor, int newColor) {
		int direction[] = { 0, 1, 0, -1, 0 };
		if (isInBox(matrix, x, y) && (oldColor == matrix[x][y])) {
			matrix[x][y] = newColor;
			for (int i = 0; i < direction.length - 1; i++) {
				helper(matrix, x + direction[i], y + direction[i + 1], oldColor, newColor);
			}
		}
	}

	private boolean isInBox(int[][] matrix, int x, int y) {
		if (x >= 0 && y >= 0 && x < matrix.length && y < matrix[0].length) {
			return true;
		}
		return false;
	}

}
