
// 1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.

// 2. The following list is the key to characters map :

//     0 -> .;

//     1 -> abc

//     2 -> def

//     3 -> ghi

//     4 -> jkl

//     5 -> mno

//     6 -> pqrs

//     7 -> tu

//     8 -> vwx

//     9 -> yz



import java.io.*;
import java.util.*;

public class get_kpc {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String arg = sc.next();
        ArrayList<String> ans = getKPC(arg);
        System.out.println(ans);
    }

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0)
        {
                    ArrayList<String> ans = new ArrayList<String>();
return ans;
        }    
        
        String c = str.substring(0,1);
        int index = Integer.parseInt(c);

        str=str.substring(1,str.length());
        ArrayList<String> ret = getKPC(str);
        ArrayList<String> map = new ArrayList<String>(){
            {
                add(".;");

    add("abc");

     add("def");

     add("ghi");

     add("jkl");

     add("mno");

     add("pqrs");

     add("tu");

     add("vwx");

     add("yz");

            }
        };

        ArrayList<String> ans = new ArrayList<String>();
   

    String cases = map.get(index);
    for(int i=0;i<cases.length();i++)
    {   
        if(ret.size()==0)
        {
            String n_s = cases.charAt(i)+"";
            ans.add(n_s);
        }
        else{
         for( String s: ret)
        {
            String n_s = cases.charAt(i)+s+"";
            ans.add(n_s);
        }
        }
    }
        
        return ans;
    }

}