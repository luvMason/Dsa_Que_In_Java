package twoD_Array;

public class copyOne2dAToAnother {
    public static void main(String[] args) {
       

        int arr[][] = { { 1, 2, 3,4 }, { 1, 2, 3, 4 } };
        int copy[][] =new int [arr.length][arr[0].length];
        
        

            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[0].length; j++) {
                    copy[i][j]=arr[i][j];
                    System.out.print(copy[i][j]+" ");
                }
                System.out.println();
          
    }

    

    
}
}
