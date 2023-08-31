package com.zohosets.set01;

import java.util.ArrayList;

//5. Given a two dimensional array of string like
//<”luke”, “shaw”>
//<”wayne”, “rooney”>
//<”rooney”, “ronaldo”>
//<”shaw”, “rooney”> 
//Where the first string is “child”, second string is “Father”. 
//And given “ronaldo” we have to find his no of grandchildren Here “ronaldo” has 2 grandchildren. 
//So our output should be 2.

public class GrandchildrenCounting {
	String[][] family = { { "luke", "shaw" }, { "wayne", "rooney" }, { "rooney", "ronaldo" }, { "shaw", "rooney" },
			{ "shaw", "ronaldo" } };

	public static void main(String[] args) {
		GrandchildrenCounting gd = new GrandchildrenCounting();
		gd.findGrandChildrens("ronaldo");
	}

	private void findGrandChildrens(String person) {
		ArrayList<String> sonsList = new ArrayList<>();
		int count = 0, index = 0;
		for (String sons[] : family) {
			if (sons[1].equalsIgnoreCase(person)) {
				sonsList.add(sons[0]);
			}
		}
		person = sonsList.get(index++);
		for (int i = 0; i < family.length; i++) {
			if (family[i][1].equalsIgnoreCase(person)) {
				count++;
			}
			if (i == family.length - 1 && index < sonsList.size()) {
				i = -1;
				person = sonsList.get(index++);
			}
		}
		System.out.println(count);
	}

}
