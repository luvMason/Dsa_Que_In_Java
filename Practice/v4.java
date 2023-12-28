package Practice;

public class v4 {
    public static void main(String[] args) {
        String str="varsha gupta";
        int l=str.length();
        int count=0;
        for(int i=0;i<l;i++){
            int ch=str.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' 
            || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U' ){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
