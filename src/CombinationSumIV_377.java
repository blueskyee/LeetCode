/**
 * Created by henry on 2021/1/21.
 */
public class CombinationSumIV_377 {
    public static void main(String[] args){
        int[] input = {1, 2, 3};
        int target = 4;
        CombinationSumIV_377 cs = new CombinationSumIV_377();
        System.out.println(cs.combinationSum4(input, target));
    }

    //recursive: Time Limit Exceeded
    public int combinationSum4(int[] nums, int target) {
        if(target == 0) return 1;
        if(target < 0) return 0;

        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res += combinationSum4(nums, target - nums[i]);
        }

        return res;
    }
}
