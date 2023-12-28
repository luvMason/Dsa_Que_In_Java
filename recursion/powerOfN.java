package recursion;

public class powerOfN {
    public static void main(String[] args) {
        int n=2;
        int x=5;
        // int ans=find(n,x);
        // System.out.println(ans);
         int ans=find1(n,x);
        System.out.println(ans);

    }
    public static int find(int n,int x){
        if(x==1){
            return n;

        }else if(n==1 || x==0){
            return 1;
        }
        int rem=find(n,x-1);
        int ans=n*rem;
        return ans; 
    }
    public static int find1(int n,int x){
        if(x==1){
            return n;

        }else if(n==1 || x==0){
            return 1;
        }
        int rres=find(n,x/2 );
        if(x%2==0){
            int ans=rres*rres;
            return ans; 
        }else{
            int ans=rres*rres*n;
             return ans; 
        }
        
        
    }
}
