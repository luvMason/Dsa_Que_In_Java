package practice_1;

public class s13 {
    public static void main(String[] args) {
        String s="LoVe MaSoN";
        String ans=toggle(s);
        System.out.println(ans);
    }

    public static String toggle(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){
                ch=(char)(ch-'a'+'A');
            }else  if(ch>='A'&&ch<='Z'){
                ch=(char)(ch-'A'+'a');
            }
            ans+=ch;
        }
        return ans;
    }
}
