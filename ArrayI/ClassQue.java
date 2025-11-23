package ArrayI;
import java.util.*;
public class ClassQue {
    public static int getLargest(int arr[]){
        int larg = Integer.MIN_VALUE;//-infinity
        int small = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if (larg<arr[i]) {
                larg=arr[i];
            } 

            
                if (small>arr[i]) {
                    small=arr[i];
                }
            
        }
        System.out.println("Smallest number is: "+small);
        return larg;
    }

    
    public static void main(String[] args) {
        //largest number in given array
        int arr[] = {1,2,6,3,5};
        System.out.println("largest value is:"+getLargest(arr));
    }
}
