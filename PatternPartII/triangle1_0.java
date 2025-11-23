package PatternPartII;

public class triangle1_0 {
    public static void triangle(int n){

        for(int r=1;r<=n;r++){
            for(int c=1;c<=n;c++){
                if (r-c>=0) {
                    if (r-c==1||r-c==3) {
                        System.out.print("0"+" ");
                    }else{
                        System.err.print("1"+" ");
                    }
                    
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        triangle(5);
        
    }
    
}
