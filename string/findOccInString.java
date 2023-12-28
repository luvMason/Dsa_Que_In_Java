package string;

public class findOccInString {
public static void main(String[] args) {
         String s="java is a language";
        
        int ans= check(s);
        System.out.println(ans);
    }
    public static int check(String s){
          
        char k='a';  
        int count=0;
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch==k){
            count++;
            

           }
        }
         
        return count;
      }    
    
}
