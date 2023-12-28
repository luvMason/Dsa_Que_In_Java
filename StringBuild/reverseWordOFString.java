package StringBuild;

public class reverseWordOFString {
    
public static void main(String[] args) {
        String s="love mason";
        String res=reverseWord(s);
        System.out.println(res);
        
    }
    public static String reverseWord(String str){

        String[]arr=str.split(" ");
        StringBuilder sb=new StringBuilder();
       
       for(int i=0;i<arr.length;i++){
        String temp=arr[i];
        String rev=reverse(temp);
        sb.append(rev+" ");
       }
       String ans=sb.toString();
       return ans;
    }
    public static String reverse(String str){
       StringBuilder sb=new StringBuilder(str);
        
           sb.reverse();
        
        String ans=sb.toString();
        return ans;
    }
    
}

