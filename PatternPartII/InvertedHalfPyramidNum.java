package PatternPartII;

public class InvertedHalfPyramidNum {
    public static void invertHalfPyramidNum(int n) {
        for ( int row = 1;row<=n;row++) {
                for(int col=1;col<=n-row+1;col++){
                //    int val=1;
                    System.out.print(col+" ");
                    // val=val+col;

                    
                }
                System.out.println();
                
            }
    }
    public static void main(String[] args) {
        invertHalfPyramidNum(5);
    }
}
