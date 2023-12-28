package Practice;



public class str8 {
    public static void main(String[] args) {
        String s="llll kkkk sssueir";
        String ans=removeDuplicate(s);
        System.out.println(ans);
    }
    public static String removeDuplicate(String str){
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
