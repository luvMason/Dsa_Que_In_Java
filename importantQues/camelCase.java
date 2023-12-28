package importantQues;

public class camelCase {
    public static void main(String[] args) {
        String s="Love mason";
        String ans=camelCase(s);
        System.out.println(ans);
    }

    public static String camelCase(String str){
        String ans="";

        char ch=str.charAt(0);
        if(ch>='A'&&ch<='z'){
            ch=(char)(ch-'A'+'a');
        }
        ans+=ch;

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
