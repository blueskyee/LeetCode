import java.util.Arrays;

/**
 * Created by henry on 2021/1/21.
 */
public class CombinationSumIV_377 {
    public static void main(String[] args){
        int[] input = {1, 2, 3};
        int target = 4;
        CombinationSumIV_377 cs = new CombinationSumIV_377();
        System.out.println(cs.combinationSum4(input, target));
    }

    int[] dp;
    public int combinationSum4(int[] nums, int target) {
        dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return calculate(nums, target);
    }

    private int calculate(int[] nums, int target){
        //has been calculated before
        if(dp[target] != -1) return dp[target];

        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(target >= nums[i]){
                res += calculate(nums, target - nums[i]);
            }
        }
        dp[target] = res;
        return dp[target];
    }

    //recursive: Time Limit Exceeded
    /*public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        return calculate(nums, target);
    }

    private int calculate(int[] nums, int target){
        if(target == 0) return 1;
        if(target < 0) return -1;

        int res = 0;
        for(int i = 0; i < nums.length; i++){
            int temp = combinationSum4(nums, target - nums[i]);
            if(temp < 0) break;
            res += temp;
        }

        return res;
    }*/
}
