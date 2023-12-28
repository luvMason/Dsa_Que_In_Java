package practice_1;

public class spiral {
    public static void main(String[] args) {
        int arr[][]={{11,12,13,14},
                   {21,22,23,24},
                   {31,32,33,34},
                   {41,42,43,44}};

        int rmax=arr.length-1;
        int cmax=arr[0].length-1;
        int rmin=0;
        int cmin=0;
        int count=0;
        int ele=arr.length*arr[0].length;

        while(count<ele){


        // for(int r=rowmin;r<=rowmax && count<ele;r++){
        //     System.out.println(arr[r][colmin]);
        //     count++;
        // }
        // for(int c=colmin+1;c<=colmax && count<ele;c++){
        //     System.out.println(arr[rowmax][c]);
        //     count++;
            
        // }
        // for(int r=rowmax-1;r>=rowmin && count<ele;r--){
        //     System.out.println(arr[r][colmax]);
        //     count++;
        // }
        // for(int c=colmax-1;c>=colmin+1 && count<ele;c--){
        //     System.out.println(arr[rowmin][c]);
        //     count++;
            
        // }


        for(int r=rmin;r<=rmax&&count<ele;r++){
            System.out.println(arr[r][cmin]);
            count++;
        }
         for(int c=cmin+1;c<=cmax&&count<ele;c++){
            System.out.println(arr[rmax][c]);
            count++;
        }
         for(int r=rmax-1;r>=rmin&&count<ele;r--){
            System.out.println(arr[r][cmax]);
            count++;
        }
        for(int c=cmax-1;c>=cmin+1&&count<ele;c--){
            System.out.println(arr[rmin][c]);
            count++;
        }
        
        rmax--;
        cmax--;
        rmin++;
        cmin++;
        }

    }
    
}
