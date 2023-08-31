package com.zohosets.set05;

//java program for 3*3 matrix
//Input
//1    2    3
//4    5    6
//7    8    9
//
//Output:
//4    1    2
//7    5    3
//8    9    6

//For 4*4 matrix
//Input:
//1    2    3    4    
//5    6    7    8
//9    10    11    12
//13    14    15    16
//
//Output:
//5    1    2    3
//9    10    6    4
//13    11    7    8
//14    15    16    12

public class MatrixRearrangement {

	public static void main(String[] args) {
		new MatrixRearrangement().getInput();
	}

	void getInput() {
		int[][] inputMatrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
//		int[][] inputMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		rearrangeMatrix(inputMatrix);

		for (int i = 0; i < inputMatrix.length; i++) {
			for (int j = 0; j < inputMatrix[i].length; j++) {
				System.out.print(inputMatrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void rearrangeMatrix(int[][] matrix) {
		int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1, prev, temp, i;
		while (top < bottom && left < right) {
			prev = matrix[top][left];
			for (i = left; i <= right; i++) {
				temp = matrix[top][i];
				matrix[top][i] = prev;
				prev = temp;
			}
			top++;
			for (i = top; i <= bottom; i++) {
				temp = matrix[i][right];
				matrix[i][right] = prev;
				prev = temp;
			}
			right--;
			for (i = right; i >= left; i--) {
				temp = matrix[bottom][i];
				matrix[bottom][i] = prev;
				prev = temp;
			}
			bottom--;
			for (i = bottom; i >= top-1; i--) {
				temp = matrix[i][left];
				matrix[i][left] = prev;
				prev = temp;
			}
			left++;
		}
	}

}
