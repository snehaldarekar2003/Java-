package ArrayI;

public class PrintSubarrays {
    public static void printSubarrays(int numbers[]){
        int totalSubarrays=numbers.length*(numbers.length+1)/2;
        for(int i=0;i<numbers.length;i++){
            int star=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=star;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();

            }
            
            System.out.println();
        }
        System.out.println("Total Subarrays : "+totalSubarrays);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
    }
}
