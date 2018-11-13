public boolean detectLoopLinkedList(){ //return true if there loop in linkedlist else no loop
	//to determine if there is loop first create a faster node and slower node 
	//if they met then it is a loop else is not a loop
	//both start head
	Node fastptr = head;
	Node slowptr = head;
	while(fastptr != null && fastptr.next != null){
		if(fastptr == slowptr){
			//they are equal 
			//found a loop
			return true;
		}
		fastptr = fastptr.next.next; //move two node
		slowptr = slowptr.next; 
	}
	return false;
}
