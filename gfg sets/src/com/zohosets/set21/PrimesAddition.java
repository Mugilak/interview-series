package com.zohosets.set21;

//Write a program to determine whether a given number can be expressed as sum of two prime numbers or not.
//
//For example 34 can be expressed as sum of two prime numbers but 23 cannot be.

public class PrimesAddition {

	public static void main(String[] args) {
		new PrimesAddition().getInput();
	}

	private void getInput() {
		int number = 54;
		System.out.println(isAddByPrimes(number));
	}

	private boolean isAddByPrimes(int number) {
		if (number % 2 != 0) {
			return isPrime(number - 2);
		} else {
			for (int i = 3; i <= number / 2; i += 2) {
				if (isPrime(i) && isPrime(number - i)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isPrime(int value) {
		if (value < 1) {
			return false;
		}
		int tempValue = value, i = 2;
		while (tempValue > i) {
			if (value % i == 0) {
				return false;
			}
			tempValue /= i;
			i++;
		}
		return true;
	}

}
