package ArrayI;

public class PairsInArray {
    public static void PrintPairs(int numbers[]){
        int tp=numbers.length*(numbers.length-1)/2;
        for(int i = 0;i<numbers.length;i++){
            // int tp=0;
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
               System.out.print("(" + curr + "," + numbers[j] + ")" );
            //    tp++;
            }
            System.out.println();

        }
        System.out.println("Total paires is: "+tp);

    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10};
        PrintPairs(numbers);

    }
}
