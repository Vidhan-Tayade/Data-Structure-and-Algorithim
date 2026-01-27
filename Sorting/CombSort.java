package Sorting;

public class CombSort {

    static int count=1;

    static void combSort(int arr[], int n, int g)
    {
        if(g<1)count--;
        if(g<1)return;
        System.out.println(g);
        for(int i=0; i<n-g; i++)
        {
            if(arr[i] > arr[i+g])
            {
                int t=arr[i];
                arr[i]=arr[i+g];
                arr[i+g]=t;
            }
        }
        combSort(arr, n, (int)(g/1.3));
    }
    public static void main(String[] args) {
        int arr[]={5,0,6,2,7,1,8,4,9,3,12,11,5};
        int n=arr.length;
        combSort(arr,n,(int)(n/1.3));
        for(int i:arr)System.out.print(i+" ");
    }
    
}
