public class BubbleSort implements Practice03Sort{
	public void sort(int[]a)
	{
		for(int i=0;i<(a.length-1);i++) //goes through array
			for(int j=0;j<(a.length-i-1);j++)
				if(a[j]>a[j+1]){ //if statement that allows numbers to "bubble" to the top
					int temp=a[j]; 
					a[j]=a[j+1];
					a[j+1]=temp;
				}
		
	}
}