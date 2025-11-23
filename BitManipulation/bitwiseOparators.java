package BitManipulation;

public class bitwiseOparators {

    public static void oodOrEven(int n){
        //Check if number is even or odd
        int bitMask=1;
        if ( (n & bitMask)==0) {
            //even number
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }

    public static int getIthBit(int n,int i){

        int bitMask=1<<i;
        if ((n & bitMask)==0) {
            return 0;
        }else{
            return 1;
        }

    }
    //Oparations in bits
    public static int setithBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;

    }

    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;


    }

    public static int updateIthBit(int n,int i,int newBit){

        if (newBit==0) {
            return clearIthBit(n, i);
        }else{
            return setithBit(n, i);
        }
        //  n=clearIthBit(n, i);
        //  int BitMask=newBit<<i;
        //  return n|BitMask;
    }

    //clear Iths last bits 

    public static int clearIBits(int n,int i){
        int bitMask=(~0)<<i;

        return n & bitMask;
    }

    //clear bit in range

    public static int clesrBitsInRange(int n,int i,int j){

        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a|b;
        return n & bitMask;

    }

    //Check if a number is a Power of 2 or not
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1))==0;
    }

    //count set bits in number 
    public static int  countBits(int n){
           int count=0;
           while (n>0) {
            if ((n&1)!=0) {
                count++;
            }
            n=n>>1;
           }
           return count;
    }


    public static int fastExpo(int a,int n){

        int ans=1;

        while (n>0) {
            if ((n & 1)!=0) {//Ckeck LSB
                ans= ans*a;
            }
            a=a*a;
            n=n>>1;
        }

        return ans;

    }
    public static void main(String[] args) {
        //Binary AND oparater

        // System.out.println(5&6);

        // System.out.println(5|6);

        // System.out.println(5^6);

        // System.out.println(~5);

        // System.out.println(5<<2);

        // System.out.println(6>>1);

    //     oodOrEven(3);
    //     oodOrEven(9);
    //     oodOrEven(2);

    //    System.out.println( getIthBit(10, 2));

    //    System.out.println(setithBit(10, 2));

    //    System.out.println( clearIthBit(10, 1));

    //    System.out.println(updateIthBit(10, 2, 1));
       
    // System.out.println(fastExpo( 5,3));

    // System.out.println(clearIBits(15, 2));

    // System.out.println(clesrBitsInRange(10,2,4));

    // System.out.println(isPowerOfTwo(16));

    System.out.println(countBits(16));
    }
}
