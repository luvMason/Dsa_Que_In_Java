package practice_1;

public class s12 {

    public static void main(String[] args) {
        String a="llloooveee";
        String ans=compress(a);
        System.out.println(ans);
    }
    public static String compress(String str){
        String ans="";
        int count=1;
        for(int i=1;i<str.length();i++){
            char pre=str.charAt(i-1);
            char curr=str.charAt(i);

            if(pre==curr){
                count++;
            }else{
                if(count>1){
                    ans+=count;
                }
                ans+=pre;
                count=1;
            }
        }
        if(count>1){
            ans+=count;
        }
        ans+=str.charAt(str.length()-1);
        return ans;
        
    }
}
