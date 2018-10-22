package com.binarysearch;
/* https://java2blog.com/binary-search-java/
 * 1) Initialize first=0 last= sortedArray.length-1
 * 2) compute mid and compare sortedArray[mid] with element
 * to be searched
 * 3) If element to be searched is less than sortedArray[mid], 
 * then element would lie in left side, so last=mid-1
 * 4) If element to be searched is greater than sortedArray[mid]
 * then element lies in right part, so first=mid+1
 * 5)If element = sortedArray[mid], elementToBeSearched found, return index
 * 6) Repeat above the step until first is less than last
 */
public class BinarySearchMain {
   public static void main(String[] args) {
	   int[] sortedArray={1,2,3,4,5,6,7,8};
		int indexOfElementToBeSearched=binarySearch(sortedArray,7);
		System.out.println("Index of 7 in array is: " +indexOfElementToBeSearched);

		int indexOfElementToBeSearchedNotFound=binarySearch(sortedArray,0);
		System.out.println("Index of 0 in array is: " +indexOfElementToBeSearchedNotFound);
	
}

private static int binarySearch(int[] sortedArray, int elementToBeSearched) {
	// TODO Auto-generated method stub
	int first=0;//first index
	int last = sortedArray.length-1;//last index of array
	
	while(first <= last){
		int mid = (first + last)/2;
		if(elementToBeSearched < sortedArray[mid]){
			//search in the left side
			last = mid-1;
		}else if(elementToBeSearched > sortedArray[mid]){
			//search in the right side
			first = mid+1;
		}else{ //element found
			return mid;
		}
	}
	
	return -1; //element is not in the array
}
}
