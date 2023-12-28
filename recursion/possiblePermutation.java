package recursion;

import java.util.ArrayList;

public class possiblePermutation {
    public static void main(String[] args) {
    
        String s="abc";
         ArrayList<String> ans = new ArrayList<>() ;
         StringPermutation( s, "");
       // StringPermutation(s, "", ans);

        System.out.println(ans);                                                           
    }
    public static void StringPermutation(String str,String ans){
         if(str.length()==0){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String fp=str.substring(0,i);
            String sp=str.substring(i+1);

            String rem=fp+sp;
            StringPermutation(rem,ans+ch);
            
        }
    }
    
     public static void StringPermutation(String str,String ans , ArrayList<String> res ){

        if(str.length()==0){
            res.add(ans);
            return ;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String fp = str.substring(0, i);
            String sp = str.substring(i+1);
            String rem = fp+sp;

            StringPermutation(rem, ans+ch,res);
        }

    }
}

