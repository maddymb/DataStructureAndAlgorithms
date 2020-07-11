package com.QueueConcepts;

public class MyQueueArray {

	int Queue[];
	int rare;
	int front;
	
	public MyQueueArray(int size) {
		this.Queue = new int[size];
		this.rare = 0;
		this.front = 0;
	}
	
	public void enQueue(int data) {
		
		
		Queue[rare]=data;
		rare++;
		System.out.println("Value entered in Queue : "+data);
		
		
	}
	
	
	public void deQueue() {
		
		System.out.println("Value deleted from Queue : "+Queue[front]);
		front++;
		
	}
	
	
	
}
