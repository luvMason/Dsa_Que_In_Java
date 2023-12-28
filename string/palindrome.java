package string;

public class palindrome {
    public static void main(String[] args) {
        String s="nitin";
        boolean ans=pal(s);
        System.out.println(ans);
    }
    public static boolean pal( String str){
        int l=str.length()-1;
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
             char c=str.charAt(l);
              l--;
             if(ch!=c){
                flag= false;
                
             }
           

        }
        return flag;

    }
         //second method
    public static boolean palindrome( String str){
        int l=str.length()-1;
        int s=0;
        int e=l;
        boolean flag=true;
        while(s<e){
            char ch=str.charAt(s);
             char c=str.charAt(e);
              
             if(ch!=c){
                flag= false;
                break;
                
             }
           

        }
        return flag;

    }
    
}
