import java.util.Arrays;

/**
 * Created by henry on 2021/3/9.
 */
public class TargetSum_494 {
    public static void main(String[] args){
        int[] nums = {1, 1, 1, 1, 1};
        TargetSum_494 ts = new TargetSum_494();
        System.out.println(ts.findTargetSumWays(nums, 3));
    }

    int count = 0;
    public int findTargetSumWays(int[] nums, int S) {
        calculate(nums, 0, 0, S);
        return count;
    }
    public void calculate(int[] nums, int i, int sum, int S) {
        if (i == nums.length) {
            if (sum == S)
                count++;
        } else {
            calculate(nums, i + 1, sum + nums[i], S);
            calculate(nums, i + 1, sum - nums[i], S);
        }
    }

    //recursive version: time limit exceeded
    /*public int sumWays = 0;
    public int findTargetSumWays(int[] nums, int S) {
        boolean[] positive = new boolean[nums.length];
        backtrack(nums, S, 0, positive);
        return sumWays;
    }

    private void backtrack(int[] nums, int S, int start, boolean[] positive){
        if(isTargetSumWay(nums, positive, S))
            sumWays++;
        for(int i = start; i < nums.length; i++){
            positive[i] = true;
            backtrack(nums, S, i + 1, positive);
            positive[i] = false;
        }
    }

    private boolean isTargetSumWay(int[] nums, boolean[] positive, int S){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(positive[i])
                sum += nums[i];
            else
                sum -= nums[i];
        }
        return sum == S;
    }*/

}
