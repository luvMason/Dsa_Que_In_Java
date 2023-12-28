package Practice;

public class p8Frecuency {
    public static void main(String[] args) {
    int [] arr={3,3,3,9,3};
    int k=3;
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==k){
            count++;
        }
    }
    System.out.println(count);
    }
    
}
