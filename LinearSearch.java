public class LinearSearch implements Practice03Search{
	public int search(int [] arr, int target)
	{
		for(int i =0;i<arr.length;i++) //goes through list and return target
		{
			if(arr[i]==target)
				return i;
		}
		return -1;
	}
}