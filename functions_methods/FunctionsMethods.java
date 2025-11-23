package functions_methods;
import java.util.Scanner;

public class FunctionsMethods {
    // public static void printHellowWorld(){
    //     System.out.println("Hellow World!!");
    //     System.out.println("Hellow World!!");
    //     System.out.println("Hellow World!!");
    //     return;
    // }

    //Functions with parameters
    // public static int calculateSum(int num1,int num2){//parameters
    //     // Scanner sc = new Scanner(System.in);
    //     // System.out.println("Enter num 1:");
    //     // int a =sc.nextInt();
    //     // System.out.println("Enter num 2:");
    //     // int b = sc.nextInt();
    //     // int sum = num1+num2;
    //     // System.out.println("Sum is:"+sum);
    //     return sum;
        
    // }

    // public static void swap(int a,int b){
    //     // int temp = a;
    //     //  a = b;
    //     //  b = temp;
    //     // System.out.println("A is:"+a);
    //     // System.out.println("B is:"+b);

    // }

    // public static int multiply(int a,int b){
    //     int product = a*b;
        
    //     return product;

    // }

    // public static int Factorial(int n) {
    //     int f= 1;
    //     for (int index = 1; index <=n; index++) {
    //         f=f*index;

    //     }
    //     System.out.println(f);
    //     return f;
    // }

    // public static int BinoCoeff(int n, int r){
    //     int fact_n = Factorial(n);
    //     int fact_r = Factorial(r);
    //     int fact_nmr = Factorial(n-r);
    //     int binCoeff = fact_n/(fact_r*fact_nmr);
    //     return binCoeff;

    // }

    //Function overloding 
    //overloding dosent deppend on return type
    //overlodong using parametere
    //sum of two numbers
    // public static int sum(int a,int b){
    //     return a+b;
    // }

//Sum of three numbers
// public static int sum(int a, int b, int c){
//     return a+b+c;
// }

//overloding using data types
public static int sum(int a,int b){
    return a+b;
}

public static float sum(float a, float b){
    return a+b;
}


    public static void main(String[] args) {
        //Functons and methods
        // printHellowWorld();//function call
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter num 1:");
        // int a =sc.nextInt();
        // System.out.println("Enter num 2:");
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println(" Sum is:"+sum);
        // calculateSum(a,b);//Arguments 
        // int sum= calculateSum(a, b);
        // System.out.println("Sum is:"+sum);

        //swap -values exchange
        // int a = 5;
        // int b = 10;

        //swapping
        // swap(a, b);
        // int ans = multiply(5,2);
        // System.out.println("a*b = "+ ans);
        //  ans = multiply(6, 4);
        // System.out.println("a*b = "+ ans);


        //Factorial 
        // Factorial(3);

        // System.out.println(BinoCoeff(5, 2));

        // int ans = sum(5, 4);
        // System.out.println(ans);
        // // ans = sum(3,3,10);
        // System.out.println(sum(3,3,10));
        System.out.println(sum(3,6));

        System.out.println(sum(3.2f, 5.4f));
        

    }
}
