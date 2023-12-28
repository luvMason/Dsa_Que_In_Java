package string;

public class compressString {
    public static void main(String[] args) {
        String s="lllovve";
        String ans=compress(s);
        System.out.println(ans);
        
    }
    public static String compress(String s){

         StringBuilder sb=new StringBuilder();
         int count=1;
        for(int i=1;i<s.length();i++){
            char pre =s.charAt(i-1);
            char curr=s.charAt(i);
            if(pre==curr){
                count ++;

            }else{
                if(count >1){
                    sb.append(count);
                }
                sb.append(pre);
                count=1;
            }

        }
        if (count > 1) {
                        sb.append(count);
                    }
                    sb.append( s.charAt(s.length()-1));

        String ans = sb.toString();
        return ans;

     

    }
    
}
