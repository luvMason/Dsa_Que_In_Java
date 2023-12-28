package Practice;
import java.util.*;
public class a2 {
    public static void main(String[] args) {
        int[] arr = {2,9,8,4,1,8,5,6};
        int k=8;
        find(arr,0,k);
    }
    public static void find(int arr[],int idx,int k){
        if(idx==arr.length){
            return;
        }else if(arr[idx]==k){
            System.out.println(idx);
        }
        find(arr,idx+1,k);
    }
}