package stack;

import java.util.Stack;

public class reverseWord {
    public static void main(String[] args) {
        String s="love mason";
        String ans=reverse(s);
        System.out.println(ans);
    }
    public static String reverse(String str){
        Stack<Character>st=new Stack<>();

        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){
            sb.append(st.pop());
        }

        return sb.toString();
    }
}
