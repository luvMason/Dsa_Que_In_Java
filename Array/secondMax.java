package Array;

public class secondMax {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
         
        int smax=Integer.MIN_VALUE;
        int[] arr={82,8,15,199,78};
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                smax=max;
                max=arr[i];
             
            }else if(smax<arr[i]){
                smax=arr[i];
            }
            
            
             }
             System.out.println(max+" "+smax);
        }
       


    }
    

