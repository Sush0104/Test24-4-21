package com.stack.problems;

import java.util.EmptyStackException;
import com.stack.problems.CustomeStack.Node;

public class CustomeStack {
	int length = 0;
	Node top = null;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null; 
		}

	}

	public void push(int i) {
		Node toBeInserted = new Node(i);
		if (top == null) {
			top = toBeInserted;
		} else {
			toBeInserted.next = top;
			top = toBeInserted;
		}
		System.out.println("Succesfully pushed " + i);
		length++;
	}

	public void popFromFirst() {
		if (top == null) {
			System.out.println("List is empty nothing to pop");
			throw new EmptyStackException();
		} else {
			Node next = top.next;
			top = next;
		}
		length--;
	}

	public void printStack() {
		Node n = top;
		while (n != null) {

			System.out.println(n.data);
			n = n.next;
		}
	}

	public int peek() {
		if (top == null) {
			System.out.println("List is empty nothing to pop");
			throw new EmptyStackException();
		} else {
			return top.data;
		}
	}
	
	public void printStackNew() {
	
	}
}
