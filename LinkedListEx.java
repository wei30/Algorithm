package com.linkedlist;

public class LinkedListEx {
	Node head;
  static class Node{
	  //create node with head and value
	  Node next;
	  int data;
	  Node(){}
	  Node(int data){
		  this.data = data;
	  }
  }
	  //insert node at the last
	  public void insert(int data){
		  Node currentNode = head;
		  if(head == null){
			  head = new Node(data);//create a new node
			  return;
		  }
		  //if there is list of node, then loop the list to the last node
		  while(currentNode.next != null){
			  currentNode = currentNode.next; //move next node
		  }
		  //create new node if is reach at the end
		  Node newNode = new Node(data);
		  currentNode.next = newNode;
	  
  }
  public static void main(String[] args) {
	LinkedListEx list = new LinkedListEx();
     list.insert(1);
     list.insert(2);
     list.printLinkedList();
  }
public void printLinkedList() {
	// TODO Auto-generated method stub
	Node node = head; //start from the head
	while(node != null){
		System.out.println("data " + node.data );
		node = node.next;
	}
	
}
}
