// https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1#



// { Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG obj = new GfG();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}// } Driver Code Ends



class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        return recurs(arr,0,n-1);
       
    }
    public static int recurs(int[] arr,int lo, int hi )
    {   
        if(lo>hi)
        {
            return -1;
        }
        int mid = (lo+hi)/2;
        if(arr[mid]==1)
        {
            int counter=mid;
            while(counter>-1 && arr[counter]==1)
            {
                counter--;
            }
            return counter+1;
        }
        else
        {
            return recurs(arr,mid+1,hi);
        }
    }
}