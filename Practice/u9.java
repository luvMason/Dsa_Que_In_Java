package Practice;

public class u9 {
    public static void main(String[] args) {
        int [][]arr={{4,5,6,7},
                     {3,4,5,6},
                     {2,3,4,5},
                     {1,2,3,4}};
                   for(int k=0;k<arr.length;k++){
                     for(int r=0;r<arr.length;r++){
                        
                        for(int c=0;c<arr[0].length;c++){
                            if(r+k==c){
                                  System.out.println(arr[r][c]);
                            }
                        } 
                     }
                    }
    }
    
}
