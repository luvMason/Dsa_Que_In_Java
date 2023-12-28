package Practice;

import Array.removeElement;
import string.removeWhiteSpace;

public class str5 {
    public static void main(String[] args) {
        String s="jdj ndf ndfjdiojf";
        String ans=removeWhiteSpace(s);
        System.out.println(ans);
    }
    public static String removeWhiteSpace(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
              ans+=ch;
            }

        }
        return ans;
    }
}
