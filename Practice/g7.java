package Practice;

public class g7 {
    public static void main(String[] args) {
        int arr[]={2,3,5,4,566,46};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
