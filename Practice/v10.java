package Practice;

public class v10 {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,2};
        int k=2;
        int f=0;
        int l=0;
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            if(k==arr[i] && flag==true){
                f=i;
                flag=false;
            }else if(k==arr[i]){
                     l=i;
            }

        }
        System.out.println(f+" "+l);
    }
    
}
