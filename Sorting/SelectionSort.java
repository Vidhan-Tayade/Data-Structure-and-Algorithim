package Sorting;
class SelectionSort
{
	public static void main(String args[])
	{
		int arr[]={56,29,35,42,15,41,75,21};
		int i,j,min;
		int n=8;
		
		for(i=0 ; i<n-1 ; i++)
	    {
			min=i;
			for(j=i+1 ; j<n ; j++)
			{
				if(arr[min]>arr[j])
					min=j;
			}
			if(min!=i)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		for(int a:arr)System.out.print(a+" ");
	}
}