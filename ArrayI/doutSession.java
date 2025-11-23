package ArrayI;

import java.util.Scanner;

public class doutSession {

    public static void reverse(int numbers[]){

        int fst=0,last=numbers.length-1;
        while (fst<last) {
            //swap
            int temp =numbers[last];
            numbers[last]=numbers[fst];
            numbers[fst]=temp;
            fst++;
            last--;
        }

    }
    public static void main(String[] args) {

        int numbers[]={2,4,6,8,10};
         reverse(numbers);
         for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
         }
         System.out.println();
   
    }
}
