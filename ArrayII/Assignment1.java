package ArrayII;

public class Assignment1 {

    public static boolean Duplicate(int num[]){
        int n= num.length;
        boolean result=false;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if (num[i]==num[j]) {
                    result =true;
                }
            }

        }
        System.out.println(result);
        return result;
        
    }
    public static void main(String[] args) {
        int num[]={2,3,7,2,8,9};
        Duplicate(num);
    }
}
