package AllQuestion.aaaaa;
import java.util.*;

public class getSubsequence {
    public static void main(String[] args) {
        String a="abc";
        ArrayList<String>ans=get(a);
        System.out.println(ans);
    }

    public static ArrayList<String> get(String str){
        if(str.length()==0){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }

        char ch=str.charAt(0);
        String rem=str.substring(1);

        ArrayList<String>rres=get(rem);

        ArrayList<String>ans=new ArrayList<>();

        for(String s:rres){
            ans.add(s);
            ans.add(ch+s);
        }

        return ans;
    }
}
