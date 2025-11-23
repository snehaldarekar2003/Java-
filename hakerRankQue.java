import java.util.Scanner;

public class hakerRankQue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String ans = " ";
        if (n%2==0) {
            
            if (n>=2 && n<=5) {
                ans ="not weird";
            }else if(n>=6 && n<=20){
                ans ="Weird";
            }
            else{
                ans = "not weird";
            }
        } else {
            
            ans="Weird";
        }
        System.out.println(ans);
        
    }
}
