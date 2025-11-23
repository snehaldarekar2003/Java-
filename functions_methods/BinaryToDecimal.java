package functions_methods;

public class BinaryToDecimal {
    public static void binToDec(int binNum){
        int num=binNum; 
        int pow = 0;
        int decNum = 0;
        
        while (binNum>0) {
            int lastDigit=binNum%10;//for getting last digit
            decNum = decNum+(lastDigit*(int)Math.pow(2,pow));//type cast


            pow++;
            binNum= binNum/10;

        }
        System.out.println("Decimal of "+num+" = "+decNum);
    }
    public static void main(String[] args) {
        binToDec(101);
    }
}
