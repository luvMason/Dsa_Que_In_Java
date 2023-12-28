package twoD_Array;

public class spiralTrav {
    public static void main(String[] args) {
        int arr[][]={{11,12,13,14},
                   {21,22,23,24},
                   {31,32,33,34},
                   {41,42,43,44}};

        
        int ele=arr.length*arr[0].length;
        int count=0;
        int rowmin=0;
        int rowmax=arr.length-1;
        int colmax=arr[0].length-1;
        int colmin=0;
        while(count<ele){
            for(int r=rowmin;r<=rowmax && count<ele;r++){
                System.out.println(arr[r][colmin]);
                count++;
            }
            for(int c=colmin+1;c<=colmax && count<ele;c++){
                System.out.println(arr[rowmax][c]);
                count++;
                
            }
            for(int r=rowmax-1;r>=rowmin && count<ele;r--){
                System.out.println(arr[r][colmax]);
                count++;
            }
            for(int c=colmax-1;c>=colmin+1 && count<ele;c--){
                System.out.println(arr[rowmin][c]);
                count++;
                
            }
            colmin++;
            rowmax--;
            colmax--;
            rowmin++;
        }
    }
    
}
