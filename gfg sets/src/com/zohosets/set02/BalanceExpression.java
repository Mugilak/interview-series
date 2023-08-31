package com.zohosets.set02;

//2) Remove unbalanced parentheses in a given expression.
//
//Eg.) Input  : ((abc)((de))
//     Output : ((abc)(de))  
//
//     Input  : (((ab)
//     Output : (ab)

public class BalanceExpression {

	public static void main(String[] args) {
		new BalanceExpression().getInput();
	}

	private void getInput() {
		String exp = "(((ab)";
		removeUnbalanced(exp.toCharArray());
	}

	private void printBalanced(char[] array) {
		for (char value : array) {
			if (value != '#')
				System.out.print(value);
		}
	}

	private void removeUnbalanced(char[] array) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '(') {
				count++;
			} else if (array[i] == ')') {
				count--;
			}
			if (count == -1) {
				count++;
				array[i] = '#';
			}
		}
		count = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == '(')
				count++;
			else if (array[i] == ')')
				count--;
			if (count == 1) {
				count--;
				array[i] = '#';
			}
		}
		printBalanced(array);
	}

}
