package StringBuild;

public class removeDuplicate {


    public static void main(String[] args) {
        String s="lloovvee";
        String res=removeDupli(s);
        System.out.println(res);
    }
    public static String removeDupli(String str){
        StringBuilder sb=new StringBuilder();
       
        sb.append(str.charAt(0));
          
        for(int i=1;i<str.length();i++){
            char curr =str.charAt(i);
             char pre =str.charAt(i-1);
             if(pre!=curr){
                
                 sb.append(curr);
             }

        }

        String ans=sb.toString();
           return ans;

    }
    
}

