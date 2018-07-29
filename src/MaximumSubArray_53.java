/**
 * Created by henry on 2018/7/29.
 */
public class MaximumSubArray_53 {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubArray_53 ms = new MaximumSubArray_53();
        System.out.println(ms.maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        //check every elements > 0
        boolean atLeastOneBigThanZero = false;
        int max = nums[0];
        for (int i=1; i<nums.length; i++){
            if(nums[i] > 0){
                atLeastOneBigThanZero = true;
                break;
            } else{
                max = Math.max(nums[i], max);
            }
        }
        if(!atLeastOneBigThanZero)
            return max;

        //
        int sum = 0;
        max = nums[0];
        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            sum = Math.max(0, sum);
            max = Math.max(max, sum);
        }
        return max;
    }
}
