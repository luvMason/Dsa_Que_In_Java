package string;

public class toggleCase {
    public static void main(String[] args) {
        String s="My name is love";
        String ans =convert(s);
        System.out.println(ans);
    }
    public static String convert(String s){
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                ch=(char)(ch-'a'+'A');
               // ans+=ch;
            }else if(ch>='A'&&ch<='Z'){
                ch=(char)(ch-'A'+'a');
                //ans+=ch;
            }else if(ch==' '){
            //   ans+=ch; 
                
            
            }
            ans+=ch;
         }
        return ans;
    }
}
