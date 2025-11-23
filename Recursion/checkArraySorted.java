package Recursion;

public class checkArraySorted {

    //check if a given array is sorted or not
    public static boolean sortedArray(int arr[],int i){
          if (i==arr.length-1) {
            return true;
          }

          if (arr[i]>arr[i+1]) {
            return false;
          }

          return sortedArray(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,7,6};
        int i;
       System.out.println( sortedArray(arr, 0));;
    }
}
