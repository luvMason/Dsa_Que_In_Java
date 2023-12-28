package Practice;
import java.util.*;
public class t2 {
    public static void main(String[] args) {
        
    
    int arr1[]={1,2,3,6,7};
    int arr2[]={4,5,7,8};
    int res[]=new int[arr1.length +arr2.length];

    int p1=0;
    int p2=0;
    int p3=0;

    if(p1!=arr1.length || p2!=arr2.length){
        for(int i=0;i<res.length;i++){
              if(arr1[p1]<arr2[p2]){
                res[p3]=arr1[p1];
                p1++;
                p3++;
              }
              
              }
              System.out.println(Arrays.toString(res));
              }
            }
        }
    
    
    

