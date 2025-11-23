package BasicSortingAlgoritham;

public class DoutSession {
    public static void bubbleSort(int numbers[]){
        int n=numbers.length;
         for(int i=0;i<n-1;i++){
            for(int j=0;j<(n-1)-i;j++){
                if (numbers[j]<numbers[j+1]) {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
           
         }
         for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }


    }

    public static void selectionSort(int numbers[]){
        int n=numbers.length;
        for (int i = 0; i<n-1; i++) {
            int maxIndex=i;
            for(int j=i+1;j<n;j++){
                if (numbers[j]>numbers[maxIndex]) {
                    maxIndex=j;
                }
            }
            int temp=numbers[i];
            numbers[i]=numbers[maxIndex];
            numbers[maxIndex]=temp;      
        }
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }

    }

    public static void countSort(int numbers[]){
        int maxElement=0;
        int n=numbers.length;
        for(int i=0;i<n;i++){
            if(numbers[i]>maxElement){
                maxElement=numbers[i];
            }
        }
        int count[]= new int[maxElement+1];

        for(int i=0;i<n;i++){
            count[numbers[i]]++;
        }

        for(int i=maxElement;i>=0;i--){
            int freq=count[i];

            for(int k=1;k<=freq;k++){
                System.out.print(i+" ");
            }
        }

    }

    public static void insertionSort(int numbers[]){
        int n=numbers.length;
        for(int i=0;i<n;i++){
            
        }

    }
    public static void main(String[] args) {
        int numbers[]={3,1,4,5,9,4,1,3};
        // bubbleSort(numbers);
        // selectionSort(numbers);
        countSort(numbers);
    }
}
