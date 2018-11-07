package com.stack;
/*
 * https://java2blog.com/implement-stack-using-array-in-java/
 * Implement Stack using Array in java
 */
import java.util.Arrays;

public class StackCustom {
   int size;
   int arr[];
   int top;
   
   StackCustom(int size){
	   this.size =size;
	   this.arr = new int[size];
	   this.top = -1;
   }
   public void push(int pushedElement){
	   if(!isFull()){
		   top++;
		   arr[top] = pushedElement;
		   System.out.println("pushed element:" + pushedElement);
		   
	   }else{
		   System.out.println("Stack is full!");
	   }
   }
   
   public int pop(){
	   if(!isEmpty()){
		   int returnTop = top;
		   top--;
		   System.out.println("Popped element:" + arr[returnTop]);
		   return arr[returnTop];
	   }else{
		   System.out.println("Stack is empty!");
		   return -1;
	   }
   }
   public int peek(){
	   return arr[top];
   }
   public boolean isEmpty(){
	   return (top == -1);
   }
   public boolean isFull(){
	   return (size-1 == top);
   }
   publci StackCustom sortStack(StackCustom s2){
   }
   
   @Override
public String toString() {
	return "StackCustom [size=" + size + ", arr=" + Arrays.toString(arr)
			+ ", top=" + top + "]";
}
public static void main(String[] args) {
	   //size with 10
	StackCustom stackCustom = new StackCustom(5);
	stackCustom.pop();
	stackCustom.push(1);
	stackCustom.push(2);
	stackCustom.push(3);
	System.out.println("pop-------after push");
	stackCustom.pop();
	stackCustom.pop();
	stackCustom.pop();
	stackCustom.sort(new StackCustom(5));

	
}
}
