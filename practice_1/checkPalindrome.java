package practice_1;

public class checkPalindrome {
    public static void main(String[] args) {
        String s="radar";
        boolean ans=check(s,0,s.length()-1);
        System.out.println(ans);

    }
    public static boolean check(String str,int start,int end){
        if(start>end){
            return true;


        }else if(str.charAt(start)!=str.charAt(end)){
            return false;
        }else{
            boolean ans=check(str,start+1,end-1);
            return ans;
        }

    }
    
}
