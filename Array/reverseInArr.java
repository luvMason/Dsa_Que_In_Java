package Array;

public class reverseInArr {
    public static void main(String[] args) {
        
    
    int[] arr={3,45,67,87,1};
    int s=0;
    int e=arr.length-1;
    int t;
    while(s<e){
       t=arr[s];
       arr[s]=arr[e];
       arr[e]=t;
       s++;
       e--;
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    
}
}
