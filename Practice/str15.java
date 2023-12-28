package Practice;

import java.util.*;

import recursion.palindrome;

public class str15 {
    public static void main(String[] args) {
         String s="aba";
         palindrome(s);

    }
    public static void palindrome(String str){
        ArrayList<String>al=new ArrayList<>();

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String sub=str.substring(i,j);
                boolean ans=checkPalindrome(sub);
                if(ans==true && al.contains(sub)==false){
                    al.add(sub);
                }
            }
        }
       
        System.out.println(al);
    }
    

    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        boolean flag = true;
        while (start < end) {
            char s = str.charAt(start);
            char e = str.charAt(end);
            if (s != e) {
                flag = false;
                break;
            }
            start++;
            end--;
        }
        return flag;
    }

}
