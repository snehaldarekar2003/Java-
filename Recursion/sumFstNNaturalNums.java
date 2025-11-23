package Recursion;

public class sumFstNNaturalNums {
    //Print sum of first N natural numbers
    public static int sum(int n) {
        if (n==1) {
            return 1;
        }
         int sum1=sum(n-1);
         int Sn=n+sum1;
         return Sn;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(sum(n));
    }
}
