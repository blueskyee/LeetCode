/**
 * Created by henry on 2018/8/28.
 */
public class BestTime2BuyAndSellStockII_122 {
    public static void main(String[] args){
        int[] input = {1,2,3,4,5};
        BestTime2BuyAndSellStockII_122 bt = new BestTime2BuyAndSellStockII_122();
        System.out.println(bt.maxProfit(input));
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1; i< prices.length; i++){
            if(prices[i] > prices[i-1])
                profit += prices[i] - prices[i-1];
        }

        return profit;
    }
}
