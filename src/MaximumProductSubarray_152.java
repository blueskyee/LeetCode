/**
 * Created by henry on 2020/11/22.
 */
public class MaximumProductSubarray_152 {
    public static void main(String[] args){
        int[] input = {-2};
        MaximumProductSubarray_152 mp = new MaximumProductSubarray_152();
        System.out.println(mp.maxProduct(input));
    }

    public int maxProduct(int[] nums) {


        //brute force
        int res = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int curMax = nums[i];
            if(res < curMax){
                res = curMax;
            }
            for(int j=i+1; j<nums.length; j++){
                curMax *= nums[j];
                if(res < curMax){
                    res = curMax;
                }
            }
        }
        return res;
    }
}
