package Practice;

public class str13 {
    public static void main(String[] args) {
        
        String s="love mason is good person";
        String ans=camelCase(s);
        System.out.println(ans);
    }
    public static String camelCase(String str){
        String ans="";
        char fc=str.charAt(0);
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
                ans+=curr;
            }else if(curr!=' '){
                ans+=curr;
            }
        }
        return ans;
    }
}
