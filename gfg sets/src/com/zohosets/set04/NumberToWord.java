package com.zohosets.set04;

//To output the number in words (0-999)
//Input: 234
//Output: Two hundred and Thirty Four

public class NumberToWord {

	public static void main(String[] args) {
		new NumberToWord().convertToWord(111);
	}

	private void convertToWord(int number) {
		String ones[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String tens[] = { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };
		String hundreds[] = { "One Hundred and", "Two Hundred and", "Three Hundred and", "Four Hundred and",
				"Five Hundred and", "Six Hundred and", "Seven Hundred and", "Eight Hundred and", "Nine Hundred and" };
		String teens[] = { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen" };
		int num = 0, count = 0, prev = 0;
		String answer = "";
		if (number == 0) {
			answer = ones[0];
		}
		while (number > 0) {
			num = number % 10;
			count++;
			if (count == 1) {
				prev = num;
			} else if (count == 2 && num == 1) {
				if (prev == 0) {
					answer = tens[num - 1] + answer;
				} else {
					answer = teens[prev - 1] + answer;
				}
			} else if (count == 2) {
				if (prev == 0)
					answer = tens[num - 1] + " " + answer;
				else
					answer = tens[num - 1] + " " + ones[prev] + answer;
			} else if (count == 3) {
				answer = hundreds[num - 1] + " " + answer;
			}
			number /= 10;
		}
		if (count == 1) {
			answer = ones[num];
		}
		System.out.println(answer);
	}

}
