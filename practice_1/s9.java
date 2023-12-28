package practice_1;

public class s9 {
    public static void main(String[] args) {
        String s="love mason";
        String ans=reverseW(s);
        System.out.println(ans);
    }
    public static String reverseW(String str){
        String ans="";
        String[] sp=str.split(" ");
        for(int i=0;i<sp.length;i++){
            String rev=reverse(sp[i]);
            ans+=rev+" ";
        }
        return ans;
    }
    // public static String reverseWord(String str){
    //     String[]arr=str.split(" ");
    //    String ans ="";
    //    for(int i=0;i<arr.length;i++){
    //     String temp=arr[i];
    //     String rev=reverse(temp);
    //     ans+=rev+" ";
    //    }
    //    return ans;
    // }

    public static String reverse(String str){
       String ans="";
       for(int i=str.length()-1;i>=0;i--){
        char ch=str.charAt(i);
        ans+=ch;
       }
       return ans;
    }
}
