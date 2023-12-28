package string;

public class camelCase {
    public static void main(String[] args) {
        
        String str ="Hello in the world of java";
        String ans=camel1(str);
        String ans1=camel2(str);
        System.out.println(ans1);
    }
    
    public static String camel1(String s){
        String ans="";
        String[] arr=s.split(" ");
        String fw=arr[0];
        char fc=fw.charAt(0);
        if(fc>='A'&& fc<='Z'){
            fc=(char)(fc-'A'+'a');
            fw=fc+fw.substring(1);
        }
        ans+=fw;
        for(int i=1;i<arr.length;i++){
            String temp = arr[i];
            char ch = temp.charAt(0);

            if(ch>='a' && ch<='z'){
            ch=(char)(ch-'a'+'A');
            temp = ch + temp.substring(1);
             }

        ans+=temp;
        }

        return ans ;

    }
        public static String camel2(String str){
       if(str.length()==0){
            return "";
        }else if (str.length()==1){
            return str;
        }



        String ans = "";
        char fc = str.charAt(0);

        if(fc>='A' && fc<='Z'){
            fc=(char)(fc-'A'+'a');
        }
        ans+=fc;

        for(int i=1;i<str.length();i++){

            char curr = str.charAt(i);
            char pre = str.charAt(i-1);

            if(pre==' '){
                if(curr>='a' && curr<='z'){
                curr=(char)(curr-'a'+'A');
               }
               ans+=curr;
            }else if(curr!=' '){
                ans+=curr;
            }
        }

        return ans ;
    }
}