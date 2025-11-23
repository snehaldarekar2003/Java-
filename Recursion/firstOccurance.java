package Recursion;

public class firstOccurance {

    public static int firstOccur(int arr[],int key,int i){
         if (i==arr.length) {
            return -1;
         }
        if (arr[i]==key) {
            return i;
        }
        return firstOccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,6,4,7,8,4};
        int key=4;
       System.out.println( firstOccur(arr, key, 0));
    }
}
