package com.zohosets.set04;

//To find the odd numbers in between the range.
//Input:
//2
//15
//Output:
//3,5,7,9,11,13

public class OddNumbers {

	public static void main(String[] args) {
		new OddNumbers().finOddNUmber(2,15);
	}

	private void finOddNUmber(int start, int last) {
		for(int i=start+1;i<last;i++) {
			if((i%2)!=0) {
				System.out.print(i+" ");
			}
		}
	}

}
