package AllQuestion.aaaaa;

public class palindrome {
    public static void main(String[] args) {
        String s="weeeww";
        boolean ans=check(s,0,s.length()-1);
        System.out.println(ans);

    }

    public static boolean check(String str,int s,int e){
        if(s>e){
            return true;

        }else if(str.charAt(s)!=str.charAt(e)){
            return false;
        }else{
            boolean ans=check(str,s+1,e-1);

            return ans;
        }
    }
}
