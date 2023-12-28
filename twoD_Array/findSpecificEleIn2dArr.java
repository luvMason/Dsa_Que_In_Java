package twoD_Array;


public class findSpecificEleIn2dArr {
    public static void main(String[] args) {
       

        int arr[][] = { { 1, 2, 3,4 },
                        { 1, 2, 3, 44 } };
       int k=44;
        
        

            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr[0].length; j++) {
                    if(k==arr[i][j]){
                        System.out.print(i+""+j);
                    }
                }
                System.out.println();
          
    }
    
}
}
