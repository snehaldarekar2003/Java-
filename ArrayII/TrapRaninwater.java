package ArrayII;

public class TrapRaninwater {
    public static void trapRainwater(int height[]){
        int n=height.length;
        //lf max boundry-arr
        
        int leftMax[]= new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //rt max boundry-arr
        int rightMax[]= new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }


        int trappWater=0;
        //loop
        for(int i=0;i<n;i++){
             //water level=min(lf bound,rt bound)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

             //traped water = water level-height[i]
            trappWater+=waterLevel-height[i];
        }
        System.out.println("Trapped Raniwater is: "+trappWater);
    
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        trapRainwater(height);
    }
}
