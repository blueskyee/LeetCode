/**
 * Created by henry on 2021/1/22.
 */
public class HouseRobberII_213 {
    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        HouseRobberII_213 hr = new HouseRobberII_213();
        System.out.println(hr.rob(nums));
    }

    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] nums, int start, int end){
        int curInclude = 0, curExclude = 0;
        for(int i = start; i <= end; i++){
            int preInclude = curInclude, preExclude = curExclude;
            curInclude = preExclude + nums[i];
            curExclude = Math.max(preInclude, preExclude);
        }
        return Math.max(curInclude, curExclude);
    }
}
