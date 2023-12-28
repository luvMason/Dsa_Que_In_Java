package AllQuestion.aaaaa;

import java.util.Stack;

public class duplicateParenthesis {
    public static void main(String[] args) {
        Stack<Character>st=new Stack<>();
        String str="(a-b((a+b)))";
        boolean ans=check(str,st);
        System.out.println(ans);

    }
    public static boolean check(String str ,Stack<Character>st){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch==')'&&st.peek()=='('){
                return false;
            }else if(ch==')'){
                while(st.size()!=0&&st.peek()!='('){
                    st.pop();
                }
                st.pop();
            }else{
                st.push(ch);
            }
        }
        return true;
    }
}
