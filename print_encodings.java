// 1. You are given a string str of digits. (will never start with a 0)

// 2. You are required to encode the str as per following rules

//     1 -> a

//     2 -> b

//     3 -> c

//     ..

//     25 -> y

//     26 -> z


import java.io.*;
import java.util.*;

public class print_encodings{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String enc_str = sc.nextLine();
        printEncodings(enc_str,"");
    }
    public static ArrayList<String> map = new ArrayList<String>(){
            {
                add("a");

    add("b");

     add("c");

     add("d");

     add("e");

     add("f");

     add("g");

     add("h");

     add("i");

     add("j");

     add("k");

     add("l");
     add("m");
     add("n");
     add("o");
     add("p");
     add("q");
     add("r");
     add("s");
     add("t");
     add("u");
     add("v");
     add("w");
     add("x");
     add("y");
     add("z");

            }};
    public static void printEncodings(String str,String ans) {
        //base condition
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }

        else if(str.length()==1)
        {
            String c1 = str.charAt(0)+"";
            if(c1.equals("0"))
            {
                return;
            }
            else{
            String str_1=str.substring(1);
            int n1 = Integer.parseInt(c1);
            String choice1 = map.get(n1-1);
            System.out.println(ans+choice1);
            return;
            }
        }
        else
        {
            String c1 = str.charAt(0)+"";
            if(c1.equals("0"))
            {
                return;
            }else{
            String str_1=str.substring(1);
            int n1 = Integer.parseInt(c1);
            String choice1 = map.get(n1-1);
            printEncodings(str_1,ans+choice1);}


            String c2 = str.substring(0,2);
            String str_2 = str.substring(2);
            int n2 = Integer.parseInt(c2);
            if(n2<=26)
            {
                String choice2 = map.get(n2-1);
            printEncodings(str_2,ans+choice2);
            }
        }
        
        
        

    }

}