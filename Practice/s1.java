package Practice;

public class s1 {
    public static void main(String[] args) {
        String s="i love eat food";
        String ans=convert(s);
        System.out.println(ans);
    }
    public static String convert(String str){
        String ans="";
        char fc=str.charAt(0);
        if(fc>='a'&&fc<='z'){
            fc=(char)(fc-'a'+'A');

        }
        ans+=fc;
        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char pre=str.charAt(i-1);
            if(pre==' '){
                if(curr>='a'&&curr<='z'){
                    curr=(char)(curr-'a'+'A');
                }
            }
            ans+=curr;
        }
        return ans;
    }
    
}
