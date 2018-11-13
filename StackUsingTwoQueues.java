package com.stack;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Stack demonstrates Queue(Last In First Out LIFO) with LinkedList
 * Push: 
 * 1) if first queue is empty, then add value to first queue
 * 2) if first queue is not empty, then copy all the value to second queue
 *    then add newest value to the first queue and lastly bring back all the value
 *    back into the first queue.
 * pop:
 * remove value from first queue
 * 
 */
public class StackUsingTwoQueues {
  Queue<Integer> firstQ;
  Queue<Integer> secondQ;
  
  StackUsingTwoQueues(){
	  firstQ = new LinkedList<Integer>();
	  secondQ = new LinkedList<Integer>();  
  }
  //insert value into the queue
  public void push(int value){
	  if(firstQ.isEmpty()){
		  firstQ.add(value);
	  }else{
		  //if firstQueue is not empty then copy 
		  //the value to secondQueue
		  int sizeOfQueue1 = firstQ.size();
		  for(int i=0; i<sizeOfQueue1; i++){
			  secondQ.add(firstQ.remove()); //add all the first queue into second queue 
		  }
		  firstQ.add(value); //add new value to first Queue
		  //copy back all second queue back into first queue
		  //loop second queue value
		  for(int j=0; j<sizeOfQueue1; j++){
			  firstQ.add(secondQ.remove());
		  }
	  }
  }
  public int pop(){
	  if(firstQ.isEmpty()){
		  System.out.println("Empty queue");
	  }
		  return firstQ.remove();
		  
  }
  public static void main(String[] args) {
	StackUsingTwoQueues stackQ = new StackUsingTwoQueues();
	stackQ.push(1);
	stackQ.push(2);
	stackQ.push(3);
	System.out.println("FirstQueue");
	printQ(stackQ.firstQ);
	stackQ.pop();
	System.out.println("FirstQueue after pop 1 value out");
	printQ(stackQ.firstQ);
	System.out.println("size of first queue " +  stackQ.firstQ.size());
}
  /*
   * first queue: 1  ->    ->  2 1 ->      ->  3  -> 3 2 1 
   * second queue:   -> 1  ->      -> 2 1  ->     -> 
   * 
   */
  
private static void printQ(Queue<Integer> firstQ2) {
	// TODO Auto-generated method stub
	for(Integer q: firstQ2){
		System.out.println(q);
	}
 }  
}
