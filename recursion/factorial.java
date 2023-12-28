package recursion;

public class factorial {
    public static void main(String[] args) {
        
        int n=5;
        int ans=fac(n);
        System.out.println(ans);
    }

    

public static int  fac(int m){
    if(m==0|| m==1){
        return 1 ;
    }
     int pre= fac(m-1);
     int  ans=m*pre;
     return ans;

      
   
    
}
}