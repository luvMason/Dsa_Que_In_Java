package practice_1;

public class s6 {
    public static void main(String[] args) {
        String s="lllovvee ";
        String ans=removeDupli(s);
        System.out.println(ans);
    }
    public static String removeDupli(String str){
        
        String ans="";

        char fc=str.charAt(0);
        ans+=fc;

        for(int i=1;i<str.length();i++){
            char pre=str.charAt(i-1);
            char curr=str.charAt(i);

            if(pre!=curr){
                ans+=curr;
            }
        }
        return ans;
    }
    
}
