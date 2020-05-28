import java.util.Arrays;

/**
 * Created by henry on 2020/5/28.
 */
public class MajorityElement_169 {

    public static void main(String[] args){
        int[] input = {2,2,1,1,1,2,2};
        MajorityElement_169 me = new MajorityElement_169();
        System.out.println(me.majorityElement(input));
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
