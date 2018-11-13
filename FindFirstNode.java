//To find the firstNode of loop of linkedlist
// first determine if there is a loop first
//after detect if there is a loop, move both nodes by one if both
//node match then thats the starting node
public Node findFirstNode(){
	Node slowptr = head;
	Node fastptr = head;
	boolean loop = false;
	while(fastptr != null && fastptr.next != null){
		if(fastptr == slowptr){
			loop = true;
			break;
		}
		fastptr = fastptr.next.next;
		slowptr = slowptr.next;
	}
   //after if there is loop, check whats the starting node of a node
	if(loop == true){
		
	}
}
