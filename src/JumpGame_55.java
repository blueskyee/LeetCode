/**
 * Created by henry on 2021/1/25.
 */
public class JumpGame_55 {
    public static void main(String[] args){
        int[] nums = {2,3,1,1,4};
        JumpGame_55 jg = new JumpGame_55();
        System.out.println(jg.canJump(nums));
    }

    public boolean canJump(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        boolean[] dp = new boolean[nums.length];

        dp[0] = true;
        for(int i = 0; i < nums.length - 1; i++){
            if(dp[i]){
                int curMaxStep = nums[i];
                for(int j = 0; j <= curMaxStep && (i+j) < nums.length; j++){
                    dp[i+j] = true;
                }
            }
        }
        return dp[nums.length - 1];
    }
}
