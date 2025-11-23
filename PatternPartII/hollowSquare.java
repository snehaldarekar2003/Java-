package PatternPartII;

public class hollowSquare {

    public static void hollowRec(int n, int m){
        
        for(int r=1;r<=n;r++){
            for(int c=1;c<=m;c++){
                if ((r==1||c==1)||(r==n||c==m)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
         
        hollowRec(10,20);
    }
}
