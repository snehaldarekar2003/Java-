package RecursionII;

public class tillingProblem {
    public static int tillingWays(int n){
        if (n==0 || n==1) {
            return 1;
        }
        int vertical=tillingWays(n-1);
        int horzontal=tillingWays( n-2);
        int totalWays=vertical+horzontal;
        return totalWays;
    };
    public static void main(String[] args) {
        int n;
       
        System.out.println(tillingWays( 4));

    }
}
