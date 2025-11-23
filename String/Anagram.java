package String;

import java.util.Scanner;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
         System.out.println("Enter first String:");
         String  str1=sc.nextLine();
         System.out.println("Enter second String:");
         String  str2=sc.nextLine();

        
        //convert in to string into arrays
        char s1Arr[]=str1.toCharArray();
        char s2Arr[]=str2.toCharArray();
        
        //sort converted array
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        
        //compare arrays 
        System.out.println(Arrays.equals(s2Arr,s2Arr));



    }
}
