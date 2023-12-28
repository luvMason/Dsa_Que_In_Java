package StringBuild;

public class reverse {

    
public static void main(String[] args) {
        String str="love";
        String res=reverse(str);
        System.out.println(res);
       
    }
    public static String reverse(String s){
       
           
        StringBuilder sb=new StringBuilder(s);
       
        sb.reverse();
       
    
    String ans= sb.toString();
    return ans;
    }
}
    
    

