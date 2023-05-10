package com.interview.crm;

import java.util.Scanner;

public class TicTacToe {
	private Scanner input = new Scanner(System.in);
	private char[][] board = new char[3][3];

	public static void main(String[] args) {
		new TicTacToe().getInput();
	}

	private void getInput() {
		char c;
		System.out.println("Enter Elements: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c = input.next().charAt(0);
				if (c == 'x' || c == 'o' || c == '_')
					board[i][j] = c;
				else
					System.out.println("wrong input");
			}
		}
		findWinner();
	}

	private void findWinner() {
		if (checkDiagonal() || checkPlus()) {
			System.out.println(board[1][1]);
		} else if (checkLeft()) {
			System.out.println(board[0][0]);
		} else if (checkRight()) {
			System.out.println(board[2][2]);
		} else
			System.out.println("none");
	}

	private boolean checkRight() {
		if ((board[2][2] != '_') && (board[2][2] == board[1][2] && board[1][2] == board[0][2])
				|| (board[2][2] == board[2][1] && board[2][1] == board[2][0])) {
			return true;
		}
		return false;
	}

	private boolean checkLeft() {
		if ((board[0][0] != '_') && (board[0][0] == board[0][1] && board[0][1] == board[0][2])
				|| (board[0][0] == board[1][0] && board[1][0] == board[2][0])) {
			return true;
		}
		return false;
	}

	private boolean checkPlus() {
		if ((board[1][1] != '_') && (board[0][1] == board[1][1] && board[1][1] == board[2][1])
				|| (board[1][0] == board[1][1] && board[1][1] == board[1][2])) {
			return true;
		}
		return false;
	}

	private boolean checkDiagonal() {
		if ((board[1][1] != '_') && (board[0][0] == board[1][1] && board[1][1] == board[2][2])
				|| (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
			return true;
		}
		return false;
	}

}
