package functions_methods;

public class PrimeInRange {
    // this function we use as a helper function
    public static boolean isPrime(int n){
        if (n==2) {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    //print all primes in range
    public static void PrimeRange(int n){
        for (int i = 2; i<=n; i++) {
            if (isPrime(i)) {//true
                System.out.print(i+" ");
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        PrimeRange(20);
    }

    
}
