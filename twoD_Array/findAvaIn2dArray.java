package twoD_Array;

public class findAvaIn2dArray {
    public static void main(String[] args) {
       

        int arr[][] = { { 1, 2, 3,4 },
                        { 1, 2, 3, 44 } };
      
        int r=arr.length;
        int c=arr[0].length;
        double sum=0;

            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[0].length; j++) {
                   sum+=arr[i][j];
                    }
                }
                double av=sum/(r*c);
                System.out.println(av);
                
          
    }
    
    
}
