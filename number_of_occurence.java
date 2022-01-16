//https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1#

// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int lo=0;
	    int hi=n-1;
	    int count =0;
	    while(lo<=hi)
	    {
	        int mid = (lo+hi)/2;
	        if(arr[mid]== x)
	        {   
	            int lo_mid= mid;
	            while(lo_mid>=lo && lo_mid>-1)
	            {
	                if(arr[lo_mid]==x)
	                {
	                    count++;
	                    lo_mid--;
	                }
	                else
	                {
	                    break;
	                }
	            }
	            int hi_mid=mid+1;
	            while(hi_mid<n && hi_mid<=hi)
	            {
	                if(arr[hi_mid]==x)
	                {
	                    count++;
	                    hi_mid++;
	                }
	                else
	                {
	                    break;
	                }
	            }
	            break;
	        }
	        
	        else if( arr[mid]<x)
	        {
	            lo=mid+1;
	        }
	        else
	        {
	            hi=mid-1;
	        }
	    }
	    
	    return count;
    }
}
