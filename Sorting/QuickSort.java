package Sorting;
public class QuickSort {
    static int partition(int arr[],int si,int n)
    {
        int pi=arr[n];
        int i,p,t;
        i=p=si;
        for( ; i<n ;i++)
        {
            if(arr[i]<pi)
            {
                t=arr[i];
                arr[i]=arr[p];
                arr[p]=t;
                p++;
            }
        }
        arr[n]=arr[p];
        arr[p]=pi;
        return p;
    }
    static void quickSort(int arr[],int si,int n)
    {
        if(si>=n)return;
        int prtn=partition(arr,si,n);
        quickSort(arr, 0, prtn-1);
        quickSort(arr, prtn+1, n);
    }
    public static void main(String[] args) {
        int arr[]={35,33,42,10,14,19,27,44,26,31};
        quickSort(arr,0,arr.length-1);
        for(int i:arr)System.out.print(i+" ");
    }
    
}
