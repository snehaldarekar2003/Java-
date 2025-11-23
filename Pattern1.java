public class Pattern1 {
    //Print star pattern
    public static void main(String args[]){
        // for(int line =1;line<=4;line++){
        //     for(int star=1;star<=line;star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //xInverted pattern
        // int n = 10;
        // for(int i=1;i<=n;i++){
        //     for(int s=1;s<=n-i+1;s++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int line=1;line<=4;line++){
        //     for(int num=1;num<=line;num++){
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }

        //character pattern
        int n =4;
        char ch='A';
        for(int line=1;line<=n;line++){
            for(int chara=1;chara<=line;chara++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
