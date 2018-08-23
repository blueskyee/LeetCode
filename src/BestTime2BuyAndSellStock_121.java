/**
 * Created by henry on 2018/8/23.
 */
public class BestTime2BuyAndSellStock_121 {
    public static void main(String[] args){
        int[] input = {7,1,5,3,6,4};
        BestTime2BuyAndSellStock_121 bt = new BestTime2BuyAndSellStock_121();
        System.out.println(bt.maxProfit(input));
    }

    public int maxProfit(int[] prices) {
        int maxCur = 0;
        int maxHist = 0;
        for(int i=1; i<prices.length; i++){
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxHist = Math.max(maxCur, maxHist);
        }
        return maxHist;
    }
}
