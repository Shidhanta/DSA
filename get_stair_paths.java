// 1. You are given a number n representing number of stairs in a staircase.

// 2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStairPaths(n));

    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n==0)
        {
            ArrayList<String> ans = new ArrayList<String>();
            ans.add("");
            return ans;
        }

        if(n<0)
        {   
                        ArrayList<String> ans = new ArrayList<String>();
            return ans;
        }
        ArrayList<String> ans = new ArrayList<String>();
        //faith
        ArrayList<String> step_1 = getStairPaths(n-1);
        for(String s: step_1)
        {
            ans.add("1"+s);
        }
        ArrayList<String> step_2 = getStairPaths(n-2);
        for(String s: step_2)
        {
            ans.add("2"+s);
        }
        ArrayList<String> step_3 = getStairPaths(n-3);
        for(String s: step_3)
        {
            ans.add("3"+s);
        }
        return ans;
    }

}