package PatternPartII;

public class invertPiramid {
    public static void invertTri(int n){
        
        for ( int row = 1;row<=n;row++) {
            for(int col=1;col<=n;col++){
                if (row+col>=n+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        invertTri(10);
    }
}
