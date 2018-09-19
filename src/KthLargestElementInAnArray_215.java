import java.util.Arrays;

/**
 * Created by henry on 2018/9/17.
 */
public class KthLargestElementInAnArray_215 {
    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};

        KthLargestElementInAnArray_215 kle = new KthLargestElementInAnArray_215();
        System.out.println(kle.findKthLargest(nums, 2));
    }

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

}
