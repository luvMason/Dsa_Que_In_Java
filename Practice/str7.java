package Practice;

public class str7 {
    public static void main(String[] args) {
        String s="my name is love mason";
        String ans=capital(s);
        System.out.println(ans);

    }
    public static String capital(String str){
        String ans="";
        char fc=str.charAt(0);
        if(fc>='a'&&fc<='z'){
            fc=(char)(fc-'a'+'A');
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
            ans+=curr;

        }
        return ans;
    }
    
}
