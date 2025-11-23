package Arrays2D;

public class Que1 {
    public static void Quetion1(int array[][]){
        int key=8;
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if (array[i][j]==key) {
                    count++;
                }
            }
        }
        System.out.println("count of "+key+" in array :"+count);
    }


    public static void Quetion2(int nums[][]){
        int sum =0;
        //sum of 2nd row elements
        for(int j=0;j<nums[0].length;j++){
            sum=sum+nums[0][j];
        }
        System.out.println("Sum is: "+sum);
    }
    public static void main(String[] args) {
        int [][]array={{4,7,8},{8,8,7}};
        // Quetion1(array);

        int nums [][]={{1,4,9},{11,4,3},{2,2,3}};
        Quetion2(nums);
       
    }
}
