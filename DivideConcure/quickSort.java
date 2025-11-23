package DivideConcure;

public class quickSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void QuickSort(int arr[],int si,int ei){
         if (si>=ei) {
            return;
         }

         int pIdx=partition(arr,si,ei);
         //recursive calls
        QuickSort(arr, si, pIdx-1);//right side where store smaller nums than pivet
        QuickSort(arr, pIdx+1, ei);//lefe side where store greater nums than pivet

    }

    public static int partition(int []arr,int si,int ei){
        int pivet=arr[ei];//that ie last elemnt in arr
        int i=si-1;//that is -1//to make place for else small than pivet

        for(int j=si;j<ei;j++){
            if (arr[j]<=pivet) {
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }
        
        i++;
        int temp=pivet;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        QuickSort(arr, 0, arr.length-1);
        printArr(arr);

    }
}
