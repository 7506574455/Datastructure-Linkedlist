package com.ds;


public class LinkedList {
	Node head;
	
	 class Node {
		 int data;
		 Node next;
		 
		 public Node(int data) {
			 this.data = data;
			 this.next = null;
		 }
	 }
	 
	 	
	 	public Node insert (int data) {		// method of inserting data	
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
			} else {
				Node temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
			return newNode;
		}
	
		
		public void push(int data) {   //method to push
			 Node newNode = new Node(data);
			 newNode.next = head;
			 head = newNode;
		 }

		
		public void print() {          // method to display inserted data
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.data+"->");
				temp = temp.next;
			}
		
		}

	
		public void insertAfter(Node previousNode, int value) {   // method to insert after a node

			if (previousNode == null) {
			System.out.println("Previous Node should not be null");
			return;
			}
			
			Node newNode = new Node(value);
			newNode.next = previousNode.next;
			previousNode.next = newNode;

			
			}
}