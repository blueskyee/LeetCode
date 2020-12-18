import java.util.Arrays;

/**
 * Created by henry on 2020/12/18.
 */
public class MaximumProductofThreeNumbers_628 {
    public static void main(String[] args){
        int[] input = {5,1,2,3,4};
        MaximumProductofThreeNumbers_628 mp = new MaximumProductofThreeNumbers_628();
        System.out.println(mp.maximumProduct(input));
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        for(int i:nums){
            System.out.println(i);
        }

        return Math.max(nums[0]*nums[1]*nums[nums.length-1],
                nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
    }
}
