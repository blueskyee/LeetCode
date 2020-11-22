/**
 * Created by henry on 2020/11/22.
 */
public class MaximumProductSubarray_152 {
    public static void main(String[] args){
        int[] input = {-2,0,-1};
        MaximumProductSubarray_152 mp = new MaximumProductSubarray_152();
        System.out.println(mp.maxProduct(input));
    }

    public int maxProduct(int[] nums) {
        //Its all about having odd or even numbers of negative integers.
        //if the negative numbers are even, then the first pass will give the solution.
        //If the negative numbers are odd, the second pass will give the solution.
        int prod = 1;
        int res = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            prod *= nums[i];
            res = Math.max(prod, res);
            if(prod == 0){
                prod = 1;
            }
        }

        prod = 1;
        for(int i=nums.length-1; i>=0; i--){
            prod *= nums[i];
            res = Math.max(prod, res);
            if(prod == 0){
                prod = 1;
            }
        }
        return res;

        //brute force
        /*int res = Integer.MIN_VALUE;
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
        return res;*/
    }
}
