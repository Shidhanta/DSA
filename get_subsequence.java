// 1. You are given a string str.

// 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.





import java.io.*;
import java.util.*;

public class get_subsequence{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = new String("");
        s=sc.nextLine();
        ArrayList<String> ans = gss(s);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0)
        {
            ArrayList<String> sol = new ArrayList<String>();
            sol.add("");
            return sol;
        }

       char c = str.charAt(0);
       String s = str.substring(1,str.length());

       ArrayList<String> res = gss(s);
       ArrayList<String> ans = new ArrayList<String>();
       for(String st : res)
       {
           ans.add(st);
       }
       for(String st : res)
       {
           String s_ = c+st;
           ans.add(s_);
       }

       return ans;
    }

}