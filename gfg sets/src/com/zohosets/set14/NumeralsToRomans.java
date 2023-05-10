package com.zohosets.set14;

import java.util.Scanner;

public class NumeralsToRomans {
	private Scanner input = new Scanner(System.in);
	String roman = "";

	public static void main(String[] args) {
		new NumeralsToRomans().getInput();
	}

	private void getInput() {
		System.out.println("Enter size : ");
		int n = input.nextInt();
		printRomans(n);
	}

	private void printRomans(int n) {
		for (int i = 1; i <= n; i++) {
			roman = "";
			System.out.println(i + " -> " + getRomanValue(i));
		}
	}

	private String getRomanValue(int number) {
		while (number > 0) {
			number = getValue(number);
		}
		return roman;
	}

	private int getValue(int number) {
		if (number >= 1000) {
			number -= 1000;
			roman += "M";
		} else if (number >= 900) {
			number -= 900;
			roman += "CM";
		} else if (number >= 500) {
			number -= 500;
			roman += "D";
		} else if (number >= 400) {
			number -= 400;
			roman += "CD";
		} else if (number >= 100) {
			number -= 100;
			roman += "C";
		} else if (number >= 90) {
			number -= 90;
			roman += "XC";
		} else if (number >= 50) {
			number -= 50;
			roman += "L";
		} else if (number >= 40) {
			number -= 40;
			roman += "XL";
		} else if (number >= 10) {
			number -= 10;
			roman += "X";
		} else if (number >= 9) {
			number -= 9;
			roman += "IX";
		} else if (number >= 5) {
			number -= 5;
			roman += "V";
		} else if (number >= 4) {
			number -= 4;
			roman += "IV";
		} else if (number >= 1) {
			number -= 1;
			roman += "I";
		}
		return number;
	}

}
