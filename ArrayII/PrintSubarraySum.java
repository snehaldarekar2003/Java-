package ArrayII;

public class PrintSubarraySum {
    public static void printSubarraySum(int numbers[]){
        //Brute force
        int currSum=0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int star=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum = 0;
                for(int k=star;k<=end;k++){
                    currSum+=numbers[k];
                }
                
                if(max<currSum){
                    max=currSum;
                }
                System.out.println(currSum);

            }

            
            
        }
        System.out.println("max sum = "+max);
       
    }
    public static void main(String[] args) {
        int numbers[] ={2,4,6,8,10}; 
        printSubarraySum(numbers);
    }
    
}
