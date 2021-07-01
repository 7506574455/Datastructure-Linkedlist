package com.ds;

public class Main {
	public static void main(String[] args) {
		LinkedList linkedList=new LinkedList();
		//linkedList.push(56);
		//linkedList.push(30);
		//linkedList.push(70);
	
		LinkedList.Node previousNode = linkedList.insert(56);
		linkedList.insertAfter(previousNode, 30); 
		linkedList.print();	
		}
}