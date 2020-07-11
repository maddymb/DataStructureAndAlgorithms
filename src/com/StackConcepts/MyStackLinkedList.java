package com.StackConcepts;

public class MyStackLinkedList {

	Node head;
	public void push(int data) {
		Node node = new Node(data);
		node.next=head;
		head = node; 
		System.out.println("Pushed Value : "+head.data);
		
	}
	
	public void pop() {
		if(head==null) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Popped Value : "+head.data);
			head = head.next;
		}
		
	}
	
	public void peek() {
		if(head==null) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println("Peek Value : "+head.data);
		}
		
	}
	
	
	
	
	
}
