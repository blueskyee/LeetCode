/**
 * Created by henry on 2020/12/16.
 */
public class BestTimetoBuyandSellStockII_122 {
    public static void main(String[] args){
        int[] input = {7,1,5,3,6,4};
        BestTimetoBuyandSellStockII_122 bt = new BestTimetoBuyandSellStockII_122();
        System.out.println(bt.maxProfit(input));
    }

    public int maxProfit(int[] prices) {
        //solution 3
        int totalProfit = 0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i+1] > prices[i])
                totalProfit += prices[i+1] - prices[i];
        }
        return totalProfit;

        //solution 2
        /*int curIdx = 0;
        int valley = 0;
        int peak = 0;
        int totalProfit = 0;
        while(curIdx < prices.length - 1){
            while (curIdx < prices.length - 1 && prices[curIdx] >= prices[curIdx+1])
                curIdx++;
            valley = prices[curIdx];
            while (curIdx < prices.length - 1 && prices[curIdx] <= prices[curIdx+1])
                curIdx++;
            peak = prices[curIdx];
            totalProfit += peak - valley;
        }

        return totalProfit;*/
    }
}
