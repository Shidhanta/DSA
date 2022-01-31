// https://nados.io/question/dynamic-queue

import java.io.*;
import java.util.*;

public class Main {

  public static class CustomQueue {
    int[] data;
    int front;
    int rear;
    int size;

    public CustomQueue(int cap) {
      data = new int[cap];
      front = 0;
      size = 0;
    }

    int size() {
      // write ur code here
      return size;
    }

    void display() {
      // write ur code here
      int counter = size();
      int indx = front;
      while(counter-->0)
      {
        System.out.print(data[indx]+" ");
        indx=(indx+1)%data.length;
      }
      System.out.println();

    }

    void add(int val) {
      // write ur code here
      if(size==data.length)
      {
        //System.out.println("Queue overflow");
        
        dbl();
      }
      data[rear]=val;
      size++;
      rear=(rear+1)%data.length;

    }

    int remove() {
      // write ur code here
      if(size==0)
      {
        System.out.println("Queue underflow");
        return -1;
      }
      int val = data[front];
      front = (front+1)%data.length;
      size--;
      return val;
    }

    int peek() {
       // write ur code here
        if(size==0)
      {
        System.out.println("Queue underflow");
        return -1;
      }
      int val = data[front];
      return val;
    }
    
    void dbl()
    {
      int[] arr = new int[2*data.length];
      int counter=size();
      int idx = front;
      int curr_indx=0;
      while(counter-->0)
      {
        arr[curr_indx]=data[idx];
        curr_indx++;
        idx=(idx+1)%data.length;
      }
      front = 0; 
      rear=curr_indx;
      data=arr;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomQueue qu = new CustomQueue(n);

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("add")){
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if(str.startsWith("remove")){
        int val = qu.remove();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("peek")){
        int val = qu.peek();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(qu.size());
      } else if(str.startsWith("display")){
        qu.display();
      }
      str = br.readLine();
    }
  }
}
