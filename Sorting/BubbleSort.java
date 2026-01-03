package Sorting;
class BubbleSort
{
	public static void main(String args[])
	{
		int arr[]={5,4,3,2,1};
		int n=5;
		boolean swapped;
		
		for(int i=n-2 ; i>=0 ; i--)
		{
			swapped=false;
			for(int j=0 ; j<=i ; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped)break;
		}
		for(int i:arr)
		System.out.println(i);
	}
}