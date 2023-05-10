package com.zohosets.set27;

//write a java program to find the least prime number that can be added with first array element that makes them divisible by second array elements at respective index (check for prime numbers under 1000, if exist return -1 as answer) & (Consider 1 as prime number)
//
//Input : [ 20, 7 ]
//    [ 11, 5 ]
//Output : [ 1, 3 ]
//Explanation : 
//(20 + ?) % 11 
//( 7 + ?) % 5

public class LeastPrimeAddition {

	public static void main(String[] args) {
		new LeastPrimeAddition().getInput();
	}

	private void getInput() {
		int n = 2, a[] = { 20, 5 }, b[] = { 11, 4 };
		isDivisible(n, a, b);
	}

	private void isDivisible(int n, int[] a, int[] b) {
		int index, value;
		for (int i = 0; i < n; i++) {
			index = 1;
			while (true) {
				value = (b[i] * index) - a[i];
				if (value >= 1000) {
					System.out.printf("%2d", "-1");
					break;
				}
				if (isPrime(value)) {
					System.out.printf("%2d", value);
					break;
				}
				index++;
			}
		}
	}

	private boolean isPrime(int value) {
		if (value < 1) {
			return false;
		}
		int i = 2, tempValue = value;
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
