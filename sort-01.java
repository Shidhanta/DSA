// 1. You are given an array(arr) containing only 0's and 1's.

// 2. You have to sort the given array in increasing order and in linear time.

import java.io.*;
import java.util.*;

public class Main{

  public static void sort01(int[] arr){
    //write your code here
    int low=0;
    int high =0;
    while(high<arr.length)
    {
      if(arr[high]>0)
      {
        high++;
      }
      else
      { 
        swap(arr,high,low);
        low++;
        high++;

      }

    }

    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort01(arr);
    print(arr);
  }

}