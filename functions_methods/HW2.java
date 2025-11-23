package functions_methods;
public class HW2 {
    public static boolean isEven(int n){
        // boolean ans=false;
        if (n%2==0) {
            // ans = true;
            return true;
        }
        
        return false;
        
    }
    public static void main(String[] args) {

        // System.out.println(isEven(7));
        if (isEven(5)){
            System.out.println("num is even");
            System.out.println(isEven(0));
        }else{
            System.out.println("num is odd");
            System.out.println(false);

    
        }
    }
}
