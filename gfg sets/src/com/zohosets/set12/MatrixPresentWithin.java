package com.zohosets.set12;

public class MatrixPresentWithin {

	public static void main(String[] args) {
		new MatrixPresentWithin().getInput();
	}

	private void getInput() {
		int[][] array = { { 2, 2, 2 }, { 1, 1, 0 }, { 6, 5, 6 } };
//		int[][] array2 = { { 5, 6 }, { 4, 3 } };
		int[][] array2 = { { 2, 2 }, { 1, 1 }, { 5, 6 } };
		System.out.println(isPresentWithinArray(array, array2));
	}

	private boolean isPresentWithinArray(int[][] array, int[][] array2) {
		int row = array.length, col = array[0].length, row2 = array2.length, col2 = array2[0].length, r = 0, c = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (array[i][j] == array2[r][c]) {
					if (!(check(array, i, j, row, col, array2, r, c, row2, col2))) {
						if ((check(array, i + 1, j, row, col, array2, r + 1, c, row2, col2))) {
							return true;
						}
					} else {
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean check(int[][] array, int i, int j, int row, int col, int[][] array2, int r, int c, int row2,
			int col2) {
		int j2 = j, c2 = c;
		while (i < row && r < row2) {
			while (j < col && c < col2) {
				if (array[i][j] == array2[r][c]) {
					j++;
					c++;
				} else {
					return false;
				}
			}
			if (c == col2) {
				c = c2;
				j = j2;
			}
			i++;
			r++;
		}
		if (r == row2 && c == c2) {
			return true;
		}
		return false;
	}

}
