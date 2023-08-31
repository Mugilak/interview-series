package com.zohosets.set02;

//4) Check whether a given mathematical expression is valid.
//
//Eg.) Input  : (a+b)(a*b)
//     Output : Valid
//
//     Input  : (ab)(ab+)
//     Output : Invalid
//
//     Input  : ((a+b)
//     Output : Invalid

public class ExpressionValidation {

	public static void main(String[] args) {
		new ExpressionValidation().getInput();
	}

	private void getInput() {
		String exp = "((a+b)";
		System.out.println(isValid(exp.toCharArray()) ? "Valid" : "Invalid");
	}

	private boolean isValid(char[] array) {
		int len = array.length, count = 0;
		for (int i = 0; i < len; i++) {
			if (array[i] == '+' || array[i] == '-' || array[i] == '*' || array[i] == '/' || array[i] == '%'
					|| array[i] == '!') {
				if (i + 1 < len && (array[i + 1] == ')' || array[i + 1] == '*' || array[i + 1] == '/'
						|| array[i + 1] == '%' || array[i + 1] == '+')) {
					return false;
				}
				if (i - 1 < len && (array[i - 1] == '(' || array[i - 1] == '*' || array[i - 1] == '/'
						|| array[i - 1] == '%' || array[i - 1] == '+') || array[i - 1] == '-') {
					return false;
				}
			}
			if (array[i] == '(') {
				if (i + 1 < len && array[i + 1] == ')') {
					return false;
				}
				count++;
			} else if (array[i] == ')') {
				if (i - 1 < len && array[i - 1] == '(') {
					return false;
				}
				count--;
			}
		}
		if (count != 0)
			return false;
		return true;
	}

}
