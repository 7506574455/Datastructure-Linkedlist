package com.ds;


public class LinkedList {
	//creating head node 
	Node head;
	
	class Node{
		Node next;
		int data;
	
		 
		public Node(int data) {  //constructor 
			super();
			this.next = next;
			this.data = data;
		}
	}
	
	
	public Node insert(int data)     //insert at last position
	{	
		 Node newNode = new Node(data);
		 if (head == null) 
		 {
			 head = newNode;
		 } 
		 else
		 {
			 Node temp = head;				 
			 while (temp.next != null) 
			 {
			 temp = temp.next;
			 }
			 temp.next = newNode;
		 }
		 return newNode;
	 }
	
	
	public void push(int data)     //Insertion at head node
	 {
		 Node newNode = new Node(data);
		 newNode.next = head;
		 head = newNode;
	 }
	
	
	public void print()     //method to Display LinkList
	 {			 
		 Node temp = head;
		 while (temp != null)
		 {
			 System.out.print(temp.data + " -> ");
			 temp = temp.next;
		 }
		 System.out.println();
	 }
	
	
}