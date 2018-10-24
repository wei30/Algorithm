package com.linkedlist;

import com.linkedlist.LinkedListExample.Node;

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
		  if(head == null){ //if there is no node 
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
	  public void delete2(int data){
		   Node currentNode = head;
		   Node previousNode = null;
		   if(currentNode == null){
			   System.out.println("Empty");
		   }
		   
		   //loop through the list and if no value found 
		   while(currentNode != null && currentNode.data != data){
			   previousNode = currentNode; //currentNode equal to the previous node
			   currentNode = currentNode.next; //move next node
		   }
		   
		   if(currentNode != null && currentNode.data == data){
			   //given value is found, then delete it
			   head = currentNode.next; //now the currentNode.next(next value) is head  
		   }
		   previousNode.next = currentNode.next;
	   }
	  //delete node if it finds matching node
	  public void delete(int data){
		  Node currentNode = head; 
		  Node previousNode = null; //previous(->)
		  
		  if(currentNode == null){
			   System.out.println("Empty");
		   }
		  
		  while(currentNode != null && currentNode.data != data){
//			  currentNode.next = head;
//			  previousNode.next = currentNode.next; //now make the preivousNode skip one node
			  previousNode = currentNode; //now previousNode is the currentNode
			  currentNode = currentNode.next; //move next
//			  if(currentNode.data == data){ //if currentNode found
//				  head = currentNode.next;
//				  previousNode.next = currentNode.next;
//			  }
		  }
		  if(currentNode != null && currentNode.data == data){ //if currentNode found
			  head = currentNode.next;
			  
		  }
		  previousNode.next = currentNode.next;
	  }
	  
  public static void main(String[] args) {
	LinkedListEx list = new LinkedListEx();
     list.insert(1);
     list.insert(2);
     list.insert(3);
     list.insert(4);
     list.insert(5);
     list.delete2(2);
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
