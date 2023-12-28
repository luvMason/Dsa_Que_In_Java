package importantQues;

public class compressAString {
    public static void main(String[] args) {
        String s="lllovveee";
        String ans=compress(s);
        System.out.println(ans);
    }
    public static String compress(String str){

        StringBuilder sb=new StringBuilder();

        int count=1;
        for(int i=1;i<str.length();i++){
            char pre=str.charAt(i-1);
            char curr=str.charAt(i);
            if(pre==curr){
                count++;
            }else{
                if(count>1){
                    sb.append(count);
                }
                sb.append(pre);
                count=1;
            }

        }
        if(count>1){
                sb.append(count);
            }
            sb.append(str.charAt(str.length()-1));

            String ans=sb.toString();
            return ans;
    }


    
}
