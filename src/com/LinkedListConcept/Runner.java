package com.LinkedListConcept;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//DLinkedList list = new DLinkedList();
		
		
		list.insert(3);
		list.insert(5);
		list.insert(6);
		//list.size();
		list.insertAt(3, 34);

		//System.err.println(list.toString());
		//list.insertAtStart(7);
		list.showList();
		
	}

}
