/**
 * Created by henry on 2018/9/6.
 */
public class HouseRobber_198 {
    public static void main(String[] args){
        int[] input = {2,7,9,3,1};
        HouseRobber_198 hr = new HouseRobber_198();
        System.out.println(hr.rob(input));
    }

    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        if(len == 1) return nums[0];
        if(len == 2) return Math.max(nums[0], nums[1]);

        nums[2] += nums[0];
        for(int i=3; i<len; i++){
            nums[i] += Math.max(nums[i-2], nums[i-3]);
        }

        return Math.max(nums[len-1], nums[len-2]);
    }

/*    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0],nums[1]);

        nums[2] += nums[0];
        for(int i=3; i<nums.length; i++){
            nums[i] += Math.max(nums[i-2], nums[i-3]);
        }
        return Math.max(nums[n-1], nums[n-2]);
    }*/
}
