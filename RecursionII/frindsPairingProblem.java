package RecursionII;

public class frindsPairingProblem {

    public static int paringFriends(int n){

        //base case
        if (n==1 || n==2) {
            return n;
        }
       return paringFriends(n-1)+(n-1)*paringFriends(n-2);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(paringFriends(n));
    }
}
