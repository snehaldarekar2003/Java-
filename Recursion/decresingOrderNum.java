package Recursion;

public class decresingOrderNum {

    public static void printNTo1Nums(int n){

        if (n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printNTo1Nums(n-1);

    }
  public static void main(String[] args) {
    //Print numbers from n to 1 (Decreasing order)
     int n=10;
    printNTo1Nums(n);
  }  
}
