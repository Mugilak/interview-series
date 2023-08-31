package com.zohosets.set04;

import java.util.*;

//To find the print the pattern:Ip: n=5
//Op:
//1
//1 1
//2 1
//1 2 1 1
//1 1 1 2 2 1

public class LookAndSayPattern {

	public static void main(String[] args) {
		LookAndSayPattern l = new LookAndSayPattern();
		System.out.println(l.lookandsay(5));
	}

	private String lookandsay(int n) {
		if (n == 1) {
			return "1";
		}
		String prev = "", val = "";
		int count = 1, num = 0, length;
		char c;
		Queue<String> q = new LinkedList<>();
		q.offer("1");
		while (count < n) {
			val = "";
			prev = q.poll();
//            System.out.println(prev);
			length = prev.length();
			for (int i = 0; i < length; i+=2) {
				c = prev.charAt(i);
				num = 1;
				while (i + 2 < length && prev.charAt(i + 2) == c) {
					num++;
					i+=2;
				}
				val += num+" "+c+" ";
			}
			count++;
			q.offer(val);
		}
		if (!q.isEmpty()) {
			return q.poll();
		}
		return val;
	}

}
