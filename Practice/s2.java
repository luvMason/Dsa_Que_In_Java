package Practice;

public class s2 {
    public static void main(String[] args) {
        String s="llllooooveeee";
        String ans=remove(s);
        System.out.println(ans);
    }
    public static String remove(String str){
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
