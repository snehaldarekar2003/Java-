public class SimplePattern {
    public static void main(String[] args) {
        //S pattern
        // int n =5;
        // for (int r = 1; r<=n; r++) {
        //     for(int c=1;c<=n;c++){
        //         if (r==1||r==3||r==5||(c==5&&r==4)||(c==1&&r==2)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }

        //     }
        //     System.out.println();
        // }

        //Bottom Left Triangele
        // int n = 10;
        // for ( int row = 1;row<=n;row++) {
        //     for(int col=1;col<=n;col++){
        //         if (row-col>=0) {
        //             System.out.print("*");
        //         } else {
        //             // System.out.print(" ");//comment out this line of code to ptint bottom right triangle
        //         }
        //     }
        //     System.out.println();
            
        // }

        // //top Left Triangele
        // int n = 10;
        // for ( int row = 1;row<=n;row++) {
        //     for(int col=1;col<=n;col++){
        //         if (row-col<=0) {
        //             System.out.print("*");
        //         } else {
        //             // System.out.print(" ");  //comment out this line of coed to print top rigth triangle
        //         }
        //     }
        //     System.out.println();
            
        // }

        //Bottom right Triangele
        // int n = 10;
        // for ( int row = 1;row<=n;row++) {
        //     for(int col=1;col<=n;col++){
        //         if (row+col>=n-1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
            
        // }

        //Count triangle
        int n = 5;
        for(int row=1;row<=n;row++){
            int val=1;
            for(int col=1;col<=n;col++){
                if (row-col>=0) {
                    System.out.print(val+" ");
                    val++;
                
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //X pattern//Butterfly pattern
        // int n = 5;
        // for ( int row = 1;row<=n;row++) {
        //     for(int col=1;col<=n;col++){
        //         if ((row-col==0)||(row+col==(n+1))||(col==1||col==n)||(row==n/2+1)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
            
        // }

        //Hollw Square
        // int n=7;
        // for(int r=1;r<=n;r++){
        //     for(int c=1;c<=n;c++){
        //         if ((r==1||c==1)||(r==n||c==n)) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for(int i=5;i>=1;i--){
        //     for(int j=5;j>=i;j--){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }






    }
}
