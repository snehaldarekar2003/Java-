import java.util.Scanner;

public class demo {

    public static void main(String args[]){
        // //Data types
        // //primitive data types
        // byte b = 8;
        // System.out.println(b);
        // char ch='a';
        // System.out.println(ch);
        // boolean var = true;
        // System.out.println(var);
        // float pricr = 10.5;
        // int num = 15;
        // //long 
        // //double
        // short n = 240;
        // int a = 10;
        // int b = 5;
        // int sum = a+b;
        // System.out.println(sum);
        // Scanner sc = new Scanner(System.in);
        // String input = sc.nextLine();
        // System.out.println(input);
        
        // System.out.println("enter the lenth of side:");
        // int side  = sc.nextInt();
        // System.err.println("Area of the square :"+side*side);

        // System.out.println("Enter three no:");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();

        // int avareage = (num1+num2+num3)/3;

        // System.out.println("Avareage of three numbers:"+ avareage);
        // System.out.println("Hellow World!!");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter numbers:");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();

        // int sum = num1+num2;
        // System.out.println("sum of the numbers :"+ sum);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float Total = pen+pencil+eraser;
        System.out.println("total :"+Total);

        float NewTotal = (Total * 18/100)+Total;

        System.out.println("Total cost with 18% GST:"+ NewTotal);


    }
}