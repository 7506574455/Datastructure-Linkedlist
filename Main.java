package com.ds;

public class Main {
	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		linkedList.insert(56);
		linkedList.insert(30);
		linkedList.insert(70);
		linkedList.print();
	
		//LinkedList.Node previousNode = linkedList.insert(56);
		//linkedList.insertAfter(previousNode, 30); 
		
		 int pop = linkedList.pop();
		 System.out.println(pop);
		
		linkedList.print();	
		}
}