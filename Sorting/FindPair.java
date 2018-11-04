public class FindPair{
	//https://java2blog.com/find-pair-whose-sum-is-closest-to-zero-in-array/
	//sort the array 
	//give a left pointer and a right pointer 
	//check the sum<0 move the left pointer forward
	//else check the sum > 0 move the right pointer backward 
	int arr[] = new arr{1,2,-30, 3,4}
	Arrays.sort(arr);
	int minSum = Integer.Max_Value;
	int sum = arr[left] + arr[right];
	while(left < right){
		if(Math.abs(sum) < Math.abs(minSum)){
			minSum = sum;
			minleft = left;
			minRigth = right;
		}
		if sum < 0 ? left++ : right--;
	}
	
}
