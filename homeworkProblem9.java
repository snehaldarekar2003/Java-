import java.util.Scanner;

public class homeworkProblem9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<0) {
            System.out.println("Number is Nigative");
        }
        else if(a==0){
            System.out.println("This is not positive & negativr");
           
        } else {
            System.out.println("Number is Positive");
        }
        
    }
}