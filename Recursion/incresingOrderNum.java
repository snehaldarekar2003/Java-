package Recursion;

public class incresingOrderNum {
    public static void print1ToNNums(int n){

        if (n==1) {
            System.out.print(n+" ");
            return;
        }
        print1ToNNums(n-1);
        System.out.print(n+" ");
        

    }
    public static void main(String[] args) {
        int n=20;
        print1ToNNums(n);
    }
}
