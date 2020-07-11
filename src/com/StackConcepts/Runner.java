package com.StackConcepts;

public class Runner {

	public static void main(String[] args) {
		MyStackStaticArray stack = new MyStackStaticArray(3);
		stack.size();
		stack.push(2);
		stack.size();
		stack.pop();
		stack.push(5);
		stack.push(10);
		stack.push(11);
		stack.push(12);
		stack.push(13);
		stack.push(16);
		stack.peek();
		stack.display();
		stack.size();
		stack.pop();
		stack.display();
		stack.size();
	
		
		
		MyStackLinkedList sll = new MyStackLinkedList();
		sll.push(5);
		sll.push(6);
		sll.push(7);
		sll.push(8);
		sll.push(9);
		sll.pop();
		sll.pop();
		sll.peek();
		sll.push(11);
		sll.peek();
		
		
	}

}
