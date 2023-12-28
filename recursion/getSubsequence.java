package recursion;

import java.util.ArrayList;

public class getSubsequence {

    
public static void main(String[] args) {
       String str="abc";
       ArrayList<String>ans=getSubsequence(str);
       System.out.println(ans);

    }
    public static ArrayList<String> getSubsequence(String str){
          if(str.length()==0){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;

          }
          char ch=str.charAt(0);
          String rem=str.substring(1);

          ArrayList<String> rres = getSubsequence(rem);
          
          ArrayList<String> ans=new ArrayList<>();
          for(String s:rres){
             ans.add(s);
             ans.add(ch+s);
          }
          return ans;
    }
}
