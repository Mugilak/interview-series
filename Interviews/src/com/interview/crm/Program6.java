package com.interview.crm;

public class Program6 {
	private static int r, c;
	private boolean isFound;

	public static void main(String[] args) {
		new Program6().getInput();
	}

	private void getInput() {
//		char[][] board = { { 'h', 'o', 'l', 'z' }, { 'a', 'l', 'l', 'o' }, { 'a', 'b', 'c', 'h' },
//				{ 'o', 'k', 'j', 'o' } };
//		String word = "zoho";
		char[][] board = { { 'l', 'u', 'e', 'l', 'l' }, { 'l', 'u', 'n', 'c', 'h' }, { 't', 'a', 'e', 'r', 'a' },
				{ 'a', 'a', 't', 't', 't' }, { 'r', 'e', 'o', 't', 'p' } };
		String word = "lunch";
		int k = 0, row = 0, col = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(k)) {
					findNext(board, i, j, word, k + 1);
					if (isFound) {
						row = i;
						col = j;
					}
				}
			}
		}
		if (isFound) {
			System.out.println("Start Index : <" + row + "," + col + ">" + " End Index : <" + r + "," + c + ">");
		} else
			System.out.println("Not found");
	}

	private void findNext(char[][] board, int rows, int cols, String word, int index) {
		if (index == word.length()) {
			r = rows;
			c = cols;
			isFound = true;
			return;
		}
		int chances[][] = { { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 } };
		int row, col, len = board.length;
		for (int i = 0; i < 4; i++) {
			row = rows + chances[i][0];
			col = cols + chances[i][1];
			if (row >= 0 && row < len && col >= 0 && col < len) {
				if (board[row][col] == word.charAt(index)) {
					char c = board[row][col];
					board[row][col] = '*';
					findNext(board, row, col, word, index + 1);
					board[row][col] = c;
				}
			}
		}
	}
}
