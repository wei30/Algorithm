package com.linkedlist;
/*
 * Reverse the linkedList 
 */
public class ReverseLinkedList {
	Node head;
  static class Node{
	  Node next;
	  int data;
	  public Node(){}
	  public Node(int data){
		  this.data=data;
	  }
  }
  public void insertAtTheEnd(int data){
	  Node currentNode = head;
	  if(head == null){
		  //create new node
		  head = new Node(data);
		  return;
	  }
	  while(currentNode.next != null){
		  currentNode = currentNode.next;
	  }
	  //at the end of the list need to add node
	  Node newNode = new Node(data);
	  currentNode.next = newNode;
  }
  public static Node reverseList(Node currentNode){
	  Node previousNode = null;
	  Node nextNode;
	  while(currentNode != null){
		  nextNode = currentNode.next;
		  currentNode.next = previousNode;
		  currentNode = nextNode;
	  }
	  return previousNode;
  }
  //middle value in linkedlist no use in length
  //find loop in linkedlist
  public static void main(String[] args) {
     ReverseLinkedList list = new ReverseLinkedList();
        list.insertAtTheEnd(10);
        list.insertAtTheEnd(12);
        list.insertAtTheEnd(14);
        list.insertAtTheEnd(16);
        list.insertAtTheEnd(18);
		list.printList(new Node(10));
		//Reversing LinkedList
		Node reverseHead=reverseList(new Node(10));
		System.out.println("After reversing");
		list.printList(reverseHead);
}
private void printList(Node head) {
	// TODO Auto-generated method stub
	
	Node node = head;
	while(node != null){
		System.out.println("data " + node.data );
		node = node.next;
	}
}
}
