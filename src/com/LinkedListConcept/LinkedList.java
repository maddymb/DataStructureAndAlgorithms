package com.LinkedListConcept;

public class LinkedList {

	Node head;
	
	public void insert(int data) {
		
		Node node = new Node(); // creating new node 
		node.data = data;		// putting the value in created node 
		node.next = null;		// putting null in next node
		
		if(head==null) {  		// checking if head is null means there is no data in list
			head = node;		//	creating the linked list with one data 
		}
		else {					// if there is already data in linked list
			
			Node tempNode = head;	// creating temporary node and putting the value of head in it
			while(tempNode.next!=null) {	// checking if the next value of node is not null
				
				tempNode = tempNode.next;	// if the value of next node is not null then making the next of temporary node as temporary node
				
			}
			tempNode.next =node; 	// after finding the value of next of the temporary node is null then putting the node at last
		}
		
	}
	
	
	public void showList() {
		Node node = head; // putting the value of head in node
		while(node.next!=null) {	// checking if the next value of node is not null
			System.out.println(node.data); // if the value of next node is not null then printing thd data
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	
	public void size() {
		int counter=0;
		Node node =head;
		while(node.next!=null) {
			node= node.next;
			counter++;
		}
		System.out.println("Size of Singly Linked List :"+(counter+1));
		
		
	}
	
	
	public void insertAt(int index,int data) {
		Node node = head;
		node.data=data;
		node.next = null;
		
		if(index==0) {
			insertAtStart(data);
		}
		
		else {
			Node tempNode=head;
			
			for(int i=0; i<index-1; i++) {
				tempNode=tempNode.next;			
			}
			
			node.next=tempNode.next;
			tempNode.next=node;
			
		}	
	}
	
	public void insertAtStart(int data) {
		
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
		
	}
	
	
}
 