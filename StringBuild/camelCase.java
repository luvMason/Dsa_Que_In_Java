package StringBuild;

public class camelCase {
public static void main(String[] args) {
        
        String str ="Hello in the world of java";
        String ans1=camel2(str);
        System.out.println(ans1);
    }
    
        public static String camel2(String str){
       if(str.length()==0){
            return "";
        }else if (str.length()==1){
            return str;
        }



        StringBuilder sb=new StringBuilder();
        char fc = str.charAt(0);

        if(fc>='A' && fc<='Z'){
            fc=(char)(fc-'A'+'a');
        }
        sb.append(fc);

        for(int i=1;i<str.length();i++){

            char curr = str.charAt(i);
            char pre = str.charAt(i-1);

            if(pre==' '){
                if(curr>='a' && curr<='z'){
                curr=(char)(curr-'a'+'A');
               }
               sb.append(curr);
            }else if(curr!=' '){
                sb.append(curr);
            }
        }
         String ans=sb.toString();
        return ans ;
    }
}
    

