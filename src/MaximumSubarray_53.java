/**
 * Created by henry on 2020/10/19.
 */
public class MaximumSubarray_53 {
    public static void main(String[] args){
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray_53 ms = new MaximumSubarray_53();
        System.out.println(ms.maxSubArray(input));
    }

    public int maxSubArray(int[] nums) {
        int curMax = nums[0];
        int [] dp = new int[nums.length];  //dp[i] means the maximum subarray ending with A[i];
        dp[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
            curMax = Math.max(curMax, dp[i]);
        }

        return curMax;
    }
}
