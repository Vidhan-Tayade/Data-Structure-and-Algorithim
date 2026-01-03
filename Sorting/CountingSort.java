package Sorting;
import java.util.Arrays;

public class CountingSort 
{
    static int[] countsort(int arr[],int n)
    {
        //allow for negative value
        int min=arr[0];
        for(int i=1;i<n;i++)
        {
            if(min>arr[i])
                min=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i]-min;
        }
        //allow for big value
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        max++;
        int a[]=new int[max];
        Arrays.fill(a,0);

        //count occurance
        for(int i=0;i<n;i++)
        {
            a[arr[i]]++;
        } 

        //add with previous
        for(int i=1;i<a.length;i++)
        {
            a[i]=a[i]+a[i-1];
        } 

        //assing sort value to new arr
        int srtArr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            srtArr[ a[arr[i]]-=1 ]=arr[i]+min;
        }
        return srtArr;

    }
    public static void main(String[] args) {
        int arr[]={2,7,8,400,3,4,5,100,9};
        
        int srtArr[]=countsort(arr,arr.length);
        for(int i:srtArr)System.out.print(i+" ");
    }
    
}
