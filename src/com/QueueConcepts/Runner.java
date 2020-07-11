package com.QueueConcepts;

public class Runner {

	public static void main(String[] args) {
		
		MyQueueArray queue = new MyQueueArray(4);
		queue.enQueue(4);
		queue.enQueue(6);
		queue.enQueue(7);
		
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(6);
		queue.enQueue(7);
		
	}

}
