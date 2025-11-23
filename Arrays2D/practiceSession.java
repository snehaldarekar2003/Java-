package Arrays2D;

public class practiceSession {

    //linear search 
    //brute code
    public static boolean BruteCode(int  nums[][],int target){
        int rows=nums.length;
        int cols=nums[0].length;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(nums[r][c]==target){
                    return true;
                }
            }
        }
        
        return false;

    }

    public static boolean binarySearch(int nums[][],int target){
        int rows=nums.length;
        int cols=nums[0].length;
        for(int r=0;r<nums.length;r++){
            int left=0 , right=nums[0].length-1;
            while (left<=right) {
                int mid=left+right/2;
                if (nums[r][mid]==target) {
                    System.out.println("found key at ("+r+","+mid+")");
                    return true;
                }else if (nums[r][mid]<target) {
                    left=mid+1;
                }else{
                    right=mid-1;
                }
                
            }
           

        }
         System.out.println("element not found");
        return false;
    }

    //STAIRECASE/STEPCASE SEARCH

    public static boolean StarecaseSearch(int nums[][],int target){
        int row=0,col=nums[0].length-1;

        while (row<nums.length && col>=0) {
            if (nums[row][col]==target) {
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if (target<nums[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;

    }
    

    public static void main(String[] args) {
        int nums[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int target=0;
        binarySearch(nums, target);
    }
}
