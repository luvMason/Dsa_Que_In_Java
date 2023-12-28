package string;

public class removeDuplicate {
    public static void main(String[] args) {
        String s="lloovvee";
        String res=removeDupli(s);
        System.out.println(res);
    }
    public static String removeDupli(String str){
        String ans="";
       
        ans+=str.charAt(0);
          
        for(int i=1;i<str.length();i++){
            char curr =str.charAt(i);
             char pre =str.charAt(i-1);
             if(pre!=curr){
                
                 ans+=curr;
             }

        }
           return ans;

    }
    
}
