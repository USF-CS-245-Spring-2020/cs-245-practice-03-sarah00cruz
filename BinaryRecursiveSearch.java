public class BinaryRecursiveSearch implements Practice03Search{
	public int search(int [] arr, int target){
		return search(arr, target, 0, arr.length-1);
	}
	public int search(int [] arr, int target, int min, int max){//override function

		if(max>=min){
			int mid = (min+max)/2;
			if(arr[mid]==target) //if found return the target
				return mid;
			else if (arr[mid]<target) //change mid up
				return search(arr, target, mid+1, max);//calls it recursively

			else //change mid down
				return search(arr, target, min, mid-1);//calls it recursively
		}
		return -1;
	}
}