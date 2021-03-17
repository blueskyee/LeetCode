/**
 * Created by henry on 2021/3/17.
 */
public class GuessNumberHigherorLower_374 {
    public int guessNumber(int n) {
        int hi = n, lo = 1;
        while(lo <= hi){
            int mid =  lo + (hi - lo) / 2;
            int res = guess(mid);
            if(res > 0)
                lo = mid + 1;
            else if(res < 0)
                hi = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    private int guess(int n){
        return 0;
    }
}
