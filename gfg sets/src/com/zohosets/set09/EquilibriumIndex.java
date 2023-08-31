package com.zohosets.set09;

//Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
//Output: 3 
//3 is an equilibrium index, because: 
//A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
//
//
//Input: A[] = {1, 2, 3} 
//Output: -1 

public class EquilibriumIndex extends NextGreatestElementFilling {

	public static void main(String[] args) {
		System.out.println(new EquilibriumIndex().findIndex());
	}

	private int findIndex() {
		int sum = 0, leftSum = 0;
//		int array[] = super.array;
		int []array = {-7, 1, 5, 2, -4, 3, 0};
		for (int value : array) {
			sum += value;
		}
		for (int i = 0; i < array.length; i++) {
			sum -= array[i];
			if (sum == leftSum)
				return i;
			leftSum += array[i];
		}
		return -1;
	}

}
