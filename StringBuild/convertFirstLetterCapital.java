package StringBuild;

public class convertFirstLetterCapital {
    
 public static void main(String[] args) {
        String s="my name is love";
        String ans=convert2(s);
        System.out.println(ans);
    }
    public static String convert2(String str){
        StringBuilder sb=new StringBuilder();
        
        char fc=str.charAt(0);
        if(fc>='a' && fc<='z'){
            fc=(char)(fc-'a'+'A');

        }
        sb.append(fc);

        for(int i=1;i<str.length();i++){
            char curr =str.charAt(i);
             char pre =str.charAt(i-1);
             if(pre==' '){
                if(curr>='a'&& curr<='z'){
                    curr=(char)(curr-'a'+'A');
                }
             }
            sb.append(curr);

        }
        String ans=sb.toString();
           return ans;

    }

}

