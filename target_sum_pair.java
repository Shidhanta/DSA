
// 1. You are given an array(arr) of distinct integers and a target.

// 2. You have to print all the pairs having their sum equal to the target.


import java.io.*;
import java.util.*;

public class  target_sum_pair{

  public static void targetSumPair(int[] arr, int target){
    //write your code here
    Arrays.sort(arr);
    int left=0;
    int right = arr.length-1;
    while(left<right)
    {
      int sum = arr[left]+arr[right];
      if(sum<target)
      {
        left++;
      }
      else if(sum>target)
      {
        right--;
      }
    else
      {
        System.out.println(arr[left]+", "+arr[right]);
        left++;
        right--;
      }
    }

  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }

}