package string;

public class reverseString {
    public static void main(String[] args) {
        String str="love";
        String res=reverse(str);
        System.out.println(res);
       
    }
    public static String reverse(String s){
        int l=s.length();
         String ans="";
        for(int i=l-1;i>=0;i--){
            char ch=s.charAt(i);
          ans+=ch;
           
        }
        return ans;
    }
    
    
}
