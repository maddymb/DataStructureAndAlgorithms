package com.StackConcepts;

public class MyStackStaticArray {

	int Stack[];
	int top;
	int capacity;
	 
	 
	public MyStackStaticArray(int size) {
		this.capacity=size;
		this.Stack=new int[capacity]; 
		this.top=-1;	
		
	}
	 
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Over Flow Can not Push : "+data);			
		}
		else {
			top++;
			Stack[top]=data;
			System.out.println("Pushed Value : "+Stack[top]);
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("UnderFlow");
		}
		else {
			System.out.println("Poped Value : "+Stack[top]);
			top--;
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Peeked Value : "+Stack[top]);
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			for(int i=0; i<=top; i++) {
				System.out.print(Stack[i]+" ");
			}
			System.out.println();
		}
	}
	
	public boolean isEmpty() {
		boolean isEmpty = false;
		if(top==-1)
			isEmpty = true;
		else
			isEmpty = false;
		return isEmpty;
	}
	
	public boolean isFull() {
		boolean isFull = false;
		if(top==Stack.length-1)
			isFull = true;
		else
			isFull = false;
		return isFull;
	}
	
	public void size() {
		if(top==-1) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Size of Stack : "+(top+1));
		}
		
		
	}
	
	
}
