package com.zohosets.set21;

//Take a 2 or 3 digit input number, reverse it and add it to the original number until the obtained number is a palindrome or 5 iterations are completed.
//
//Input : n = 32
//Output : 55
//23 + 32 = 55 which is a palindrome.
//
//Input : 39
//Output : 363

public class AdditionTillPalindrome {

	public static void main(String[] args) {
		new AdditionTillPalindrome().getInput();
	}

	private void getInput() {
		int number = 23;
		System.out.println(getPalindrome(number));
	}

	private int getPalindrome(int number) {
		int answer = -1, reverse = getReverse(number);
		for (int i = 0; i < 5; i++) {
			answer = number + reverse;
			reverse = getReverse(answer);
			if (answer == reverse) {
				return answer;
			}
			number = answer;
		}
		return -1;
	}

	private int getReverse(int number) {
		int reversed = 0, k = 10, digit=0;
		while (number > 0) {
			digit = number % 10;
			reversed = reversed * k + digit;
			number /= 10;
		}
		return reversed;
	}

}
