package Sorting;
import java.util.Arrays;

public class RadixSort 
{
    static void show(int arr[],int n,int div)
    {
        int a[]=new int[10];
        Arrays.fill(a,0);

        for(int i=0;i<n;i++)
        {
            a[arr[i]/div%10]++;
        }
        for(int i=1;i<10;i++)
        {
            a[i]+=a[i-1];
        }

        int strArr[]=new int[arr.length];

        for(int i=n-1;i>=0;i--)
        {
            strArr[a[arr[i]/div%10]-=1]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=strArr[i];
        }
    }
    static void radixSort(int arr[],int n)
    {
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        for(int i=1;i<=max;i=i*10)
        {
           show(arr,n,i);
        }
    }
    public static void main(String args[])
    {
        int arr[]={329,457,657,839,436,720,355};
        radixSort(arr,arr.length);
        for(int i:arr)System.out.print(i+" ");
    }
    
}
