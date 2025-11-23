package RecursionII;

public class occuranceInArray {
    public static void allOccurance(int arr[],int key,int i){

        if (i==arr.length) {
            return;
        }

        if (arr[i]==key) {
            System.out.println(i+" ");
        }
        allOccurance(arr, key, i+1);

    }
    public static void main(String[] args) {
        int arr[]={3,2,4,6,7,2,7,2,8,2};
        int key=2;
        int i;
        allOccurance(arr, key, 0);

    }
}
