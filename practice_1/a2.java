package practice_1;

import java.util.Arrays;

public class a2 {
    public static void main(String[] args) {
        
        int[]arr1={1,24,63,2,53};
        int[]arr2={1,24,63,2,53};
        int [] res=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            res[i]=arr1[i];
    
        }
        for(int i=0;i<arr2.length;i++){
            res[arr1.length+i]=arr2[i];
        }

        System.out.println(Arrays.toString(res));
    }

    
}
