package Recursion;

public class printXPowN {
   // o(n) TC
    public static int power(int x,int n){
        if (n==0) {
            return 1;
        }
        return x*power(x, n-1);
    }

    // optimized//o(logn) TC
    public static int optimized(int x,int n){
        if (n==0) {
            return 1;
        }
        int halrPower= optimized(x, n/2);
        int halfPowerSq=halrPower*halrPower;
        if (n%2 !=0) {
            halfPowerSq=x*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x;
        int n;
        System.out.println(optimized(8, 3));
    }
}
