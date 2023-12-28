package Array;

public class countEvenEle {
    public static void main(String[] args) {
        int [] arr={2,3,6,8};
        int count=0;
        for(int i=0;i<arr.length;i++){
             if(arr[i]%2==0){
                count++;
                // System.out.print(i+" ");
             }

        }
        System.out.println(count);

    }
    
}

