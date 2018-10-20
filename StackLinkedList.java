package com.stack;

/*
 * Implement stack with LinkedList 
 * LinkedList use node
 */
public class StackLinkedList {
  private Node head; //first node
  
  //we need a nested class to define linkedlist node
  private class Node{
	  int value;
	  Node next;
  }
  
  StackLinkedList(){ //start empty first
	  head = null;
  }
  //add value into the list
  public void push(int value){
	  Node oldHead = head;
	  head = new Node();
	  head.value = value;
	  head.next = oldHead;
  }
  //remove value from the beginning of the list
  public int pop(){
	  if(head == null){
		  System.out.println("Empty");
	  }
	  int value = head.value;
	  head = head.next;
	  return value;
  }
  
  public static void main(String[] args) {
	StackLinkedList linklist = new StackLinkedList();
	//linklist.pop(); throw nullpointer exception if you try to remove with head =null
	linklist.push(1);
	linklist.push(2);
	linklist.push(3);
	System.out.println("List pop-----after push");
	linklist.pop(); //remove 3
	//linklist.pop(); //remove 2
	
	printlist(linklist.head);
  }
	public static void printlist(Node head){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.value);
			temp = temp.next;
	}
	
}
}
