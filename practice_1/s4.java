package practice_1;

public class s4 {
    public static void main(String[] args) {
        String s="love shubham priyansh";
        int ans=findLongW(s);
        System.out.println(ans);
    }
    public static int findLongW(String str){

        int max=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch!=' '){
                count++;
            }else{
               max=Math.max(max, count);
               count=0;
            }
        }
         max=Math.max(max, count);
        return max;
    }
}
