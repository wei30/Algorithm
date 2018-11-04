public class MissingNum{
	while(low <= high){
		mid = low + ((high-low)/2);
		if(arr[mid] == num){
			return mid;
		}
		if(arr[mid] <=a[high]){ //lies right side 
			if(num > arr[mid] && num <=arr[high]){
				low = mid + 1;
			}else{
				high = mid - 1; 
			}
		}else{
		     //lies left side
			if(num <= arr[mid] && num > arr[low]){
				high = mid - 1;
			}else{
				low = mid + 1;
			}
		}
	}
}
