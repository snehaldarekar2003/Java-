package ArrayII;

import PatternPartII.piryamid;

public class StockBuySell {
    public static int buyAndSell(int price[]){
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
             if (buyPrice<price[i]) {//profit
                int profit=price[i]-buyPrice;//current profit
                maxProfit=Math.max(maxProfit,profit);
                
             } else {
                buyPrice=price[i];
             }
             System.out.println(maxProfit);
        }
        System.out.println("Maximum profit is: "+maxProfit);
        return maxProfit;
        

    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        buyAndSell(price);
    }
}
