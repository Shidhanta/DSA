 // 1. You are given a number n and a number m representing number of rows and columns in a maze.

// 2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).


import java.io.*;
import java.util.*;

public class get_mazepaths{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getMazePaths(0,0,n-1,m-1));
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr==dr && sc==dc)
        {
            ArrayList<String> ans = new ArrayList<String>();
            ans.add("");
            return ans;
        }

        if(sr>dr || sc > dc)
        {
            ArrayList<String> ans = new ArrayList<String>();
            return ans;
        }


        ArrayList<String> ans = new ArrayList<String>();

        ArrayList<String> path_right = getMazePaths(sr,sc+1,dr,dc);
        for(String s: path_right)
        {
            ans.add("h"+s);
        }
        

        ArrayList<String> path_down = getMazePaths(sr+1,sc,dr,dc);
        for(String s: path_down)
        {
            ans.add("v"+s);
        }

        
        return ans;
    }

}
