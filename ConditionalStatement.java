import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String args[]){
        //if else statement
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your age:");
        // int age = sc.nextInt();
        // if (age>=18) {
        //    System.out.println("You can vote or drive ");
        // } else {
        //     System.out.println("Your not  illeagble to vote or drive");
        // }

        //LARGEST NUMBER IN BETWEEM THREEE NUMBERS

        // int A = 1, B= 3, C = 6;

        // if(A>=B && A>=C){
        //     System.out.println("A");
        // }
        // else if(B>=C){
        //     System.out.println("B");
        // }
        // else{
        //     System.out.println("C");
        // }

        //TERNARY OPERATORS

        // int num = 3;
        // String type = ((num%2) == 0) ? "even" :"odd" ;
        // System.out.println(type);

        // int marks = 33;
        // String Result = (marks>=33) ? "pass":"fail";
        // System.out.println(Result);


        //SWITCH statement

        // int num = 2;
        // switch (num) {
        //     case 1:System.out.println("samosa");
        //     break;
        //     case 2:System.out.println("gilab jamun");
        //     break;
        //     case 3:System.out.println("sonpapdi");
        //     break;
        //     default:System.out.println("We wake up!");

        //CALCULATER BY USING SWTIXXH

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        
        System.out.println("Enter opartion(+,-,*,/):");
        char opration = sc.next().charAt(0);

        switch (opration) {
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
        
            default:System.out.println("Enter valid oparater");
                break;
        }
            
        }
        

    }

