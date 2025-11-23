import java.util.Scanner;

public class loop11{
    public static void main(String args[]){
        // int counter = 0;
        // while (counter<100) {
        //     System.out.println(counter);
        //     counter++;
        // }
        //EXAMPLE 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number:");
        // int num = sc.nextInt();
        // int count = 1;
        // while (count<=num) {
        //     System.out.println(count);
        //     count++;
        // }

        //EXAMPLE 2
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter number:");
    //     int num = sc.nextInt();
    //     int sum = 0;
    //     int i = 1;
    //     while (i<=num) {
    //         sum = sum+i;
    //         i++;
            
    //     }
    //     System.out.println("Sum is:"+sum);

    //FOR LOOP
    //EXAMPLE 2 square pattern

// for(int line =1;line<=4;line++){
//     System.out.println("* * * *");
// }

//Example 3 print reverse of a number
// int n= 23443;
// while (n>0) {
//     int lastdigit = n%10;
//     System.out.print(lastdigit);
//     n = n/10;//n/=10
// }
// System.out.println();

// for(int i=0;i<5;i++){
//     System.out.println("hello");
//     i+=2;
// }

//BREAK 
// Scanner sc = new Scanner(System.in);
// do {
//     System.out.println("Enter Number:");
//     int n = sc.nextInt();
//     if(n%10==0){
//         System.out.println("the numer is divisible by 10");
//         break;
        
//     }
//     System.out.println(n);
// } while (true);


//CONTINUE KEYWORD
// Scanner sc = new Scanner(System.in);
// do {
//     System.out.println("Enter Number:");
//     int n = sc.nextInt();
//     if(n%10==0){
//         System.out.println("the numer is divisible by 10");
//         continue;
        
//     }
//     System.out.println("your num was: "+n);
// } while (true);


// Scanner sc = new Scanner(System.in);
// System.out.println("Enter your number:");
// int n = sc.nextInt();
// if (n==2) {
//     System.out.println("n is prime.");
// } else {
//     boolean isPrime = true;
//     for(int i=2;i<=Math.sqrt(n);i++){
//         if (n%i==0) {
//             isPrime = false;
//         }
//     }

//     if (isPrime == true) {
//         System.out.println("n is prime");
//     } else {
//         System.out.println("n is not prime");
//     }
// }

// int n = 30009;
// int rev = 0;

// while (n>0) {
//     int lastdigit = n%10;
//     rev = (rev*10)+lastdigit;
//     n/=10;
// }
// System.out.println(rev);

//Table
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// int result;
// for (int i = 1; i<=10; i++) {
//     result = num*i;
//     System.out.println(num+"*"+i+"= "+result);
// }

//Factorial 
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter num:");
// int n = sc.nextInt();
// int fact=1;
// for (int index = n; index >=1; index--) {
//     fact = fact*index;
// }
// System.out.println(fact);

//leap Year or not


     }

}
