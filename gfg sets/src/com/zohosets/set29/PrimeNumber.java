package com.zohosets.set29;

public class PrimeNumber {

	public static void main(String[] args) {
		new PrimeNumber().start();
	}

	private void start() {
		int number = 16;
		System.out.println(isPrime(number));
		System.out.println("\nWith recursion : \n" + isPrimeRecursion(number, 2));
	}

	private boolean isPrimeRecursion(int number, int i) {
		if (number % i == 0) {
//			System.out.println(i);
			return false;
		}
		if (i < number / (i - 1)) {
			return isPrimeRecursion(number, ++i);
		} else {
//			System.out.println(i);
			return true;}
	}

	private boolean isPrime(int number) {
		int condition = number, i = 2;
		while (i < number / (i - 1)) {
			if (number % i == 0) {
				System.out.println(i);
				return false;
			}
//			condition = number / i;
			i++;
		}
		System.out.println(i);
		return true;
	}

}
