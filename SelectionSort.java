public class SelectionSort implements Practice03Sort{
	public void sort(int [] a){
		for(int i=0;i<a.length-1;i++){
			swap(a,i,findmin(a,i)); //swaps nums with min
		}
	}
	int findmin(int[]a, int start){
		int min = start;
		for(int i=start;i<a.length;i++)
			if(a[i]<a[min])
				min = i; //captures min
		return min;
	}
	void swap(int[]a, int i, int j){ //swaps numbers
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}