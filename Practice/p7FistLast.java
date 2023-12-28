package Practice;

public class p7FistLast {
    public static void main(String[] args) {
        
    
    int [] arr={3,6,5,6,0};
    int f=-1;
    int l=-1;
    int k=6;
    
         boolean flag=true;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==k && flag==true){
                f=j;
                flag=false;
            }
            if(arr[j]==k){
                l=j;
            }


        }
        System.out.println(f+" "+l);
    }
    
}

