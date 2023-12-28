package StringBuild;

public class removeWhiteSpaces {
public static void main(String[] args) {
         String s="java is a language";
        
        String ans= check(s);
        System.out.println(ans);
    }
    public static String check(String s){
        StringBuilder sb=new StringBuilder();
          
          
        
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch!=' '){
           sb.append(ch);
            

           }
        }
        
        String res=sb.toString();
         
        return res;
      }
    
}

    

