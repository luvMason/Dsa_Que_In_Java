package practice_1;

public class allpermutation {
    public static void main(String[] args) {
        String a="abc";
        allpermutation(a,"");

    }
    public static void allpermutation(String a,String ans){
        if(a.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            String fp=a.substring(0,i);
             String sp=a.substring(i+1);
             String rem=fp+sp;
             allpermutation(rem, ans+ch);

        }
    }
    
}
