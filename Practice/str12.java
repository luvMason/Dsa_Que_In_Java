package Practice;

public class str12 {
    public static void main(String[] args) {
        String s="my name is love";
        String ans=reverseWord(s);
        System.out.println(ans);
    }
    public static String reverseWord(String str){
        String []arr=str.split(" ");
         String ans="";
        for(int i=0;i<arr.length;i++){
          String revWord=reverse(arr[i]);
         ans=ans+revWord+" ";
        }
        return ans;

    }
    public static String reverse(String str){
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            ans+=ch;
        }
        return ans;
    }
    
}
