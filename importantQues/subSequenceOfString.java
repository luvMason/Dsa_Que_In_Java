package importantQues;

import java.util.*;

public class subSequenceOfString {
    public static void main(String[] args) {

        String s="abc";
        ArrayList<String>ans=subsequence(s);
        System.out.println(ans);

    }
    public static ArrayList<String> subsequence(String str){
        if(str.length()==0){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }

        char ch=str.charAt(0);
        String rem=str.substring(1);
        ArrayList<String>rans=subsequence(rem);
        ArrayList<String>ans=new ArrayList<>();

        for(String s:rans){
          ans.add(s);
          ans.add(ch+s);
        }
        return ans;
    }
    
}
