/**
 * Created by henry on 2021/2/16.
 */
public class KokoEatingBananas_875 {
    public static void main(String[] args){
        int[] input = {3,6,7,11};
        KokoEatingBananas_875 kk = new KokoEatingBananas_875();
        System.out.println(kk.minEatingSpeed(input, 8));
    }

    public int minEatingSpeed(int[] piles, int H) {
        int lo = 1, hi = maxPile(piles);
        while(lo <= hi){
            int K = lo + (hi - lo) / 2;
            if(canEatAll(piles, H, K)){
                hi = K - 1;
            }else{
                lo = K + 1;
            }
        }
        return lo;
    }

    private int maxPile(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int pile:piles){
            max = Math.max(max, pile);
        }
        return max;
    }

    private boolean canEatAll(int[] piles, int H, int K){
        int totalHour = 0;
        for(int pile: piles){
            totalHour += pile / K;
            if(pile % K != 0)
                totalHour++;
        }
        return totalHour <= H;
    }
}
