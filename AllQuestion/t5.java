package AllQuestion;

import whileLoopBasic.sumOfNat;

public class t5 {
    public static void main(String[] args) {
        
        String s="Love mason";
    
        String ans=convertCamelCase(s);
        System.out.println(ans);
    }
    public static String convertCamelCase(String str){
           char fc=str.charAt(0);

           String ans="";
           if(fc>='A'&&fc<='Z'){
            fc=(char)(fc-'A'+'a');
           }

           ans+=fc;

           for(int i=1;i<str.length();i++){
            char pre=str.charAt(i-1);
            char curr=str.charAt(i);
            if(pre==' '){
                if(curr>='a'&&curr<='z'){
                    curr=(char)(curr-'a'+'A');
                }
                
            }
            if(curr!=' '){
                ans+=curr;
            }
           }

       return ans;

    }

    
    
}
