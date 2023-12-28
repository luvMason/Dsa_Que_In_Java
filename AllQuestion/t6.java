package AllQuestion;

public class t6 {
    public static void main(String[] args) {
        String s="love mason";
        String ans=reverseWord(s);
        System.out.println(ans);
    }
    public static String reverseWord(String str){
        String ans="";
        String[]arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            String rev=reverse(s);
            ans+=rev+" ";
        }

        return ans;

    }

    public static String reverse(String str){
       StringBuilder sb=new StringBuilder(str);

       sb.reverse();
       String ans=sb.toString();
       return ans;
    
    }
    
}
