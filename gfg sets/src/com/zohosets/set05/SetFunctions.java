package com.zohosets.set05;

import java.util.Scanner;

//4 8 15 17 18
//4 10 18

class Node {
	int data;
	Node next;

	Node(int value) {
		data = value;
		next = null;
	}
}

public class SetFunctions {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new SetFunctions().getInput();
	}

	private void getInput() {
		LinkedList list1, list2;
		list1 = new LinkedList();
		list2 = new LinkedList();
		createList(list1, 1);
		createList(list2, 3);
		Node list = findIntersection(list1.getHead(), list2.getHead());
		printList(list);
	}

	private void printList(Node list) {
		while (list != null) {
			System.out.print(list.data + " ");
			list = list.next;
		}
	}

	private void createList(LinkedList list, int index) {
		for (int i = index; i <= 5; i++) {
			list.insert(input.nextInt());
		}
	}

	public Node findIntersection(Node head1, Node head2) {
		LinkedList list = new LinkedList();
		Node temp1 = head1, temp2 = head2;
		boolean found = false;
		while (temp1 != null) {
			found = false;
			temp2 = head2;
			while (temp2 != null) {
				if (temp1.data == temp2.data) {
					found = true;
				}
				temp2 = temp2.next;
			}
			if (found) {
				list.insert(temp1.data);
			}
			temp1 = temp1.next;
		}
		return list.getHead();
	}

}

class LinkedList {
	Node head = null, tail = null;

	void insert(int val) {
		Node node = new Node(val);
		if (head == null && tail == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	public Node getHead() {
		if (head == null)
			return null;
		return head;
	}
}
