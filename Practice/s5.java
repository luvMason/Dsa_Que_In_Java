package Practice;

public class s5 {
    public static void main(String[] args) {
        String s="Love mason";
        String ans=camel(s);
        System.out.println(ans);
    }
    public static String camel(String str){
        String ans="";
        char fc=str.charAt(0);
        if(fc>='A'&&fc<='Z'){
            fc=(char)(fc-'A'+'a');
        }
        ans+=fc;
        
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char pre=str.charAt(i-1);
            if(pre==' '){
                if(curr>='a'&&curr<='z'){
                    curr=(char)(curr-'a'+'A');
                }
                ans+=curr;
            }
            else if(curr!=' '){
                ans+=curr;
            }
        }
        return ans;
    }
    
}
