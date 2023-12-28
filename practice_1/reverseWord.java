package practice_1;

public class reverseWord {
    public static void main(String[] args) {
        String s="love";
        String ans = "";
        reverse1(s,s.length()-1,"");
        // System.out.println(ans);


    }
    // public static String reverse(String str){
    //     if(str.length()==0||str.length()==1){
    //         return str;
    //     }
    //     char ch=str.charAt(str.length()-1);
    //     String rem=str.substring(0,str.length()-1);
    //     String arem=reverse(rem);
    //     String ans=ch+arem;

    //     return ans;
    // }
    public static void reverse1(String str,int idx,String ans){
         if(idx==-1){
            System.out.println(ans);
            return ;
         }
        char ch=str.charAt(idx);
        reverse1(str,idx-1,ans+ch);

    }
    
    
}
