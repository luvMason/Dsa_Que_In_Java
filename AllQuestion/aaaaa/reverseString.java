package AllQuestion.aaaaa;

public class reverseString {
    public static void main(String[] args) {
        String s="love";
        String ans=reverse(s,s.length()-1);
        System.out.println(ans);
    }

    public static String reverse(String str,int idx){
        if(str.length()==1){
            return str;
        }else if(idx==-1){
            return "";
        }

        char ch=str.charAt(idx);
        String pre=reverse(str,idx-1);
        return ch+pre;
    }
    
}
