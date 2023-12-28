package Practice;

public class u6 {
    public static void main(String[] args) {
        int [][]arr={{34,6,10},
                     {40,290,80},
                     {100,0,290}};
        int min=Integer.MAX_VALUE;
        for(int c=0;c<arr[0].length;c++){
            int sum=0;
            for(int r=0;r<arr.length;r++){
                sum+=arr[r][c];
            }
            min=Math.min(min, sum);
        }
        System.out.println(min);
    }
    
}
