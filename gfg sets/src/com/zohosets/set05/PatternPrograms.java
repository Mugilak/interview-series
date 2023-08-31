package com.zohosets.set05;

//1)
//1
//2  5
//3  6  8
//4  7  9 10

//2)
//1
//2 4
//3 5 7
//6 8 10 12

public class PatternPrograms {

	public static void main(String[] args) {
		PatternPrograms p = new PatternPrograms();
		p.printType1(4);
		p.printType2(8);
	}

	private void printType1(int n) {
		System.out.println("type1");
		int len = ((n * n) + " ").length(), num;
		for (int i = 0; i < n; i++) {
			num = i + 1;
			for (int j = 0; j <= i; j++) {
				if (j != 0) {
					num += (n - j);
				}
				System.out.printf("%" + len + "d", num);
			}
			System.out.println();
		}
	}

	private void printType2(int n) {
		System.out.println("\ntype2");
		int len = ((n * n) + " ").length(), j, num = 1, value = 1;
		for (int i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.printf("%" + len + "d", num);
				num += 2;
			}
			num -= (j * 2);
			if (i != 0 && i % 2 == 0) {
				value += 2;
			}
			num += value;
			System.out.println();
		}
	}

}
