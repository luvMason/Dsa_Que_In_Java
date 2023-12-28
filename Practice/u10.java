package Practice;

public class u10 {
    public static void main(String[] args) {
        int [][]arr={{0,1,1,3},
                     {0,2,5,3},
                     {0,2,5,3},
                     {0,4,4,4}};
    int rowmin=0;
    int colmin=0;
    int rowmax=arr.length-1;
    int colmax=arr[0].length-1;
    int count=0;
    int ele=arr.length*arr[0].length;
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

        rowmin++;
        colmin++;
        rowmax--;
        colmax--;


    }

    
}
}
