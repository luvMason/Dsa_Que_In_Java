package Practice;

import java.util.Arrays;

public class g2 {
    public static void main(String[] args) {
        int arr[]={2,3,5,64,3};
        int k=64;
        int res[]=new int[arr.length-1];

        int itr=0;
        for(int i=0;i<arr.length;i++){
            if(k!=arr[i]){
                res[itr]=arr[i];
                itr++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
    
}
