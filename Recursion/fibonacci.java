package Recursion;
public class fibonacci {
    public static void main(String[] args) {
        int n=5;
        int nterm=printFiboSeries(n);
        System.out.println(nterm);
        
    }


    public static int printFiboSeries(int n){
           if (n==0) {
             return 0;
           }
           if (n==1) {
            return 1;
           }
           int lst=printFiboSeries(n-1);
           int slst=printFiboSeries(n-2);
           int ans=lst+slst;
           return ans;
    }
}
