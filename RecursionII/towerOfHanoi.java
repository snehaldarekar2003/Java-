package RecursionII;

public class towerOfHanoi {
    public static void printSteps(int n,int a,int c ,int b){
        if (n==0) {
            return;
        }
          printSteps(n-1, a, b, c);
          System.out.println("Moving "+ n +" th disc from"+ a +" to "+b);
          printSteps(n-1, b, c, a);



    }
    public static void main(String[] args) {
        printSteps(3, 1, 2, 3);
    }
}
