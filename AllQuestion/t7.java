package AllQuestion;
import java.util.*;




public class t7 {

    public static void main(String[] args) {
        String s="abc";
        ArrayList<String>ans=subSequenceOfString(s);
        System.out.println(ans);
    }

    public static ArrayList<String>subSequenceOfString(String str){
        if(str.length()==0){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }

        char ch=str.charAt(0);
        String rem=str.substring(1);
        ArrayList<String>rans=subSequenceOfString(rem);

        ArrayList<String>ans=new ArrayList<>();

        for(String s:rans){
            ans.add(s);
            ans.add(ch+s);
        }
              return ans;
    }
    
}
