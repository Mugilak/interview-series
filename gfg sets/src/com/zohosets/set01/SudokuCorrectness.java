package com.zohosets.set01;

//4. Given a 9×9 sudoku we have to evaluate it for its correctness. 
//   We have to check both the sub matrix correctness and the whole sudoku correctness.

public class SudokuCorrectness {
	int[][] board = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
			{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
			{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

//	int[][] board = { { 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2, 2, 2, 2, 2 }, { 3, 3, 3, 3, 3, 3, 3, 3, 3 },
//			{ 4, 4, 4, 4, 4, 4, 4, 4, 4 }, { 5, 5, 5, 5, 5, 5, 5, 5, 5 }, { 6, 6, 6, 6, 6, 6, 6, 6, 6 },
//			{ 9, 9, 9, 9, 9, 9, 9, 9, 9 }, { 8, 8, 8, 8, 8, 8, 8, 8, 8 }, { 7, 7, 7, 7, 7, 7, 7, 7, 7 } };

	public static void main(String[] args) {
		new SudokuCorrectness().evaluate();
	}

	private void evaluate() {
		int rowSum = 0, colSum = 0;
		for (int i = 0; i < 9; i++) {
			rowSum = 0;
			colSum = 0;
			for (int j = 0; j < 9; j++) {
				if (i % 3 == 0 && j % 3 == 0) {
					if (!submatrixCheck(i, j)) {
						System.out.println("Invalid sudoku");
						return;
					}
				}
				rowSum += board[i][j];
				colSum += board[j][i];
			}
			if (rowSum != 45 || colSum != 45) {
				System.out.println("Invalid sudoku");
				return;
			}
		}
		System.out.println("valid sudouku");
	}

	private boolean submatrixCheck(int row, int col) {
		int sum = 0;
		for (int i = row; i < row + 3; i++) {
			for (int j = col; j < col + 3; j++) {
				sum += board[i][j];
			}
		}
		if (sum == 45)
			return true;
		return false;
	}

}
