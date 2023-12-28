package Practice;

public class str2 {
    public static void main(String[] args) {
        String s="lovlol";
        boolean ans=palindrome(s);
        System.out.println(ans);
    }
    public static boolean palindrome(String str){
        int start=0;
        int end=str.length()-1;
        boolean flag=true;
       while(start<end){
            char chF=str.charAt(start);
            char chL=str.charAt(end);
            if(chF!=chL){
                flag =false;
                break;
            }
           start++;
           end--;
        }
        return flag;
    }
    
}
