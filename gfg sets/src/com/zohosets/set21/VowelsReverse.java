package com.zohosets.set21;

//Given a string, reverse only vowels in it; leaving rest of the string as it is.
//
//Input : abcdef
//Output : ebcdaf

public class VowelsReverse {

	public static void main(String[] args) {
		new VowelsReverse().getInput();
	}

	private void getInput() {
		String name = "kanagaraj";
		reverseVowels(name.toCharArray());
	}

	private void reverseVowels(char[] array) {
		int first = 0, last = array.length - 1;
		char temp;
		while (first < last) {
			if (isVowel(array[first])) {
				while (first < last) {
					if (array[first] != array[last] && isVowel(array[last])) {
						if (first < last) {
							temp = array[first];
							array[first] = array[last];
							array[last] = temp;
							last--;
							break;
						}
					} else {
						last--;
					}
				}
			}
			first++;
		}
		printArray(array);
	}

	private void printArray(char[] array) {
		for (char value : array) {
			System.out.print(value);
		}
	}

	private boolean isVowel(char value) {
		if (value == 'a' || value == 'A' || value == 'e' || value == 'E' || value == 'i' || value == 'I' || value == 'o'
				|| value == 'O' || value == 'u' || value == 'U') {
			return true;
		}
		return false;
	}

}
