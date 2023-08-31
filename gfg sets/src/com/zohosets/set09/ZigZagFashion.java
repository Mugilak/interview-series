package com.zohosets.set09;

//Input: 
//1 2 3
//4 5 6
//7 8 9
//Output: 
//1 2 4 7 5 3 6 8 9
//https://www.geeksforgeeks.org/print-matrix-in-zig-zag-fashion/

public class ZigZagFashion {

	public static void main(String[] args) {
		new ZigZagFashion().getInput();
	}

	private void getInput() {
		int[][] array = { { 1, 2, 3, 10, 11 }, 
					 	  { 4, 5, 6, 12, 13 },
					 	  { 7, 8, 9, 14, 15 },
						  { 16,17,18,19, 20 },
						  { 21,22,23,24, 25 }};
		printZigZag(array);
	}

	private void printZigZag(int[][] array) {
		int x = 0, y = 0, r, c, rowLen = array.length, colLen = array[0].length;
		boolean colInc = false;
		while (x < rowLen && y < colLen) {
			if (colInc) {
				r = x;
				c = y;
				while (c >= 0) {
					System.out.print(array[r][c] + " ");
					r++;
					c--;
				}
				if (y != c) {
					x = r;
					y = c + 1;
				}
				colInc = false;
			} else {
				r = x;
				c = y;
				while (r >= 0 && c<colLen) {
					System.out.print(array[r][c] + " ");
					r--;
					c++;
				}
				if (x != r) {
					x = r + 1;
					y = c;
				}
				colInc = true;
			}
			if (x + y == rowLen) {
				break;
			}
		}
		if (y == colLen) {
			x++;
			y--;
		} else if (x == rowLen) {
			x--;
			y++;
		}
		while (x < rowLen && y < colLen) {
			if (colInc) {
				r = x;
				c = y;
				while (r < rowLen) {
					System.out.print(array[r][c] + " ");
					r++;
					c--;
				}
				if (y != c) {
					x = r - 1;
					y = c + 2;
				}
				colInc = false;
			} else {
				r = x;
				c = y;
				while (c < colLen) {
					System.out.print(array[r][c] + " ");
					r--;
					c++;
				}
				if (x != r) {
					x = r + 2;
					y = c - 1;
				}
				colInc = true;
			}
		}
	}

}
