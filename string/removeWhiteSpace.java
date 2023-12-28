package string;

public class removeWhiteSpace {
    public static void main(String[] args) {
         String s="java is a language";
        
        String ans= check(s);
        System.out.println(ans);
    }
    public static String check(String s){
          
          
        String res="";
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch!=' '){
            res+=ch;
            

           }
        }
         
        return res;
      }
    
}
