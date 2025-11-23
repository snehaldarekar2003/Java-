package ArrayII;

public class practiseSeession {

    public static int  search(int arr[],int target){
        int n=arr.length;
        int left=0;
        int rigth=n-1;

        while (left<rigth) {
            int mid=(left+rigth)/2;

            if (arr[mid]>arr[rigth]) {
                left=mid+1;
            }else{
                rigth=mid;
            }
        }
        int shift=left;

        while (left<=rigth) {
            int mid =(left+rigth)/2;
            int realMid=(mid+shift)%n;

            if (arr[realMid]==target) {
                return realMid;
            } else if(arr[realMid]<target) {
                left=mid+1;
            }else{
                rigth=mid-1;
            }
            // System.out.println("Element "+target+" foind at index");
        }
        // System.out.println("Element not found");
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=9;

        search(arr, target);
    }
}
