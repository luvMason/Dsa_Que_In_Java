package practice_1;



public class s5 {
    public static void main(String[] args) {
        String s="love mason ";
        String ans=removeSpace(s);
        System.out.println(ans);
    }
    public static String removeSpace(String str){
        String ans="";
        char fc=str.charAt(0);
        if(fc>='a'&&fc<='z'){
            fc=(char)(fc-'a'+'A');
        }
         ans+=fc;

         for(int i=1;i<str.length();i++){
         char pre=str.charAt(i-1);
         char curr=str.charAt(i);


         if(pre==' '){
            if(curr>='a'&&curr<='z'){
                curr=(char)(curr-'a'+'A');

                //ans+=curr;
            }
        }
        ans+=curr;
         }
         return ans;
    }
}
