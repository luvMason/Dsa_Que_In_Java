package sorting.repeat;
import java.util.*;
public class subsequence {
    public static void main(String[] args) {
        String s="abc";
        ArrayList<String>ans=sub(s);
          System.out.println(ans);
    }
    public static ArrayList<String>sub(String str){
        if(str.length()==0){
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        String rem=str.substring(1);
        ArrayList<String>rans=sub(rem);

        ArrayList<String>ans=new ArrayList<>();

        for(String s:rans){
            ans.add(s);
            ans.add(ch+s);
        }
        Collections.sort(ans);
        
        return ans;
    }
}
