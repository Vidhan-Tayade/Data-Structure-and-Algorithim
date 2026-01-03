package Sorting;
class InsertionSort
{
	public static void main(String args[])
	{
		int arr[]={56,29,35,42,15,41,75,21};
		int i,j,n=8;
		int val;
		
		for(i=1 ; i<n ; i++)
		{
			val=arr[i];
			for(j=i ; j>0 ; j--)
			{
				if(arr[j-1]>val)
					arr[j]=arr[j-1];
				else
					break;
			}
			arr[j]=val;
		}
		
		for(int a:arr)System.out.print(a+" ");
		
	}
}