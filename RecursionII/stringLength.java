package RecursionII;

public class stringLength {
    public static int  lengthOfString(String str){
        if (str.length()==0) {
            return 0;
        }
          return lengthOfString(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str="SnehalDarekar";
        System.out.println(lengthOfString(str));
    }
}
