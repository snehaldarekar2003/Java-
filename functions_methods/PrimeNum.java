package functions_methods;

public class PrimeNum {

    // public static boolean Prime(int n){
    //     boolean isPrime=true;
    //    for (int index = 2; index <= n-1; index++) {
    //     if (n%index==0) {
    //         isPrime=false;
    //         break;
            
    //     } 
    //    }
    //    return isPrime;

    // }

    //Optimized mrthod
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
    
    public static void main(String[] args) {
        System.out.println(isPrime(9));


        
    }
}
