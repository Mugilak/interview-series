package com.zohosets.set02;

import java.util.*;

//3) Form a number system with only 3 and 4. Find the nth number of the number system.
//Eg.) The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334, 3343, 3344, 3433, 3434, 3443, 3444 ….

class Node {
	String value;
	Node next;

	Node(String value) {
		this.value = value;
		this.next = null;
	}
}

class Queue {
	private Node front = null, rear = null, node = null;

	void push(String value) {
		node = new Node(value);
		node.next = null;
		if (front == null) {
			front = node;
			rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
	}

	String poll() {
		if (rear == null || front == null) {
			return null;
		} else {
			node = front;
			front = front.next;
			return node.value;
		}
	}
}

public class NumberSystem {

	public static void main(String[] args) {
		new NumberSystem().getInput();;
	}

	private void getInput() {
		int n = 11;
		createNumberSystem(n);
	}

	private void createNumberSystem(int n) {
		if (n == 1)
			System.out.println("3");
		else if (n == 2)
			System.out.println("3,4");
		else if (n > 2) {
			int count = 2;
			String value = "";
			Queue queue = new Queue();
			queue.push("3");
			queue.push("4");
			System.out.println("3\n4");
			while (count < n) {
				value = queue.poll();
				if (value != null) {
					queue.push(value + "3");
					count++;
					if (count <= n) {
						System.out.println(value + "3");
					}
					queue.push(value + "4");
					count++;
					if (count <= n) {
						System.out.println(value + "4");
					}
				}
			}
		}
	}

}
