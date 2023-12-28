package Practice;

public class g4 {
    public static void main(String[] args) {
        int arr[]={3,45,73,3,38,2};
        int k=5;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(k==arr[i]+arr[j]){
                    System.out.println(i+" "+j);
                    
                }
            }
        }
    }
    
    
}
