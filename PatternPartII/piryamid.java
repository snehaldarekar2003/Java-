package PatternPartII;

public class piryamid {
    public static void main(String[] args) {
        int n= 5;
        for(int i= 1;i<=n;i++){
            for(int j=0;j<=n-1;j++){
                System.out.print(" ");
            }

            int number = 1;
            boolean incresing = true;
            while (number>0) {
                System.out.print(number+" ");
                if (number==i) {
                    incresing=false;
                }
                if (incresing==true) {
                    number++;
                }else{
                    number--;
                }
            }
            System.err.println();


        }
    }
}
