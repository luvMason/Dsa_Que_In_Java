package practice_1;



public class s10 { 
    public static void main(String[] args) {
         
    String s="Hello in the world of java";
    String ans=camelCase(s);
    
    System.out.println(ans);
    }
    public static String camelCase(String s){

        String ans="";
        char fc=s.charAt(0);

        if(fc>='A'&&fc<='Z'){
           fc=(char)(fc-'A'+'a');
        }
        ans+=fc;

        for(int i=1;i<s.length();i++){
            char pre=s.charAt(i-1);
            char curr=s.charAt(i);

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
