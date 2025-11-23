package String;

import java.util.Scanner;

public class StringPalindrome {

    public static boolean palindrome(String str){
        int n=str.length();
        for(int i=0;i<=str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(n-i-1)) {
                return false;
            }
            
        }
       return true;
    }
    //Print lower case ovel by taking input of string
    public static void LowercaseOvelCount(String string){

        int n=string.length();

        int count=0;
        for(int i=0;i<n;i++){
            char ch=string.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            }
                
            }
            System.out.println("Count of Lowercase  ovel is: "+count);
        }
       

    
    public static void main(String[] args) {
        String str ="racecar";
        // palindrome(str);

        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        LowercaseOvelCount( string);


    }
}
