import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printPermutations(s,"");
    }

    public static void printPermutations(String str, String asf) {
        //base case
        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }
        //recursive call
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            String s=str.substring(0,i)+str.substring(i+1);
            printPermutations(s,asf+c);
        }


    }

}