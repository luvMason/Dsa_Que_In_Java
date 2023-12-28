package Practice;

public class spiral {
    public static void main(String[] args) {
        int[][]arr={{1,2,2,4},
                    {1,3,0,4},
                    {1,3,5,4},
                    {1,7,7,7}};
         
          int colmin=0;
          int rowmin=0;
          int rowmax=arr.length-1;
          int colmax=arr[0].length-1;
          int ele=arr.length*arr[0].length;
          int count=0;
          while(count<ele){
          for(int r=rowmin;r<=rowmax;r++){
            System.out.println(arr[r][colmin]);
            count++;
          }
          for(int c=colmin+1;c<=colmax;c++){
            System.out.println(arr[rowmax][c]);
            count++;
          }
          for(int r=rowmax-1;r>=rowmin;r--){
            System.out.println(arr[r][colmax]);
            count++;
          }
          for(int c=colmax-1;c>=colmin+1;c--){
            System.out.println(arr[rowmin][c]);
            count++;
          }
          colmin++;
          rowmin++;
          colmax--;
          rowmax--;
        }
          
    }
    
}
