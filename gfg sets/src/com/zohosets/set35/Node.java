package com.zohosets.set35;

public class Node {
	public Object value;
	public Node next;
	public int index;

	public Node(Object value) {
		this.value = value;
	}

	public Node(Object value, int index) {
		this.value = value;
		this.index = index;
	}
}
