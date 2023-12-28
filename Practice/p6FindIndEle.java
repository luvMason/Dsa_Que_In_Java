package Practice;

public class p6FindIndEle {
    public static void main(String[] args) {
        int [] arr={3,4,5,6,77,88};
        int k=77;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println(i);
            }
        }
    }
    
}
