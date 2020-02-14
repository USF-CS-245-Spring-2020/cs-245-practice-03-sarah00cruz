//serach a sorted array by continuously dividing search interval in half

public class BinaryIterativeSearch implements Practice03Search{
	public int search(int [] arr, int target){
		int max = arr.length-1;
		int min = 0;
		while(max>=min){
			int mid = (min+max) /2;
			if(arr[mid]==target)
				return mid;//if target is found return number
			if(arr[mid]<target)
				min = mid+1;//make the mid higher
			else
				max = mid-1;//make the mid lower

		}
		return 0;
	}
}