// 1. You are given an array(arr) of integers and a pivot.

// 2. You have to re-arrange the given array in such a way that all elements smaller or equal to pivot lie on the left side of pivot and all elements greater than pivot lie on its right side.

// 3. You have to achieve this in linear time.


import java.io.*;
import java.util.*;

public class partition_an_array {

  public static void partition(int[] arr, int pivot){
    //write your code here

    //unexplored region - right -> arr.length-1
    // greater than pivot - left -> right -1
    // less than or equal to pivot - 0 -> left-1

    int left =0;
    int right =0;
    while(right<arr.length)
    {
      if(arr[right]>pivot)
      {
        right++;
      }
      else{
        swap(arr,right,left);
        left++;
        right++;
      }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = scn.nextInt();
    partition(arr,pivot);
    print(arr);
  }

}