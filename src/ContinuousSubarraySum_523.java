import java.util.HashMap;
import java.util.Map;

/**
 * Created by henry on 2021/3/22.
 */
public class ContinuousSubarraySum_523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int curSum = 0;
        for(int i = 0; i < nums.length; i++){
            curSum += nums[i];
            if(k != 0)
                curSum %= k;
            if(map.get(curSum) != null){
                if(i - map.get(curSum) > 1){
                    return true;
                }
            }else{
                map.put(curSum, i);
            }
        }
        return false;
    }

    /*public boolean checkSubarraySum(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int curSum = 0;
                for(int t = i; t <= j; t++){
                    curSum += nums[t];
                }
                if(curSum % k == 0)
                    return true;
            }
        }
        return false;
    }*/
}
