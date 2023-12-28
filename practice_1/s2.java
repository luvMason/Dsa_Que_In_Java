package practice_1;

public class s2 {
    public static void main(String[] args) {
        String s="radari";
        boolean ans=checkPalin(s);
        System.out.println(ans);
    }
    public static boolean checkPalin(String str){
        int  s=0;
        int e=str.length()-1;

        while(s<e){
            char first=str.charAt(s);
            char last=str.charAt(e);
            if(first!=last){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    
}
