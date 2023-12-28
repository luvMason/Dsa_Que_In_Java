package Practice;

import java.util.Arrays;

public class u4 {
    public static void main(String[] args) {
        int [][]arr={{1,2,3,4,5},{11,22,33,44,55},{111,222,333,444,555}};
       
        for(int c=0;c<arr[0].length;c++){
            for(int r=0;r<arr.length;r++){
                System.out.println(arr[r][c]);
            }
        }
        
    }
    
}
