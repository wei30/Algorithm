public class FindSecondLargest{
	int[] arr={7,5,6,1,4,2};
	int secondlargest=0;
	int largest=0;
	for(int i=0; i<arr.length; i++){
		//loop around then find the second largest, first find the largest first and from there you find the second largest
		if(arr[i] > largest){
		  secondlargest = largest;
			largest = arr[i];
		}else if(arr[i] > secondlargest){
			secondlargest = arr[i];
		}
	}
}
