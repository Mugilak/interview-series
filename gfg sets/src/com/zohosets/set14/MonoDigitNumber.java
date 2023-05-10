package com.zohosets.set14;

import java.util.Scanner;

public class MonoDigitNumber {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new MonoDigitNumber().getInput();
	}

	private void getInput() {
		System.out.println("Enter input : ");
		String number = input.nextLine();
		getMonoDigit(number.toCharArray());
	}

	private void getMonoDigit(char[] array) {
		int length = array.length, value = array[0] - '0';
		int num = 0;
		num = (num * 10) + value;
		boolean flag = false;
		for (int i = 1; i < length; i++) {
			flag = false;
			if (array[i] - '0' == value) {
				flag = true;
				num = (num * 10) + value;
			} else if (i + 1 < length) {
				if (operation(array[i] - '0', array[i + 1] - '0', '+') == value) {
					num = (num * 10) + value;
					flag = true;
					i++;
				} else if (operation(array[i] - '0', array[i + 1] - '0', '-') == value) {
					num = (num * 10) + value;
					flag = true;
					i++;
				}
			}
			if (flag == false) {
				System.out.println("cannot create mono digit number");
				return;
			}
		}
		System.out.println(num);
	}

	private int operation(int a, int b, char op) {
		int total = 0;
		switch (op) {
		case '+':
			total = a + b;
			break;
		case '-':
			total = a - b;
			break;
		}
		total = (total < 0) ? (-1 * total) : total;
		return total;
	}

}
